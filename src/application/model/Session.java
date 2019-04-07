package application.model;

public class Session {
	private static Employee employee;

	
	public Session(Employee employee) {
		setEmployee(employee);
	}
		
	public static Employee getEmployee() {
		return employee;
	}

	public static void setEmployee(Employee e) {
		employee = e;
	}
	
	
	
	
}
