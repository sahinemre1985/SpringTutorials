<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Report Form</title>
</head>

<body>
	<h2>Report Form</h2>
	
	<form:form action="processForm" modelAttribute="report">
	
	Report Name: <form:input path="reportName"/>
	
	<br><br>
	
	Report Code: <form:input path="reportCode"/>
	
	<br><br>
	
	Report Country :
	
	<form:select path="country">
	
		<form:options items="${report.countryOptions}"/>

		
	</form:select>
	
	<br><br>
	
	Report Type :
	
	<br><br>
	
	Report Owner(s) :
	
	
	<input type="submit" value="Submit" />
	
	</form:form>
	
</body>

</html>