package application.components.buttons;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class LyriumPrinterInitButtons {
	
	
	private LyriumPrinterInitButtons() {
		
	}
	
	
	public static Button createSearchButton(Button searchPrinterButton) {
		searchPrinterButton = new Button("Procurar Impressora");
		searchPrinterButton.setMaxWidth(220);
		searchPrinterButton.setMinWidth(220);
		searchPrinterButton.setMaxHeight(80);
		searchPrinterButton.setMinHeight(80);
		searchPrinterButton.setScaleY(1.0);
		searchPrinterButton.setScaleX(1.0);
		searchPrinterButton.getStyleClass().add("search-button");
		
		return searchPrinterButton;
	}
	
	
	public static Button createPrintDocButton(Button printDocButton) {
		
		printDocButton = new Button("Imprimir Documento");
		printDocButton.setMaxWidth(220);
		printDocButton.setMinWidth(220);
		printDocButton.setMaxHeight(80);
		printDocButton.setMinHeight(80);
		printDocButton.setScaleY(1.0);
		printDocButton.setScaleX(1.0);
		printDocButton.getStyleClass().add("print-doc-button");
		
		return printDocButton;
	}
	

	public static Button createPrinterStatusButton(Button printerStatusButton) {
		
		printerStatusButton = new Button("Checar Status");
		printerStatusButton.setMaxWidth(220);
		printerStatusButton.setMinWidth(220);
		printerStatusButton.setMaxHeight(80);
		printerStatusButton.setMinHeight(80);
		printerStatusButton.setScaleY(1.0);
		printerStatusButton.setScaleX(1.0);
		printerStatusButton.getStyleClass().add("printer-status-button");
		
		return printerStatusButton;
	}
	
	public static Label createDragAndDropField(Label dragAndDropField) {
		
		dragAndDropField = new Label("Arraste aqui para imprimir!");
		dragAndDropField.setMaxWidth(260);
		dragAndDropField.setMinWidth(260);
		dragAndDropField.setMaxHeight(200);
		dragAndDropField.setMinHeight(200);
		dragAndDropField.setScaleY(1.0);
		dragAndDropField.setScaleX(1.0);
		dragAndDropField.getStyleClass().add("drag-and-drop-Label");
		
		return dragAndDropField;
	}
	

}
