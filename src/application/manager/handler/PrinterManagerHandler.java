package application.manager.handler;

import static application.utils.ResourceLoader.loadImage;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import application.components.implementations.LyriumPrinterComponentsInitImpl;
import application.manager.interfaces.PrinterHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrinterManagerHandler implements PrinterHandler {
	
	private LyriumPrinterComponentsInitImpl components;
	private PrintService selectedPrinter;
	

	
	
	public PrinterManagerHandler(LyriumPrinterComponentsInitImpl components) {
		this.components = components;
	}

	@Override
	public void initHandler() {
		
		dragAndDropFieldHandler();
		searchPrinterHandler();
		printDocHandler();
		
	}
	
	private void dragAndDropFieldHandler() {
		// later implements
	}
	
	private void printDocHandler() {
		
		if (this.selectedPrinter != null) {
			this.components.getPrintDocButton().setVisible(true);
			// vou programar amanha
		}
	
	}
	
	private void searchPrinterHandler() {
		this.components.getSearchPrinterButton().setOnMouseClicked(event -> {
			printerListView();
		});
	}
	
	private void printerListView() {
		
		Stage printerListStage = new Stage();
		printerListStage.setTitle("Impressoras Encontradas");
		printerListStage.getIcons().add(loadImage("/images/printer.png", PrinterManagerHandler.class));
		printerListStage.setResizable(false);
		
		PrintService[] printService = PrintServiceLookup.lookupPrintServices(null, null);
		ObservableList<String> printersList = FXCollections.observableArrayList();
		ListView<String> printerListView = new ListView<>(printersList);
		
		for (PrintService ps : printService) {
			printersList.add(ps.getName());
		}
		
		printerListView.setOnMouseClicked(event -> {
			
			if (event.getClickCount() == 2) {
				String selectedOne = printerListView.getSelectionModel().getSelectedItem();
				for (PrintService ps : printService) {
					if (selectedOne != null && ps.getName().equalsIgnoreCase(selectedOne)) {
						this.selectedPrinter = ps;
						break;
					}
					
				}
				
				printerListStage.close();
			}
		});
		
		VBox printerLayout = new VBox(10, printerListView);
		printerLayout.setStyle("-fx-padding: 5;");
		Scene printerListScene = new Scene(printerLayout, 300, 300);
		printerListStage.setScene(printerListScene);
		printerListStage.show();
	}
	
}
