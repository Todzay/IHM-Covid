package ac.controller.view;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTimePicker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class choixmultiple {

    @FXML
	 private void handleBackArriere(ActionEvent event) throws IOException
	 {
	System.out.println("Retour en arrière");
	Parent BackArriereparent = FXMLLoader.load(getClass().getResource("rootLayout.fxml"));
	Scene BackArrierescene = new Scene(BackArriereparent);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(BackArrierescene);
	window.show();
	 }

		@FXML
	    JFXComboBox<String> comboBox;
		@FXML
	    private ObservableList<String> list = FXCollections.observableArrayList();

	    @FXML
	    private void initialize(){
	    	List<String> strings = new ArrayList<>();
	        strings.add("Activité professionnelle");
	        strings.add("Achats");
	        strings.add("Consultations et soins");
	        strings.add("Motif familial");
	        strings.add("Handicapé");
	        strings.add("Déplacements 3h, 20 km");
	        strings.add("Convocation judiciaire");
	        strings.add("MIG");
	        strings.add("Enfants à l'école");
	        comboBox.setItems(FXCollections.observableArrayList(strings));
	    }

	    @FXML
	    private JFXTextArea tfprenom;
	    @FXML
	    private JFXDatePicker tfdate;
	    @FXML
	    private JFXTextArea tfnom;
	    @FXML
	    private JFXTextArea tflieu;
	    @FXML
	    private JFXTextArea tfadresse;
	    @FXML
	    private JFXTextArea tfville;
	    @FXML
	    private JFXTextArea tfcp;
	    @FXML
	    private JFXDatePicker tfdatesortie;
	    @FXML
	    private JFXTimePicker tfheuresortie;

	    @FXML
		 private void eraseField(ActionEvent event) throws IOException
		 {
			System.out.println("Effacement textfields attestation");
			tfprenom.setText("");
			tfnom.setText("");
			tfville.setText("");
			tfdate.setValue(null);
			tflieu.setText("");
			tfadresse.setText("");
			tfcp.setText("");
			tfprenom.setText("");
			tfdatesortie.setValue(null);
			tfheuresortie.setValue(null);
		 }



}
