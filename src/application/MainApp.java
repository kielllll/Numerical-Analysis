package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

public class MainApp extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("MainAppFXML.fxml"));
			
			AnchorPane root = loader.load();
			Scene scene = new Scene(root,850,600);
			primaryStage.setTitle("Numerical Analysis | Bisection Method Implementation");
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image(MainApp.class.getResourceAsStream("digital-calculator.png")));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
