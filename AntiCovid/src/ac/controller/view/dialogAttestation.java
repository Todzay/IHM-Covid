package ac.controller.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class dialogAttestation implements Initializable{

	@FXML
	private StackPane stackPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void loadDialog(ActionEvent event) {
		System.out.println(" vous générez votre attestation");
		JFXDialogLayout content = new JFXDialogLayout();
		content.setHeading(new Text("Test oui"));
		content.setBody(new Text( "ouais ma gl on est là"));
		JFXDialog dialog = new JFXDialog( stackPane ,content,JFXDialog.DialogTransition.CENTER);

		JFXButton button = new JFXButton("Ok");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				dialog.close();
			}
		});
		content.setActions(button);
		dialog.show();
	}


	@FXML
	 private void handleBackArriere(ActionEvent event) throws IOException
	 {
		System.out.println(" go page BackArriere");
	Parent BackArriereparent = FXMLLoader.load(getClass().getResource("rootLayout.fxml"));
	Scene BackArrierescene = new Scene(BackArriereparent);

	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(BackArrierescene);
	window.show();
	 }


}
