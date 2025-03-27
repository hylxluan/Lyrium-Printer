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
import javafx.geometry.Insets;


public class LyriumPrinterComponentsImpl implements LyriumPrinterComponents {
	
	private Scene scene;
	private Button searchPrinterButton, printDocButton,
				  						headAlignmentButton,
				  						nozzleCheckButton;

	
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
		
		createSearchButton();
		createPrintDocButton();
		createHeadAlignmentButton();
		createNozzleCheckButton();
		
		leftVBox.getChildren().addAll(this.printDocButton, 
									  this.headAlignmentButton,
									  this.nozzleCheckButton);
		
		VBox.setMargin(this.printDocButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.headAlignmentButton, new Insets(10, 0, 10, 10));
		VBox.setMargin(this.nozzleCheckButton, new Insets(10, 0, 10, 10));
		leftVBox.setAlignment(Pos.CENTER_LEFT);
		rootPanel.setLeft(leftVBox);
		rootPanel.setRight(rightVBox);
		rootPanel.setCenter(searchPrinterButton);
		BorderPane.setMargin(searchPrinterButton, new Insets(250, 220, 0, 0));
		rootPanel.getStyleClass().add("scene");
		stage.setScene(this.scene);
		
	}
	

	@Override
	public void createSearchButton() {
		
		this.searchPrinterButton = new Button("Procurar Impressora");
		this.searchPrinterButton.setMaxWidth(210);
		this.searchPrinterButton.setMinWidth(210);
		this.searchPrinterButton.setMaxHeight(60);
		this.searchPrinterButton.setMinHeight(60);
		this.searchPrinterButton.setScaleY(1.0);
		this.searchPrinterButton.setScaleX(1.0);
		this.searchPrinterButton.getStyleClass().add("search-button");
		
	}
	
	@Override
	public void createPrintDocButton() {
		
		this.printDocButton = new Button("Imprimir Documento");
		this.printDocButton.setMaxWidth(210);
		this.printDocButton.setMinWidth(210);
		this.printDocButton.setMaxHeight(60);
		this.printDocButton.setMinHeight(60);
		this.printDocButton.setScaleY(1.0);
		this.printDocButton.setScaleX(1.0);
		this.printDocButton.getStyleClass().add("print-doc-button");
		
	}


	@Override
	public void createHeadAlignmentButton() {
		
		this.headAlignmentButton = new Button("Alinhamento do Cabeçote");
		this.headAlignmentButton.setMaxWidth(210);
		this.headAlignmentButton.setMinWidth(210);
		this.headAlignmentButton.setMaxHeight(60);
		this.headAlignmentButton.setMinHeight(60);
		this.headAlignmentButton.setScaleY(1.0);
		this.headAlignmentButton.setScaleX(1.0);
		this.headAlignmentButton.getStyleClass().add("head-alignment-button");
		
	}


	@Override
	public void createNozzleCheckButton() {
		
		this.nozzleCheckButton = new Button("Verificação Dos Jatos");
		this.nozzleCheckButton.setMaxWidth(210);
		this.nozzleCheckButton.setMinWidth(210);
		this.nozzleCheckButton.setMaxHeight(60);
		this.nozzleCheckButton.setMinHeight(60);
		this.nozzleCheckButton.setScaleY(1.0);
		this.nozzleCheckButton.setScaleX(1.0);
		this.nozzleCheckButton.getStyleClass().add("nozzle-check-button");
		
	}
	
	

}
