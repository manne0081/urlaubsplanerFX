package application.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class Absence {
	private Employee employee;
	private static Date absenceFrom;
	private Date absenceTo;
	private static ArrayList<Absence> absences = new ArrayList<Absence>();

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

	public static Date getAbsenceFrom() {
		return absenceFrom;
	}

	public void setAbsenceFrom(Date absenceFrom) {
		this.absenceFrom = absenceFrom;
	}

	public Date getAbsenceTo() {
		return absenceTo;
	}

	public void setAbsenceTo(Date absenceTo) {
		this.absenceTo = absenceTo;
	}



	public static void getAllAbsenceFromArrayList() {
		for (int i = 0; i < absences.size(); i++) {
			System.out.println(absences.get(i).getEmployee().getFullName());
		}
	}

	public void setAbsenceToArrayList(Absence absence) {
		absences.add(absence);
	}



}
