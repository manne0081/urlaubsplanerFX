package application.viewModel;

import application.Helper.ViewLoadHelper;
import application.model.Absence;
import application.model.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.text.View;
import java.io.IOException;


public class AbsenceViewModel {
	@FXML
	private Button backButton;
	@FXML
	private DatePicker datePickerFromDatePicker, datePickerToDatePicker;
	@FXML
	private CheckBox absenceFromHalfCheckBox, absenceToHalfCheckBox;
	@FXML
	private Button soughtVacationButton;
	@FXML
	private Label soughtVacationLabel;


	public Label getSoughtVacationLabel() {
		return soughtVacationLabel;
	}

	private void setSoughtVacationLabel(Absence absence) {
		String string = "";
		string += "Urlaubnehmer: " + Session.getEmployee().getFullName();
		string += " - Urlaub von: " + Absence.getAbsenceFrom();

		this.soughtVacationLabel.setText(string);
	}


	public void backToMainView(ActionEvent event) {
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

//		ViewLoadHelper.loadMainView(event);

	}

	public void applyForVacation(ActionEvent event) {
		Absence absence = new Absence(Session.getEmployee());
		absence.setAbsenceToArrayList(absence);
		setSoughtVacationLabel(absence);
	}


}
