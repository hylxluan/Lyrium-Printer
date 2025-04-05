package application.components.buttons;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;


public class LyriumPrinterInitButtons {
	
	
	private LyriumPrinterInitButtons() {
		
	}
	
	
	public static Button createSearchButton(Button searchPrinterButton) {
		
		searchPrinterButton = new Button("Procurar Impressora");
		searchPrinterButton.setMaxWidth(230);
		searchPrinterButton.setMinWidth(230);
		searchPrinterButton.setMaxHeight(60);
		searchPrinterButton.setMinHeight(60);
		searchPrinterButton.setScaleY(1.0);
		searchPrinterButton.setScaleX(1.0);
		searchPrinterButton.getStyleClass().add("search-button");
		
		return searchPrinterButton;
	}
	
	
	public static Button createPrintDocButton(Button printDocButton) {
		
		printDocButton = new Button("Imprimir Documento");
		printDocButton.setMaxWidth(230);
		printDocButton.setMinWidth(230);
		printDocButton.setMaxHeight(60);
		printDocButton.setMinHeight(60);
		printDocButton.setScaleY(1.0);
		printDocButton.setScaleX(1.0);
		printDocButton.getStyleClass().add("print-doc-button");
		
		return printDocButton;
	}
	
	
	public static Button createHeadAlignmentButton(Button headAlignmentButton) {
		
		headAlignmentButton = new Button("Alinhamento do Cabeçote");
		headAlignmentButton.setMaxWidth(230);
		headAlignmentButton.setMinWidth(230);
		headAlignmentButton.setMaxHeight(60);
		headAlignmentButton.setMinHeight(60);
		headAlignmentButton.setScaleY(1.0);
		headAlignmentButton.setScaleX(1.0);
		headAlignmentButton.getStyleClass().add("head-alignment-button");
		
		return headAlignmentButton;
	}
	
	
	public static Button createNozzleCheckButton(Button nozzleCheckButton) {
		
		nozzleCheckButton = new Button("Verificação Dos Jatos");
		nozzleCheckButton.setMaxWidth(230);
		nozzleCheckButton.setMinWidth(230);
		nozzleCheckButton.setMaxHeight(60);
		nozzleCheckButton.setMinHeight(60);
		nozzleCheckButton.setScaleY(1.0);
		nozzleCheckButton.setScaleX(1.0);
		nozzleCheckButton.getStyleClass().add("nozzle-check-button");
		
		return nozzleCheckButton;
	}
	
	
	public static Button createRollerCleaningButton(Button rollerCleaningButton) {
		
		rollerCleaningButton = new Button("Limpeza de Rolos");
		rollerCleaningButton.setMaxWidth(230);
		rollerCleaningButton.setMinWidth(230);
		rollerCleaningButton.setMaxHeight(60);
		rollerCleaningButton.setMinHeight(60);
		rollerCleaningButton.setScaleY(1.0);
		rollerCleaningButton.setScaleX(1.0);
		rollerCleaningButton.getStyleClass().add("roller-cleaning-button");
		
		return rollerCleaningButton;
	}
	
	
	public static Button createHeadCleaningButton(Button headCleaningButton) {
		
		headCleaningButton = new Button("Limpeza de Cabeçotes");
		headCleaningButton.setMaxWidth(230);
		headCleaningButton.setMinWidth(230);
		headCleaningButton.setMaxHeight(60);
		headCleaningButton.setMinHeight(60);
		headCleaningButton.setScaleY(1.0);
		headCleaningButton.setScaleX(1.0);
		headCleaningButton.getStyleClass().add("head-cleaning-button");
		
		return headCleaningButton;
	}
	
	
	public static Button createDeepCleaningButton(Button deepCleaningButton) {
		
		deepCleaningButton = new Button("Limpeza Profunda");
		deepCleaningButton.setMaxWidth(230);
		deepCleaningButton.setMinWidth(230);
		deepCleaningButton.setMaxHeight(60);
		deepCleaningButton.setMinHeight(60);
		deepCleaningButton.setScaleY(1.0);
		deepCleaningButton.setScaleX(1.0);
		deepCleaningButton.getStyleClass().add("deep-cleaning-button");
		
		return deepCleaningButton;
	}
	

}
