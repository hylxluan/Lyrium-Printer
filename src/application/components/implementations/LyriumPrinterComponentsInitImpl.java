package application.components.implementations;


import static application.components.buttons.LyriumPrinterInitButtons.*;
import application.components.interfaces.LyriumPrinterComponents;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		
		searchPrinterButton = createSearchButton(searchPrinterButton);
		
		this.scene = new Scene(rootPanel, 800, 500);
		this.scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
		
		
		printDocButton = createPrintDocButton(printDocButton);
		headAlignmentButton = createHeadAlignmentButton(headAlignmentButton);
		nozzleCheckButton = createNozzleCheckButton(nozzleCheckButton);
		
		leftVBox.setAlignment(Pos.CENTER_LEFT);
		leftVBox.getChildren().addAll(this.printDocButton,
				  					  this.headAlignmentButton, 
				  					  this.nozzleCheckButton);

		VBox.setMargin(this.printDocButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.headAlignmentButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.nozzleCheckButton, new Insets(10, 0, 10, 10));
		
		rollerCleaningButton = createRollerCleaningButton(rollerCleaningButton);
		headCleaningButton = createHeadCleaningButton(headCleaningButton);
		deepCleaningButton = createDeepCleaningButton(deepCleaningButton);
		
		rightVBox.setAlignment(Pos.CENTER_RIGHT);
		rightVBox.getChildren().addAll(this.rollerCleaningButton,
									   this.headCleaningButton,
									   this.deepCleaningButton);
		
		VBox.setMargin(this.rollerCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.headCleaningButton, new Insets(10, 10, 10, 0));
		VBox.setMargin(this.deepCleaningButton, new Insets(10, 10, 10, 0));
		
		rootPanel.setLeft(leftVBox);
		rootPanel.setRight(rightVBox);
		rootPanel.setCenter(searchPrinterButton);
		BorderPane.setMargin(searchPrinterButton, new Insets(325, 0, 0, 0));
		rootPanel.getStyleClass().add("scene");
		stage.setScene(this.scene);
		
	}


}
