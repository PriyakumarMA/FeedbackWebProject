package org.FeedbackWebProject.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FeedbackWebProject.bean.JOB;
import org.FeedbackWebProject.jobdao.JobDAO;


@WebServlet("/InsertJobServlet")
public class InsertJobServlet extends HttpServlet {

		private JobDAO jobDAO;

		public void init() {
			jobDAO = new JobDAO();

		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			try {
				insertJOB(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

		}

		protected void insertJOB(HttpServletRequest request, HttpServletResponse response)
				throws SQLException, IOException {
			String CompanyName = request.getParameter("companyName");
			String AppointmentDay = request.getParameter("appointmentDay");
			String ConsultPerson = request.getParameter("consultPerson");
			String Requirements = request.getParameter("requirements");
			String Comments = request.getParameter("comments");
			JOB newJOB = new JOB(CompanyName, AppointmentDay, ConsultPerson, Requirements, Comments);
			jobDAO.insertJob(newJOB);
			response.sendRedirect("SuccessServlet");
		}

	}

