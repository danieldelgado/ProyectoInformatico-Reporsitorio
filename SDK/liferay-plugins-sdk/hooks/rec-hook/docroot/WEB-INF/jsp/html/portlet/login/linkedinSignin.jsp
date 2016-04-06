<%--
/**
 * Copyright (c) 2013  Componence Services B.V.(Inc), All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Componence Services B.V
 *
 */
--%>

<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<style>
/* #linkedinForm {float: left; width: 73%;} */
/* .linkedinProfileImgContainer {float: left; margin-top: 5px; width: 25%;} */
/* #linkedinForm .aui-field-label { float:left; width:130px;} */
/* #linkedinForm .aui-field-content { margin:5px 0px;} */
/* #linkedinForm .aui-field-content input.aui-field-input-text { width:200px;} */
/* .linkedinPopupAuthMsg{display: inline; float: left; text-align: center; width: 100%;} */
/* #linkedinForm .yui3-widget-ft { display: none;} */
/* span.IN-widget, */
/* #linkedinForm .dateOfBirthContainer .aui-datepicker-select-wrapper {float: left; } */
/* #linkedinForm .dateOfBirthContainer{display : block; width: 100%;} */
/* #linkedinForm .aui-datepicker-select-wrapper select {margin-left: 0px;} */
</style>
<script type="text/javascript" src="http://platform.linkedin.com/in.js?async=true">
</script>

<script type="text/javascript">
	IN.init({
		api_key: "<%=apiKey%>", 
		credentials_cookie: false,
		authorize : <%=linkedInAutoLoginEnabled%>,
		onLoad : "onLinkedInLoad",
		scope : "r_basicprofile r_emailaddress "
	});
	  
	/*function logout(){
		IN.User.logout(onLinkedInLogout);
	}*/
	function onLinkedInLogout(){
		window.location='<%=themeDisplay.getURLHome()%>';
	}

</script>

<script type="IN/Login"></script>
<portlet:resourceURL var="linkedInUserExistanceCheck">
	<portlet:param name="struts_action" value="/login/linkedinsignin" />
