import application.components.implementations.LyriumPrinterComponentsInitImpl;
import application.components.interfaces.LyriumPrinterComponents;

module LyriumPrinter {
	
	uses LyriumPrinterComponents;
	provides LyriumPrinterComponents with LyriumPrinterComponentsInitImpl;
	
	requires transitive javafx.graphics;
	requires java.desktop;
	requires javafx.controls;
	
	exports application.components.interfaces;
	exports application.start;
	
}