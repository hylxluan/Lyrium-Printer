package application.manager.handler;

import application.components.implementations.LyriumPrinterComponentsInitImpl;
import application.manager.interfaces.PrinterManager;

public class PrinterManagerHandler implements PrinterManager {
	
	private LyriumPrinterComponentsInitImpl components;

	private void initializeManager(LyriumPrinterComponentsInitImpl components) {
		this.components = components;
	}
	
	@Override
	public void handlePrinterManager() {
		
	}
	
	
}
