package ac.controller.view;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.*;

public class fenetrewebview implements Initializable{
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

@FXML
private WebView viewweb;

@Override
public void initialize(URL location, ResourceBundle resources) {
	final WebEngine web = viewweb.getEngine();
	String urlweb="";
	web.load(urlweb);
	viewweb.setZoom(0.80);
}

@FXML
private void ville(ActionEvent event)
{
	final WebEngine web = viewweb.getEngine();
	String urlweb="http://umap.openstreetmap.fr/fr/map/carte-sans-nom_535978#13/43.3194/-0.3402";
	web.load(urlweb);	viewweb.setZoom(0.80);
}
}