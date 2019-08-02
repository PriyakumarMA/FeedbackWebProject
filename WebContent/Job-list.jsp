<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>JOB APPLICATION</title>
</head>

<body>
	<h1>Job Management</h1>
	<div align="center">
		<table border="1">
			<tr>
				<th>CompanyName</th>
				<th>AppointmentDay</th>
				<th>ConsultPerson</th>
				<th>Requirements</th>
				<th>Comments</th>
				<th>Delete</th>
			</tr>

			<c:forEach var="job" items="${listJOB}">
				<tr>
					<td>${job.companyName}</td>
					<td>${job.appointmentDay}</td>
					<td>${job.consultPerson}</td>
					<td>${job.requirements}</td>
					<td>${job.comments}</td>
					 <td><a href="DeleteJobServlet?id=<c:out value='${job.id}'/>">Delete</span></a></td>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>
</html>