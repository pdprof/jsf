<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<body>
<f:view>
helloBean.message : <br />
<h:outputText value="#{helloBean.message}" /><br />
<hr />
<h:form>
<h:messages style="color:red" />
<h:outputText value="#{res.inputMessage}" /> <br />
<h:inputText id="message" value="#{helloBean.message}" required="true" /><br />
<h:commandButton id="button" value="Send" action="index.jsp" />
</h:form>
</f:view>
</body>
</html>