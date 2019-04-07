package application.viewModel;

import application.model.Employee;
import application.model.Session;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginViewModel {
	@FXML
	private TextField userName;
	@FXML
	private PasswordField password;
	@FXML
	private Button loginButton;
	@FXML
	private Label loginStatusLabel;
	
	@FXML
	public void checkLogin() {
		boolean bool = Employee.checkLogin(this.userName.getText(), this.password.getText());
		Employee employee = Employee.checkLogin2(this.userName.getText(), this.password.getText());
		
		if (bool) {
			this.loginStatusLabel.setText("Login successfully");
			Session session = new Session(employee);
		} else {
			this.loginStatusLabel.setText("Login failed");
			Session.setEmployee(null);
		}
		
		if (employee != null) {
			System.out.println("Login Name: " + Session.getEmployee().getFullName());
		}
	}
	
	
}
