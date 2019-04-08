package application.viewModel;

import application.model.Absence;
import application.model.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


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




	public void applyForVacation(ActionEvent event) {
		Absence absence = new Absence(Session.getEmployee());
		System.out.println(Session.getEmployee());
		System.out.println(absence.getEmployee());
	}



}
