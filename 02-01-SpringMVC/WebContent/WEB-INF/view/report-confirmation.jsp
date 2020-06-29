<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Report Confirmation Page</title>
</head>

<body>
	
The Report is confirmed: ${report.reportName} ${report.reportCode}

<br><br>

Report Country : ${report.country}

<br><br>

Report Type : ${report.reportType}


<br><br>

Report Owner(s) : 

<ul>
	<c:forEach var="temp" items="${report.reportOwner}">
		<li> ${temp} </li>
	</c:forEach>
</ul>

	
</body>

</html>