</portlet:resourceURL>
<script language="javascript" type="text/javascript">
	var authenticationProcessDialog;
	if(<%=linkedInAutoLoginEnabled%>){
		AUI().use("aui-node","aui-modal", function(A){
			A.one("#linkedInFormContainer").hide();
			authenticationProcessDialog = new A.Modal({
				bodyContent: "<div class='linkedinPopupAuthMsg'><liferay-ui:message key='linkedin-login-indication-msg' /><img src='/html/themes/classic/images/aui/loading_indicator.gif'/></div>",
				centered: true,
// 				constrain2view: true,
				destroyOnClose: true,
				draggable: true,
				height: 'auto',
				resizable: true,
				stack: true,
				title: "LinkedIn <liferay-ui:message key='login' />",
				width: 500,
				close: false,
				modal: true
			});
		});
	}
	function onLinkedInLoad() {
		IN.Event.on(IN, "auth", onLinkedInAuth);
		IN.Event.on(IN, "frameworkLoaded", function(){
			if(IN.User.isAuthorized()){
				if(authenticationProcessDialog){
					console.log("render 77");
					authenticationProcessDialog.render();
				}
			};
		}); 
	//	IN.Event.on(IN, "logout", function() {onLinkedInLogout();});
	}

	function onLinkedInAuth() {
		
		IN.API.Raw("/people/~:(id,num-connections,picture-url,skills)?format=json").result(function(result){
			console.log(result);
		}).error(function(result){
			console.log(result);			
		});
		
		
		IN.API.Profile("me").fields(
				"id",
				"firstName",
				"maiden-name", 
				"lastName",
				"date-of-birth", 
				"industry",
				"languages", 
				"pictureUrl", 
				"publicProfileUrl",
				"positions", 
				"main-address",
				"location:(name,country,postal-code)",				
				"email-address").result(
				function(result){
					console.log(result);
					displayProfile(result.values[0]);
				}
			)
		.error(function(err){
			console.log(err);
		});
	}

	function onLinkedInLogout() {
	
	}

	function displayProfile(profile) {
		if(profile){
			AUI().use("aui-node", "aui-io-request", function(A){
				var path="<%=linkedInUserExistanceCheck%>";
				A.io.request(path, {
					method: 'POST',  
					data: { idIn: profile['id'] }, 
					 on: {
						success: function() {   
							if(this.get('responseData')=="existingUser"){
								window.location = "<%=themeDisplay.getURLSignIn()%>";
							}else{
								processLinkedInProfile(profile);
							}
						  },
						failure : function() { 
							processLinkedInProfile(profile);
						  }
					 }
				});
			});
		}
	}
	function processLinkedInProfile(profile){
		AUI().use("aui-node","aui-modal", function(A){
			var form = A.one('#linkedinForm');
			var bDay = 01;
			var bMonth = 01;
			var bYear = 1970;
			A.one("#<portlet:namespace/>idIn").val(profile['id']);
			A.one("#<portlet:namespace/>firstNameIn").val(profile['firstName']);
			A.one("#<portlet:namespace/>lastNameIn").val(profile['lastName']);
			A.one("#<portlet:namespace/>genderIn").val(profile['gender']);
			try {
				if(profile['positions']){
					A.one("#<portlet:namespace/>industryIn").val(profile['positions'].values[0]['company']['industry']);
					A.one("#<portlet:namespace/>companyIdIn").val(profile['positions'].values[0]['company']['id']);
					A.one("#<portlet:namespace/>companyNameIn").val(profile['positions'].values[0]['company']['name']);
					A.one("#<portlet:namespace/>positionsIn").val(profile['positions'].values[0]['title']);
					//	   A.one("#languageIn").val(profile['languages'].values[0]['language']['name']);
				}
			}catch(e){
				//console.log("coudn't get positions");
			}
			
			A.one("#<portlet:namespace/>publicProfileUrlIn").val(profile['publicProfileUrl']);
			if(profile['pictureUrl']){
				A.one("#<portlet:namespace/>pictureUrlIn").val(profile['pictureUrl']);
				A.one("#linkedinProfileImg").set("src",profile['pictureUrl']);
				A.one("#linkedinProfileImg").setStyle('display', 'block');
			}
			if(profile['emailAddress']){
				A.one("#<portlet:namespace/>emailIn").val(profile['emailAddress']);
			}
			try {
				if(profile['dateOfBirth']){
					if(profile['dateOfBirth']['day']){
						bDay = profile['dateOfBirth']['day'];
					}
					if(profile['dateOfBirth']['month']){
						bMonth = profile['dateOfBirth']['month'];
					}
					if(profile['dateOfBirth']['year']){
						bYear = profile['dateOfBirth']['year'];
					}
					var bDate = bMonth+"/"+bDay+"/"+bYear;
					AUI().use('aui-datepicker', function(A) {
						console.log("render 202");
					   new A.DatePicker({
 							trigger: '#<portlet:namespace />datePickerDB',
						   
					        appendOrder: [ 'd', 'm', 'y' ],
					        calendar: {
					            dates: [ bDate],
					            dateFormat: '%d/%m/%y',
					            locale: '<%= themeDisplay.getLocale().toString() %>'
					        },

							popover: {
		                        zIndex: 1
		                     },
					        nullableDay: false,
					        nullableMonth: false,
					        nullableYear: false,
					        yearRange: [ bYear-60, (new Date).getFullYear()]
					    });
					});
				}else{
					AUI().use('aui-datepicker', function(A) {
						console.log("render 221");
					   new A.DatePicker({
						   trigger: '#<portlet:namespace />datePickerDB',						   
					        appendOrder: [ 'd', 'm', 'y' ],
					        calendar: {
					            dates: ['01/01/1970'],
					            dateFormat: '%m/%d/%y',
					            locale: '<%=themeDisplay.getLocale().toString()%>'
					        },

							popover: {
		                        zIndex: 1
		                     },
					        nullableDay: false,
					        nullableMonth: false,
					        nullableYear: false,
					        yearRange: [ 1900, (new Date).getFullYear()]
					    });
					});
				}
			}catch(e){
				//console.log("coudn't get date of birth"+e);
			}
			A.one("#<portlet:namespace/>locationIn").val(profile['location'].name);
			if(<%=linkedInProfileFormPopupEnabled%>){
				if(authenticationProcessDialog){
					authenticationProcessDialog.close();
				}
				console.log("render 247");
				new A.Modal({
					srcNode : "#linkedInFormMainContainer",
					render: '#modal',
					centered: true,
// 					constrain2view: true,
					destroyOnHide: true,
// 					draggable: true,
					height: 'auto',
// 					resizable: true,
					stack: true,					
					headerContent: "LinkedIn <liferay-ui:message key='profile' /> <liferay-ui:message key='data' />",
					width: 500,
					close: false,
					modal: true
				}).render();
				A.one("#linkedInFormContainer").show();
			}else{
				form.append('<input type="hidden" value="'+bDay+'" name="day"/>');
				form.append('<input type="hidden" value="'+bMonth - 1 +'" name="month"/>');
				form.append('<input type="hidden" value="'+bYear+'" name="year"/>');
				form.submit();
			}
		});
	}
