package ac.controller;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class MainApp extends Application {
	private Stage primaryStage;
    private static BorderPane rootLayout;

    @Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		//titre et icone application
        this.primaryStage.setTitle("Tous Anti-Covid");
        this.primaryStage.getIcons().add(new Image("file:resources/png/healthcare (1).png"));
        initRootLayout();
	}
    public void initRootLayout() {
        try {

            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/rootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	public static void main(String[] args) {
		launch(args);
	}
}




