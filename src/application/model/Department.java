package application.model;

public class Department {
	private String designation;
	private Employee firstHead;
	private Employee secondHead;

	/* simulate Data */
	private static Department[] departmentList = {
			new Department("Verkauf"),
			new Department("Einkauf"),
	};


	/* Constructor */
	/**
	 * Creates an Object (Department)
	 * @param designation
	 */
	public Department(String designation) {
		this.setDesignation(designation);
	}


	/* GETTER & SETTER */
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee getFirstHead() {
		return firstHead;
	}

	public void setFirstHead(Employee firstHead) {
		this.firstHead = firstHead;
	}

	public Employee getSecondHead() {
		return secondHead;
	}

	public void setSecondHead(Employee secondHead) {
		this.secondHead = secondHead;
	}


	/* private Methods */


	/* public Methods */



}
