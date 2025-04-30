package application.components.implementations;


import static application.components.buttons.LyriumPrinterInitButtons.createDragAndDropField;
import static application.components.buttons.LyriumPrinterInitButtons.createPrintDocButton;
import static application.components.buttons.LyriumPrinterInitButtons.createPrinterStatusButton;
import static application.components.buttons.LyriumPrinterInitButtons.createSearchButton;
import static application.utils.ResourceLoader.loadImage;

import application.components.interfaces.LyriumPrinterComponents;
import application.manager.handler.PrinterManagerHandler;
import application.manager.interfaces.PrinterHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class LyriumPrinterComponentsInitImpl implements LyriumPrinterComponents {
	
	private BorderPane rootPanel;
	private Scene scene;
	private TextArea dragAndDropField;
	private Button searchPrinterButton,  printDocButton,
								printerStatusButton;

	
	@Override
	public void initializeUi(Stage stage) {
		
		
		
		this.rootPanel = new BorderPane();
		this.scene = new Scene(this.rootPanel, 800, 500);
		this.scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
		
		initButtons();
		
		PrinterHandler handlerUi = new PrinterManagerHandler();
		handlerUi.initHandler(this);
		
		this.rootPanel.setCenter(this.searchPrinterButton);
		this.rootPanel.setTop(this.dragAndDropField);
		BorderPane.setMargin(this.searchPrinterButton, new Insets(70, 0, 0, 0));
		BorderPane.setMargin(this.dragAndDropField, new Insets(60, 0, 0, 260));
		
		BackgroundImage backgroundImage = new BackgroundImage(
				
						loadImage("/images/background wallpaper.png", 
								LyriumPrinterComponentsInitImpl.class), 
						BackgroundRepeat.NO_REPEAT, 
						BackgroundRepeat.NO_REPEAT, 
						BackgroundPosition.CENTER, 
						new BackgroundSize(100, 100, true, true, false, true));
		
		this.rootPanel.setBackground(new Background(backgroundImage));
		this.rootPanel.getStyleClass().add("scene");
		
		stage.setScene(this.scene);
	}

	
	private void initButtons() {
		
		this.printDocButton = createPrintDocButton(this.printDocButton);
		
		this.searchPrinterButton = createSearchButton(this.searchPrinterButton);
		
		this.printerStatusButton = createPrinterStatusButton(this.printerStatusButton);
		
		this.dragAndDropField = createDragAndDropField(this.dragAndDropField);
		
	}

	//Getters and Setters

	public BorderPane getRootPanel() {
		return rootPanel;
	}


	public void setRootPanel(BorderPane rootPanel) {
		this.rootPanel = rootPanel;
	}


	public Scene getScene() {
		return scene;
	}


	public void setScene(Scene scene) {
		this.scene = scene;
	}


	public TextArea getDragAndDropField() {
		return dragAndDropField;
	}


	public void setDragAndDropField(TextArea dragAndDropField) {
		this.dragAndDropField = dragAndDropField;
	}


	public Button getSearchPrinterButton() {
		return searchPrinterButton;
	}


	public void setSearchPrinterButton(Button searchPrinterButton) {
		this.searchPrinterButton = searchPrinterButton;
	}


	public Button getPrintDocButton() {
		return printDocButton;
	}


	public void setPrintDocButton(Button printDocButton) {
		this.printDocButton = printDocButton;
	}


	public Button getPrinterStatusButton() {
		return printerStatusButton;
	}


	public void setPrinterStatusButton(Button printerStatusButton) {
		this.printerStatusButton = printerStatusButton;
	}
	
	
}
