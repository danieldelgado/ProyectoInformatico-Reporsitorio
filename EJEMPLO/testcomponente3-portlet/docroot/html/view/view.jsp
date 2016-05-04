<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>


<portlet:defineObjects />
<liferay-theme:defineObjects/>


<div>
<div id="myCarousel">
  <div class="carousel-item" style="">
  		<img alt="1" src="http://placehold.it/1200x400.jpg">
  </div>
  <div class="carousel-item" style="">
  		<img alt="1" src="http://placehold.it/1201x400.jpg">
  </div>
  <div class="carousel-item" style="">
  		<img alt="1" src="http://placehold.it/1202x400.jpg">
  </div>
  <div class="carousel-item" style="">
  		<img alt="1" src="http://placehold.it/1203x400.jpg">
  </div>
</div>
</div>
<aui:script>
 AUI().use(
   'aui-carousel',
   function(Y) {
    new Y.Carousel(
      {
        contentBox: '#myCarousel',
        height: 400,
        width: '100%'
      }
    ).render();
  }
);
</aui:script>

<div>

<liferay-ui:tabs names="tab1,tab2,tab3,nueva 4" refresh="false" tabsValues="tab1,tab2,tab3,tab4">
    <liferay-ui:section>
        Text for Tab 1.
        
        <liferay-ui:icon-menu>
        <liferay-ui:icon iconCssClass="icon-user" message="Use" url="www.liferay.com" />
        <liferay-ui:icon iconCssClass="icon-film" message="Film" url="www.liferay.com" />
        <liferay-ui:icon iconCssClass="icon-edit" message="Edit" url="www.liferay.com" />
        <liferay-ui:icon iconCssClass="icon-trash" message="Trash" url="www.liferay.com" />
    </liferay-ui:icon-menu>
        
        
    </liferay-ui:section>
    <liferay-ui:section>
        <liferay-ui:icon image="add" url="http://www.liferay.com" /> Text for Tab 2. <liferay-ui:icon image="add"/>
        
        
        
    </liferay-ui:section>
    <liferay-ui:section>
        Text for Tab 3.
        
        <liferay-ui:input-time-zone
		    name="timezone"
		    value="Europe/Paris"
		    displayStyle="0"
		/>
        
    </liferay-ui:section>
    <liferay-ui:section>
        Text for Tab 4.
          <liferay-ui:icon-list>
        <liferay-ui:icon image="status_online" message="Sign In" url="www.liferay.com"/>
        <liferay-ui:icon image="edit" message="edit" url="www.liferay.com"/>
        <liferay-ui:icon image="add_article" message="Add Article" url="www.liferay.com"/>
    </liferay-ui:icon-list>
        
        
    </liferay-ui:section>
</liferay-ui:tabs>


</div>




<form class="form-inline">
    <input id="myInput" class="form-control" type="text">
    <label class="control-label">
        <span id="myCounter"></span> character(s) remaining
    </label>
</form>

<br>
<br>
<br>

<aui:script>
 AUI().use(
		  'aui-char-counter',
		  function(Y) {
		    new Y.CharCounter(
		      {
		        counter: '#myCounter',
		        input: '#myInput',
		        maxLength: 10
		      }
		    );
		  }
		);
</aui:script>
<br>
<br>

<div id="container"></div>

<aui:form>
    <aui:fieldset>
        <aui:input name="verb" id="verb" type="text">
            <aui:validator name="required"/>
        </aui:input>
        <aui:button type="submit" class="btn btn-primary" id="submit" value="Generate"/>
    </aui:fieldset>
</aui:form>

<aui:script use="event, node">
    var btnSubmit = A.one("#submit");

    var verb = A.one("#<portlet:namespace />verb");

    var container = A.one("#container");

    btnSubmit.on('click', function(event){

        ver = verb.val();

        container.append('<p id="phrase"></p>');

        phrase= A.one("#phrase");

        if (ver != '') {
            phrase.html('Phrase: ' + ver); 
        }

    });
</aui:script>



<br>
<br>


<aui:script use="event, node">
    var btnSubmit = A.one("#submit");

    var verb = A.one("#<portlet:namespace />verb");
    var adj = A.one("#<portlet:namespace />adj");
    var mam = A.one("#<portlet:namespace />ani"); 
    var adv = A.one("#<portlet:namespace />adv");
    var loc = A.one("#<portlet:namespace />loc");
    var container = A.one("#container");

    btnSubmit.on('click', function(event){

        ver = verb.val();
        adje = adj.val();
        adve = adv.val();
        mama = mam.val();
        loca = loc.val();

        container.append('<p id="phrase"></p>');

        phrase= A.one("#phrase");
        phrase.addClass('phrase');

        if (ver != '' && adje != '' && adve != '' && mama != '' && loca != '') {
            phrase.html('Your silly phrase of the day is:<br>' + '"' + ver + 
            ' your ' + adje + ' ' + mama + ' ' + adve + ' in the ' + loca + '."'); 
        }
    });

    var title = A.one("#phraseTitle");
    var button = A.one("#button");
    var hide = true;

    button.on('click', function(event){
        if(hide){
            title.hide();
            hide = false;
            button.text('Show Title');
        }
        else if(!hide){
            title.show();
            hide = true;
            button.text('Hide Title');
        }
    });
</aui:script>

<p id="phraseTitle">Silly Phrase Generator</p>
<div id="container"></div>
 <aui:form>
 <aui:fieldset>
    <aui:input name="adjective" id="adj" type="text">
        <aui:validator name="required"/>
    </aui:input>
    <aui:input name="verb" id="verb" type="text">
        <aui:validator name="required"/>
    </aui:input>
    <aui:input name="adverb" id="adv" type="text">
        <aui:validator name="required"/>
    </aui:input>
    <aui:input name="animal" id="ani" type="text">
        <aui:validator name="required"/>
    </aui:input>
    <aui:input name="location" id="loc" type="text">
        <aui:validator name="required"/>
    </aui:input>
    <aui:button type="submit" class="btn btn-primary" id="submit" value="Generate"/>
    <aui:button id="button" value="Hide Title"/>
    </aui:fieldset>
  </aui:form>

<br>
<br>




