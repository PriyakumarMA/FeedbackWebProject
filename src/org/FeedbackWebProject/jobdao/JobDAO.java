package org.FeedbackWebProject.jobdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.FeedbackWebProject.bean.JOB;

public class JobDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/FeedbackDetails";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";

	private static final String INSERT_USERS_SQL = "INSERT INTO status_of_jobs "
			+ "(companyName,appointmentDay,consultPerson,requirements,comments) VALUES " + "(?,?,?,?,?);";
	private static final String SELECT_ALL_USERS = "select * from status_of_jobs;";
	private static final String DELETE_USERS_SQL = "delete from status_of_jobs where id=?";
			
	public JobDAO() {
	}

	protected Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public void insertJob(JOB job) throws SQLException {
		System.out.println(INSERT_USERS_SQL);

		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
		preparedStatement.setString(1, job.getCompanyName());
		preparedStatement.setString(2, job.getAppointmentDay());
		preparedStatement.setString(3, job.getConsultPerson());
		preparedStatement.setString(4, job.getRequirements());
		preparedStatement.setString(5, job.getComments());
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
	}

	public List<JOB> selectAllJobs() {
		List<JOB> jobs = new ArrayList<JOB>();
		Connection connection = getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String CompanyName = rs.getString("CompanyName");
				String AppointmentDay = rs.getString("AppointmentDay");
				String ConsultPerson = rs.getString("ConsultPerson");
				String Requirements = rs.getString("Requirements");
				String Comments = rs.getString("Comments");
				System.out.println("com"+CompanyName);
				System.out.println("a"+AppointmentDay);
				System.out.println("consult"+ConsultPerson);
				System.out.println("Re"+Requirements);
				System.out.println("Comments"+Comments);
				jobs.add(new JOB(id,CompanyName, AppointmentDay, ConsultPerson, Requirements, Comments));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jobs;

	}
	public void deleteJob(int id) throws SQLException {
		System.out.println(DELETE_USERS_SQL);

		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);
		preparedStatement.setInt(1,id);
		preparedStatement.executeUpdate();
	}
}