</script>
<!-- sending values of linkedIn user to display portlet  -->

<div id="linkedinEventStatus"></div>
<portlet:actionURL var="linkedInLoginUrl">
	<portlet:param name="struts_action" value="/login/linkedinsignin" />
</portlet:actionURL>
<div id="modal"></div>
<div class="aui3-skin-sam">
	<div id="linkedInFormContainer" style="display: none">
		<div id="linkedInFormMainContainer">
			<form name="<portlet:namespace/>linkedinForm" id="linkedinForm" class="" method="post" action="<%=linkedInLoginUrl%>">
				<aui:fieldset>
					<div class="container-fluid">
						<div class="linkedinProfileImgContainer">
							<img id="linkedinProfileImg" src="" style="display: none;">
						</div>
						<div class="row-fluid">

							<div class="span6" id="">
								<aui:input id="idIn" label="idIn" name='idIn' type="hidden" value="" />
								<aui:input id="firstNameIn" label="first-name" name="firstNameIn" type="text" value="" readonly="readonly" />
								<aui:input id="maidenName" label="middle-name" name='maidenName' type="text" value="" />
								<aui:input id="lastNameIn" label="last-name" name='lastNameIn' type="text" value="" />

								<aui:select id="genderIn" label="gender" name="gender">
									<aui:option label="male" value="true" />
									<aui:option label="female" value="false" />
								</aui:select>
								
								<div class="control-group">
									<span class="aui-field-label" id="<portlet:namespace/>birthDayLabel"> <liferay-ui:message key="birthday" />
									</span> <input type="text" name="dataFine" id="<portlet:namespace />datePickerDB" size="30" />
								</div>
								<aui:input id="emailIn" label="email-address" name='emailIn' type="text" value="" readonly="readonly" />
								
							</div>

							<div class="span6" id="">
								<aui:input id="industryIn" label="industry" name='industryIn' type="text" value="" readonly="readonly" />
								<aui:input id="languageIn" label="languageIn" name='languageIn' type="hidden" value="" />
								<aui:input id="pictureUrlIn" label="pictureUrlIn" name='pictureUrlIn' type="hidden" value="" />
								<aui:input id="publicProfileUrlIn" label="Perfl Público" name='publicProfileUrlIn' ype="text" value="" readonly="readonly"  />
								<aui:input id="locationIn" label="location" name='locationIn' type="text" value="" />
								<aui:input id="companyIdIn" label="companyIdIn" name='companyIdIn' type="hidden" value=""  />
								<aui:input id="companyNameIn" label="company" name='companyNameIn' type="text" value="" readonly="readonly" />
								

								<aui:input id="positionsIn" label="position" name='positionsIn' type="text" value="" readonly="readonly" />


								
							</div>

						</div>
						<aui:button type="button" cssClass="btn btn-primary" value="Unirme" 
						onclick="this.form.submit();"  />

					</div>
				</aui:fieldset>
			</form>

		</div>
	</div>
</div>
