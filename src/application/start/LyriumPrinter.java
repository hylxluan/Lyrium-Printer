package application.start;


import application.utils.ResourceLoader;
import javafx.application.Application;
import javafx.stage.Stage;

public class LyriumPrinter extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		stage.setTitle("Lyrium Printer");
		stage.setWidth(800);
		stage.setHeight(500);
		stage.getIcons().add(ResourceLoader.loadImage("/images/printer.png", LyriumPrinter.class));
		stage.getStyle();
		stage.setResizable(false);
		
		
		stage.show();
		
	}

}
