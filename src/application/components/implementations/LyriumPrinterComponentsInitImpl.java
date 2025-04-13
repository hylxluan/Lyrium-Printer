package application.components.implementations;


import static application.components.buttons.LyriumPrinterInitButtons.*;
import application.components.interfaces.LyriumPrinterComponents;
import static application.utils.ResourceLoader.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class LyriumPrinterComponentsInitImpl implements LyriumPrinterComponents {
	
	private Scene scene;
	private Button searchPrinterButton,  printDocButton,
				   headAlignmentButton,  nozzleCheckButton,
				   rollerCleaningButton, headCleaningButton,
				   			    deepCleaningButton;

	
	@Override
	public void initializeUi(Stage stage) {
		
		BorderPane rootPanel = new BorderPane();
		VBox leftVBox = new VBox();
		VBox rightVBox = new VBox();
		
		/*
		 * Lado direito: {Limpeza de Rolos, Limpeza de Cabeçotes, Limpeza Profunda}
		 * 
		 * Lado esquerdo: {Imprimir Documento, Alinhamento dos Cabeçotes, Verificação dos Jatos}
		 * 
		 * */
		
		this.scene = new Scene(rootPanel, 800, 500);
		this.scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
		
		
		this.printDocButton = createPrintDocButton(printDocButton);
		this.headAlignmentButton = createHeadAlignmentButton(headAlignmentButton);
		this.nozzleCheckButton = createNozzleCheckButton(nozzleCheckButton);
		
		leftVBox.setAlignment(Pos.CENTER_LEFT);
		leftVBox.getChildren().addAll(this.printDocButton,
				  					  this.headAlignmentButton, 
				  					  this.nozzleCheckButton);

		VBox.setMargin(this.printDocButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.headAlignmentButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.nozzleCheckButton, new Insets(10, 0, 10, 10));
		
		this.rollerCleaningButton = createRollerCleaningButton(rollerCleaningButton);
		this.headCleaningButton = createHeadCleaningButton(headCleaningButton);
		this.deepCleaningButton = createDeepCleaningButton(deepCleaningButton);
		
		rightVBox.setAlignment(Pos.CENTER_RIGHT);
		rightVBox.getChildren().addAll(this.rollerCleaningButton,
									   this.headCleaningButton,
									   this.deepCleaningButton);
		
		VBox.setMargin(this.rollerCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.headCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.deepCleaningButton, new Insets(10, 10, 10, 0));
		
		this.searchPrinterButton = createSearchButton(searchPrinterButton);
		
		rootPanel.setLeft(leftVBox);
		rootPanel.setRight(rightVBox);
		rootPanel.setCenter(searchPrinterButton);
		BorderPane.setMargin(searchPrinterButton, new Insets(325, 0, 0, 0));
		
		BackgroundImage backgroundImage = new BackgroundImage(
				
						loadImage("/images/background wallpaper.png", 
								LyriumPrinterComponentsInitImpl.class), 
						BackgroundRepeat.NO_REPEAT, 
						BackgroundRepeat.NO_REPEAT, 
						BackgroundPosition.CENTER, 
						new BackgroundSize(100, 100, true, true, false, true));
		
		rootPanel.setBackground(new Background(backgroundImage));
		rootPanel.getStyleClass().add("scene");
		
		stage.setScene(this.scene);
	}
	
	//Getters and Setters
	
	public Scene getScene() {
		return scene;
	}


	public void setScene(Scene scene) {
		this.scene = scene;
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


	public Button getHeadAlignmentButton() {
		return headAlignmentButton;
	}


	public void setHeadAlignmentButton(Button headAlignmentButton) {
		this.headAlignmentButton = headAlignmentButton;
	}


	public Button getNozzleCheckButton() {
		return nozzleCheckButton;
	}


	public void setNozzleCheckButton(Button nozzleCheckButton) {
		this.nozzleCheckButton = nozzleCheckButton;
	}


	public Button getRollerCleaningButton() {
		return rollerCleaningButton;
	}


	public void setRollerCleaningButton(Button rollerCleaningButton) {
		this.rollerCleaningButton = rollerCleaningButton;
	}


	public Button getHeadCleaningButton() {
		return headCleaningButton;
	}


	public void setHeadCleaningButton(Button headCleaningButton) {
		this.headCleaningButton = headCleaningButton;
	}


	public Button getDeepCleaningButton() {
		return deepCleaningButton;
	}


	public void setDeepCleaningButton(Button deepCleaningButton) {
		this.deepCleaningButton = deepCleaningButton;
	}
	
}
