package ac.controller.view;

import java.io.IOException;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class rootLayoutController {
	//fonction pour aller a la page Restaurant
	@FXML
	 private void handleRestaurant(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Restaurant");
    Parent restaurantparent = FXMLLoader.load(getClass().getResource("restaurant.fxml"));
    Scene restaurantscene = new Scene(restaurantparent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(restaurantscene);
    window.show();
	 }

	//fonction pour aller a la page Dépister
	@FXML
	 private void handleDepister(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Dépister");
   	Parent depisterparent = FXMLLoader.load(getClass().getResource("depistage.fxml"));
   	Scene depisterscene = new Scene(depisterparent);
   	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
   	window.setScene(depisterscene);
   	window.show();
	 }
	//fonction pour aller a la page Attestation
	@FXML
	 private void handleAttestation(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Attestation");
 	Parent Attestationparent = FXMLLoader.load(getClass().getResource("attestation.fxml"));
 	Scene Attestationscene = new Scene(Attestationparent);
 	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
 	window.setScene(Attestationscene);
 	window.show();
	 }
	//fonction pour aller a la page Déclaration
	@FXML
	 private void handleDeclaration(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Déclaration");
	Parent Declarationparent = FXMLLoader.load(getClass().getResource("declaration.fxml"));
	Scene Declarationscene = new Scene(Declarationparent);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(Declarationscene);
	window.show();
	 }
	//fonction pour aller a la page Circulation du virus
	@FXML
	 private void handleCirculation(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Circulation");
  	Parent circulationparent = FXMLLoader.load(getClass().getResource("circulation.fxml"));
  	Scene circulationscene = new Scene(circulationparent);
  	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
  	window.setScene(circulationscene);
  	window.show();
	 }

	//fonction pour aller a la page Proteger
	@FXML
	 private void handleProteger(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Proteger");
 	Parent protegerparent = FXMLLoader.load(getClass().getResource("proteger.fxml"));
 	Scene protegerscene = new Scene(protegerparent);
 	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
 	window.setScene(protegerscene);
 	window.show();
	 }

	//fonction pour aller a la page Guide
	@FXML
	 private void handleGuide(ActionEvent event) throws IOException
	 {
	System.out.println("Direction page Guide");
	Parent Guideparent = FXMLLoader.load(getClass().getResource("Guide.fxml"));
	Scene Guidescene = new Scene(Guideparent);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(Guidescene);
	window.show();
	 }
	//fonction retour en arrière
	@FXML
	 private void handleBackArriere(ActionEvent event) throws IOException
	 {
	System.out.println(" Retour en arrière");
	Parent BackArriereparent = FXMLLoader.load(getClass().getResource("rootLayout.fxml"));
	Scene BackArrierescene = new Scene(BackArriereparent);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(BackArrierescene);
	window.show();
	 }

	// suppression texte page restaurant présence
	 @FXML
	 private JFXTextField tfrestau;
	 @FXML
	 private JFXDatePicker daterestau;
	 @FXML
	 private JFXTimePicker timerestau;

	@FXML
	 private void eraseField(ActionEvent event) throws IOException
	 {
		System.out.println("Effacement textfields");
		tfrestau.setText("");
		daterestau.setValue(null);
		timerestau.setValue(null);
	 }

	// suppression texte page déclaration
	@FXML
    private JFXTextField declaprenom;
	@FXML
    private JFXTextField declanom;
    @FXML
    private JFXDatePicker decladate;
    @FXML
    private JFXTextField declalieunaissance;
    @FXML
    private JFXTextField declanumtel;

    @FXML
	 private void eraseFieldDeclaration(ActionEvent event) throws IOException
	 {
		System.out.println("Effacement textfields de déclaration");
		declaprenom.setText("");
		declanom.setText("");
		decladate.setValue(null);
		declalieunaissance.setText("");
		declanumtel.setText("");
	 }
  //fonction pour changer le texte du bouton activer / désactiver Tous AntiCovid

    @FXML
    private JFXToggleButton toggleActiver;

    public void changeTextToggle(ActionEvent event) throws IOException
    {
    	if(toggleActiver.isSelected()==true)
    	{
    		toggleActiver.setText("Désactiver");

    	}
    	else {
    		toggleActiver.setText("Activer");
    	}
    }



}