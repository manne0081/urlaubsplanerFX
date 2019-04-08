package application.viewModel;

import application.model.Employee;
import application.model.Session;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 */
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
	private Label designationLabel;


	/**
	 *
	 */
	public void initialize() {
	}

	/**
	 *
	 * @param event
	 */
	@FXML
	public void login(ActionEvent event) {
		boolean bool = Employee.checkLogin(this.userName.getText(), this.password.getText());
		Employee employee = Employee.checkLogin2(this.userName.getText(), this.password.getText());
		
		if (bool) {
			Session session = new Session(employee);
			openMainView(event);
		} else {
			this.loginStatusLabel.setText("Anmeldung fehlgeschlagen!");
			Session.setEmployee(null);
		}
		
		if (employee != null) {
			System.out.println("Login Name: " + Session.getEmployee().getFullName());
		}
	}

	/**
	 *
	 * @param event
	 */
	public void openMainView(ActionEvent event) {
		try {
			// Create the scene
			Parent root = FXMLLoader.load(this.getClass().getResource("../view/MainView.fxml"));
			Scene scene = new Scene(root);

			// Gets the stage based on the ActionEvent
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

			// Push the Scene in the Window and show
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
