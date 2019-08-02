package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.jobdao.JobDAO;

@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet{
	private JobDAO job;

	
	

	
	public void init() {
		job= new JobDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		showNewForm(request, response);
		
		
	}
	
	

	protected void InsertJOB(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String CompanyName = request.getParameter("companyName");
		String AppointmentDay = request.getParameter("appointmentDay");
		String ConsultPerson = request.getParameter("consultPerson");
		String Requirements = request.getParameter("requirements");
		String Comments = request.getParameter("comments");
		JOB newJOB = new JOB(CompanyName, AppointmentDay, ConsultPerson, Requirements, Comments);
		job.insertJob(newJOB);
		response.sendRedirect("list");
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("Form.jsp");
		dispatcher.forward(request, response);
	}
	
}
