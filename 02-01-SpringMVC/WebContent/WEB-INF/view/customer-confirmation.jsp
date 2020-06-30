<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title> Customer Confirmation Page</title>
	
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Rating Note is: ${customer.ratingNote}

<br><br>

Postal Code is: ${customer.postalCode}

</body>

</html>