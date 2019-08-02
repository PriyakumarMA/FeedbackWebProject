package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.jobdao.JobDAO;

@WebServlet("/RetriveJobServlet")
public class RetriveJobServlet extends HttpServlet {
	private JobDAO job;
	private String static_userName="priya";
    private String static_password="prikum";
	public void init() {
		job = new JobDAO();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listjob(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void listjob(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		
		String userName=(request.getParameter("userName"));
		String password=(request.getParameter("password"));
		
		if(static_userName.equals(userName)&& static_password.equals(password)) {	
		List<JOB> listjob = job.selectAllJobs();
		request.setAttribute("listJOB", listjob);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Job-list.jsp");
		dispatcher.forward(request, response);}
		
		else {
			response.sendRedirect("invalid.jsp");
			}
		}
	}


