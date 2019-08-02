package org.FeedbackWebProject.bean;

public class JOB {
	protected int id;
	protected String companyName;
	protected String appointmentDay;
	protected String consultPerson;
	protected String requirements;
	protected String comments;

	public JOB(String companyName, String appointmentDay, String consultPerson, String requirements, String comments) {
		super();
		this.companyName = companyName;
		this.appointmentDay = appointmentDay;
		this.consultPerson = consultPerson;
		this.requirements = requirements;
		this.comments = comments;
	}

	public JOB(int id, String companyName, String appointmentDay, String consultPerson, String requirements,
			String comments) {
		this.id=id;
		this.companyName = companyName;
		this.appointmentDay = appointmentDay;
		this.consultPerson = consultPerson;
		this.requirements = requirements;
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAppointmentDay() {
		return appointmentDay;
	}

	public void setAppointmentDay(String appointmentDay) {
		this.appointmentDay = appointmentDay;
	}

	public String getConsultPerson() {
		return consultPerson;
	}

	public void setConsultPerson(String consultPerson) {
		this.consultPerson = consultPerson;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	
}