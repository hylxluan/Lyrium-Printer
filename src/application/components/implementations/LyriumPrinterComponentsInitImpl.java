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
	
	private BorderPane rootPanel;
	private VBox leftVBox, rightVBox;
	private Scene scene;
	private Button searchPrinterButton,  printDocButton,
				   headAlignmentButton,  nozzleCheckButton,
				   rollerCleaningButton, headCleaningButton,
				   			    deepCleaningButton;

	
	@Override
	public void initializeUi(Stage stage) {
		
		
		/*
		 * Lado direito: {Limpeza de Rolos, Limpeza de Cabeçotes, Limpeza Profunda}
		 * 
		 * Lado esquerdo: {Imprimir Documento, Alinhamento dos Cabeçotes, Verificação dos Jatos}
		 * 
		 * */
		
		
		this.rootPanel = new BorderPane();
		this.scene = new Scene(this.rootPanel, 800, 500);
		this.scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
		
		initButtons();
		
		this.rootPanel.setLeft(this.leftVBox);
		this.rootPanel.setRight(this.rightVBox);
		this.rootPanel.setCenter(this.searchPrinterButton);
		BorderPane.setMargin(this.searchPrinterButton, new Insets(325, 0, 0, 0));
		
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

	
	public void initButtons() {
		
		
		this.leftVBox = new VBox();
		this.rightVBox = new VBox();
		

		this.printDocButton = createPrintDocButton(this.printDocButton);
		this.headAlignmentButton = createHeadAlignmentButton(this.headAlignmentButton);
		this.nozzleCheckButton = createNozzleCheckButton(this.nozzleCheckButton);
		
		this.rollerCleaningButton = createRollerCleaningButton(rollerCleaningButton);
		this.headCleaningButton = createHeadCleaningButton(headCleaningButton);
		this.deepCleaningButton = createDeepCleaningButton(deepCleaningButton);
		
		this.searchPrinterButton = createSearchButton(this.searchPrinterButton);
		
		
		this.leftVBox.setAlignment(Pos.CENTER_LEFT);
		this.leftVBox.getChildren().addAll(this.printDocButton,
				  					  this.headAlignmentButton, 
				  					  this.nozzleCheckButton);

		VBox.setMargin(this.printDocButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.headAlignmentButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.nozzleCheckButton, new Insets(10, 0, 10, 10));
		
		
		this.rightVBox.setAlignment(Pos.CENTER_RIGHT);
		this.rightVBox.getChildren().addAll(this.rollerCleaningButton,
									   this.headCleaningButton,
									   this.deepCleaningButton);
		
		VBox.setMargin(this.rollerCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.headCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.deepCleaningButton, new Insets(10, 10, 10, 0));
	
	}
	

	//Getters and Setters
	
	public BorderPane getRootPanel() {
		return rootPanel;
	}


	public void setRootPanel(BorderPane rootPanel) {
		this.rootPanel = rootPanel;
	}


	public VBox getLeftVBox() {
		return leftVBox;
	}


	public void setLeftVBox(VBox leftVBox) {
		this.leftVBox = leftVBox;
	}


	public VBox getRightVBox() {
		return rightVBox;
	}


	public void setRightVBox(VBox rightVBox) {
		this.rightVBox = rightVBox;
	}


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
