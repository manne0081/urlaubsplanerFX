package application.model;

/**
 *
 */
public class Employee {	
	
	private String nameI;
	private String nameII;
	private String userName;
	private String password;
	private double weeklyWorkTime;
	private int vacationClaim;
	
	private Department department;

	/* simulate Data */
	private static Employee[] employeeList = {
		new Employee("Daniel", "D�sentrieb", "daniel", "pass"),
		new Employee("Kater", "Karlo", "kater", "pass"),
	};


	/* Constructor */
	/**
	 *
	 * @param nameI
	 * @param user
	 * @param pass
	 */
	public Employee(String nameI, String user, String pass) {
		this.setNameI(nameI);
		this.setUserName(user);
		this.setPassword(pass);
	}

	/**
	 *
	 * @param nameI
	 * @param nameII
	 * @param user
	 * @param pass
	 */
	public Employee(String nameI, String nameII, String user, String pass) {
		this.setNameI(nameI);
		this.setNameII(nameII);
		this.setUserName(user);
		this.setPassword(pass);
	}


	/* GETTER & SETTER */
	public String getNameI() {
		return nameI;
	}

	public void setNameI(String nameI) {
		this.nameI = nameI;
	}

	public String getNameII() {
		return nameII;
	}

	public void setNameII(String nameII) {
		this.nameII = nameII;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVacationClaim() {
		return vacationClaim;
	}

	public void setVacationClaim(int vacationClaim) {
		this.vacationClaim = vacationClaim;
	}

	public double getWeeklyWorkTime() {
		return weeklyWorkTime;
	}

	public void setWeeklyWorkTime(double weeklyWorkTime) {
		this.weeklyWorkTime = weeklyWorkTime;
	}
	
	
	/* private Methods */
	
	
	/* public Methods */

	/**
	 *
	 * @param userName
	 * @param password
	 * @return
	 */
	public static boolean checkLogin(String userName, String password) {
		boolean bool = false;
		for (Employee employee : employeeList) {
			if (employee.getUserName().equals(userName)) {
				if (employee.getPassword().equals(password)) {
					bool = true;
				}
			}			
		}
		return bool;
	}

	/**
	 *
	 * @param userName
	 * @param password
	 * @return
	 */
	public static Employee checkLogin2(String userName, String password) {
		Employee employee = null;
		for (Employee e : employeeList) {
			if (e.getUserName().equals(userName)) {
				if (e.getPassword().equals(password)) {
					employee = e;
				}
			}			
		}
		return employee;
	}

	/**
	 *
	 * @return
	 */
	public String getFullName() {
		String strAll = "";
		if (this.getNameI() != "") {
			strAll = this.getNameI();
		}
		if (this.getNameII() != null) {
			strAll += " " + this.getNameII();
		}
		return strAll;
	}	
	
}
