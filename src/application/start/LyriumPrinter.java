package application.start;


import application.components.implementations.LyriumPrinterComponentsInitImpl;
import application.components.interfaces.LyriumPrinterComponents;
import application.manager.handler.PrinterManagerHandler;
import application.manager.interfaces.PrinterManager;

import static application.utils.ResourceLoader.*;
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
		stage.getIcons().add(loadImage("/images/printer.png", LyriumPrinter.class));
		stage.getStyle();
		stage.setResizable(false);
		
		LyriumPrinterComponents componentsUi = new LyriumPrinterComponentsInitImpl();
		componentsUi.initializeUi(stage);
		
		PrinterManager printerManager = new PrinterManagerHandler();
		printerManager.initializeManager(componentsUi);
		
		stage.show();
		
	}

}
