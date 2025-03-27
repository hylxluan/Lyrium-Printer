import application.components.LyriumPrinterComponentsImpl;
import application.components.interfaces.LyriumPrinterComponents;

module LyriumPrinter {
	
	uses LyriumPrinterComponents;
	provides LyriumPrinterComponents with LyriumPrinterComponentsImpl;
	
	requires transitive javafx.graphics;
	requires java.desktop;
	requires javafx.controls;
	
	exports application.components.interfaces;
	exports application.start;
	
}