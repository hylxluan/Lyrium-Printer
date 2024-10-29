package application.components;

import application.components.interfaces.LyriumPrinterComponents;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LyriumPrinterComponentsImpl implements LyriumPrinterComponents {
	
	private Scene scene;
	private Button searchPrinterButton;

	@Override
	public void initializeUi(Stage stage) {
		
		BorderPane rootPanel = new BorderPane();
		VBox leftVBox = new VBox();
		VBox rightVBox = new VBox();
		
		this.scene = new Scene(rootPanel, 800, 500);
		this.scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
		createSearchButton();
		rootPanel.setLeft(leftVBox);
		rootPanel.setRight(rightVBox);
		rootPanel.setCenter(searchPrinterButton);
		rootPanel.getStyleClass().add("scene");
		stage.setScene(this.scene);
	}


	@Override
	public void createSearchButton() {
		this.searchPrinterButton = new Button("Procurar Impressora");
		this.searchPrinterButton.setMaxWidth(170);
		this.searchPrinterButton.setMinWidth(170);
		this.searchPrinterButton.setMaxHeight(60);
		this.searchPrinterButton.setMinHeight(60);
		this.searchPrinterButton.getStyleClass().add("search-button");
	}
}
