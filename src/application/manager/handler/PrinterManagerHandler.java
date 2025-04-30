package application.manager.handler;

import application.components.implementations.LyriumPrinterComponentsInitImpl;
import application.manager.interfaces.PrinterHandler;

public class PrinterManagerHandler implements PrinterHandler {
	
	private LyriumPrinterComponentsInitImpl components;


	@Override
	public void initHandler(LyriumPrinterComponentsInitImpl components) {
		this.components = components;
		dragAndDropFieldHandler();
	}
	
	private void dragAndDropFieldHandler() {
		
	}
	
}
