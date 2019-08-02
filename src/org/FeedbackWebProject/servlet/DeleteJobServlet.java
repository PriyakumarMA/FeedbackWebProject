package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.jobdao.JobDAO;

@WebServlet("/DeleteJobServlet")
public class DeleteJobServlet extends HttpServlet {

private JobDAO job;

	public void init() {
		job= new JobDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		deleteJob(request, response);	
	}
	private void deleteJob(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			job.deleteJob(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request, response);
	}

}
