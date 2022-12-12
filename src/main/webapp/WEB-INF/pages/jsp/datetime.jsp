<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:p="http://primefaces.org/ui"
	xmlns:t="http://myfaces.apache.org/tomahawk">

<f:view>

	<h:form id="form">
		<p:panel header="Time Zone">

			<t:panelGrid columns="2">

				<h:outputText value="Current Date:" style="font-weight:600; width:600px;" />
				<h:outputText
					value="#{datetimeController.currentDateTime.currentDate}" />
			
				<br></br>
				<h:outputText value="Current Time:" style="font-weight:600; width:600px;" />
				<h:outputText
					value="#{datetimeController.currentDateTime.currentTime}" />

				<br></br>
				<h:commandButton value="Home" action="#{datetimeController.home}"
					style="background:#2196f3;color:white;width:100px;height:35px;border-radius:4px;" />

			</t:panelGrid>

		</p:panel>
	</h:form>

</f:view>
</html>
