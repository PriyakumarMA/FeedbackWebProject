<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOB FORM</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script>
	function validateText1() {

		var inputText = document.getElementById("companyname");
		if (!inputText.checkValidity()) {
			document.getElementById("companynameOutput").innerHTML = inputText.validationMessage;
		} else {
			document.getElementById("companynameOutput").innerHTML = "Input OK";
		}
	}

	function validateText2() {

		var inputText = document.getElementById("appointmentday");
		if (!inputText.checkValidity()) {
			document.getElementById("appointmentdayOutput").innerHTML = inputText.validationMessage;
		} else {
			document.getElementById("appointmentdayOutput").innerHTML = "Input OK";
		}
	}

	function validateText3() {

		var inputText = document.getElementById("consultperson");
		if (!inputText.checkValidity()) {
			document.getElementById("consultpersonOutput").innerHTML = inputText.validationMessage;
		} else {
			document.getElementById("consultpersonOutput").innerHTML = "Input OK";
		}
	}

	function validateText4() {

		var inputText = document.getElementById("requirements");
		if (!inputText.checkValidity()) {
			document.getElementById("requirementsOutput").innerHTML = inputText.validationMessage;
		} else {
			document.getElementById("requirementsOutput").innerHTML = "Input OK";
		}
	}

	function validateText5() {

		var inputText = document.getElementById("comments");
		if (!inputText.checkValidity()) {
			document.getElementById("commentsOutput").innerHTML = inputText.validationMessage;
		} else {
			document.getElementById("commentsOutput").innerHTML = "Input OK";
		}
	}
</script>
</head>
<body>

	<div class="container"
		style="width: 70%; box-shadow: 10px 10px 8px 10px rgba(233, 30, 99, 0.7); box-shadow: 1px 0px 7px 3px rgba(63, 81, 181, 0.7); margin-top: 28px; border: 1px solid rgba(63, 81, 181, 0.7);">
		<center>
			<h1 style=" color:red;font-family: monospace">RESUME</h1>
		</center>
		<center>
			<div class="container">
		</center>
		<a href="#id1"><span class="badge badge-pill badge-primary">Objective</span></a>
		<a href="#ed"><span class="badge badge-pill badge-secondary">Education</span></a>
		<a href="#sk"><span class="badge badge-pill badge-success">Skills</span></a>
		<a href="#in"><span class="badge badge-pill badge-danger">Interest</span></a>
		<a href="#pd"><span class="badge badge-pill badge-warning">Personaldetails</span></a> 
		


		<h4 style="color: rgb(17, 124, 167)">PRIYA KUMAR MA</h4>
		<h5>Telecommunication</h5>
		<h5 style="text-align: right">
			Address:#99,100feet ringroad,<br> micolayout,bangalore-560029
		</h5>
		<h5 style="text-align: right">Email.id:priyakumar.pk20@gmail.com</h5>
		<h5 style="text-align: right">Contact number:9591933216</h5>
		<hr>
		<h4 id="id1">
			<span class="badge badge-pill badge-primary">Objective</span>
		</h4>
		<h6>Fresher seeking for a job,ready to take new task,can do best
			for an origanization</h6>
		<hr>
		<h4 id="ed">
			<span class="badge badge-pill badge-secondary">Education</span>
		</h4>
		<table class="table table-blue" style="padding-left: 25px">
			<thead>
				<tr class="table-success">
					<th scope="col"></th>
					<th scope="col">QUALIFICATION</th>
					<th scope="col">UNIVERSITY</th>
					<th scope="col">PERCENTAGE</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>BE</td>
					<td>VTU</td>
					<td>7.2CGPA</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>2nd PUC</td>
					<td>Pre-University</td>
					<td>72%</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>10th</td>
					<td>SSLC Board</td>
					<td>86%</td>
				</tr>
			</tbody>
		</table>

		<hr>
		<h4 id="sk">
			<span class="badge badge-pill badge-success">Skills</span>
		</h4>
		<table class="table table-sm table-blue">
			<thead>
				<tr class="table-warning">
					<th scope="col"></th>
					<th scope="col">programming Skills</th>
					<th scope="col">C,C++,HTML,MATLAB,HDL</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-danger">
	                <th scope="col"></th>
					<th scope="col">Designing skills</th>
					<th scope="col">Multiplixer,coders</th>
				</tr>
			</thead>
		</table>
		<hr>
		<h4 id="in">
			<span class="badge badge-pill badge-danger">Interest</span>
		</h4>
		<h6>Adopt new programming languages,Rig the complex embedded circuit</h6>
		<h6>Dance,cooking,games</h6>
		<hr>
		<h4 id="pd">
			<span class="badge badge-pill badge-warning">Personal details</span>
		</h4>
		<table class="table table-sm table-blue">
			<thead>
				<tr class="table-info">
					<th scope="col"></th>
					<th scope="col">DOB</th>
					<th scope="col">25/06/1999</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-danger">
					<th scope="col"></th>
					<th scope="col">SEX</th>
					<th scope="col">Female</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-warning">
					<th scope="col"></th>
					<th scope="col">Nationality</th>
					<th scope="col">Indian</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-primary">
					<th scope="col"></th>
					<th scope="col">Langauges</th>
					<th scope="col">Kannada,English,Telugu,Hindi</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-success">
					<th scope="col"></th>
					<th scope="col">Father's name</th>
					<th scope="col">Ashok kumar MN</th>
				</tr>
			</thead>
			<thead>
				<tr class="table-secondary">
					<th scope="col"></th>
					<th scope="col">Mother's name</th>
					<th scope="col">Sandhya Ashok</th>
				</tr>
			</thead>
		</table>
		<hr>
		
		<u><h5 style="text-align: right">Signature</h5></u>
		<h5 style="text-align: right">Priyakumar MA</h5>
	</div>
	<div class="container"
		style="width: 70%; box-shadow: 10px 10px 8px 10px rgba(233, 30, 99, 0.7); box-shadow: 1px 0px 7px 3px rgba(156, 39, 176, 0.7); margin-top: 28px; border: 1px solid rgba(63, 81, 181, 0.7);">
		<center>
			<h1 style="color:red;font-family: monospace" >FEEDBACK</h1>
		</center>
			<form action="InsertJobServlet" method="post">
			
			
				<h6>CompanyName:</h6>
				<input id="companyname" type="text" name='companyName' required></input>
					

           
				<h6>AppointmentDay:</h6>
				<input id="appointmentday" type="text" name='appointmentDay'  required></input>
             
             
            
			
			<h6>ConsultPerson:</h6>
				<input id="consultperson" type="text" name='consultPerson' required></input>
            
            
           
				<h6>Requirements:</h6>
				<input id="requirements" type="text" name='requirements' required></input>
            
            
            
				<h6>Comments:</h6>
				<input id="comments" type="text" name='comments' required></input>
		    
		    
		    
				<input type="submit" value="save"></input>
				<a href="Login.jsp"><span class="badge badge-pill badge-info">PostedJobs</span></a>
			   
			</div>
			
			</form>
</body>
</html>