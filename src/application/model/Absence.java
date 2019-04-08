package application.model;

import java.util.Date;

/**
 *
 */
public class Absence {
	private Employee employee;
	private Date absenceFrom;
	private Date absenceTo;


	/* Constructor */
	public Absence(Employee employee) {
		setEmployee(employee);
	}

	public Absence(Employee employee, Date absenceFrom, Date absenceTo) {
		this.employee = employee;
		this.absenceFrom = absenceFrom;
		this.absenceTo = absenceTo;
	}


	/* GETTER & SETTER */
	public Employee getEmployee() {
		return employee;
	}

	private void setEmployee(Employee employee) {
		this.employee = employee;
	}





}
