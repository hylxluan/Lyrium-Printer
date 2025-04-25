package application.manager.handler;

import application.components.interfaces.LyriumPrinterComponents;
import application.manager.interfaces.PrinterManager;

public class PrinterManagerHandler implements PrinterManager {
	
	private LyriumPrinterComponents components;

	

	@Override
	public void initializeManager(LyriumPrinterComponents components) {
		this.components = components;
	}
	
	@Override
	public void handlePrinterManager() {
		
	}
	
}
