package application.manager.interfaces;

import application.components.interfaces.LyriumPrinterComponents;

public interface PrinterManager {
	
	void initializeManager(LyriumPrinterComponents componentsUi);
	
	void handlePrinterManager();
	
}
