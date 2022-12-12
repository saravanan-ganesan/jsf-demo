<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:p="http://primefaces.org/ui">

<f:view>

	<h:form id="form">
		<p:panel header="Time Zone">
			<h:panelGrid columns="2">

				<h:outputText value="Server Time Zone:"
					style="font-weight:600; width:600px;" />
				<h:outputText value="#{timezoneController.timezone.currentTimeZone}" />

				<h:outputText value="Current Time:"
					style="font-weight:600; width:600px;" />
				<h:outputText value="#{timezoneController.timezone.currentTime}" />

				<h:commandButton value="Home" action="#{timezoneController.home}"
					style="background:#2196f3;color:white;width:100px;height:35px;border-radius:4px;" />


			</h:panelGrid>
			
		</p:panel>
	</h:form>

</f:view>
</html>
