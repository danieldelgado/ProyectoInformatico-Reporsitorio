<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Testcomponente</b> portlet.

<br>


<portlet:resourceURL var='myInfo' id='myInfo' />
<portlet:resourceURL var='ajaxtagstest' id='ajaxtagstest' />


<div class="bs-example">
    <p>Type some character -</p>
    <input type="text" data-provide="typeahead" 
    data-source='["Red", "Green", "Blue", "Black", "Yellow", "Orange", "Brown", "Olive", "Gray", "Purple", "White"]'>
</div>

