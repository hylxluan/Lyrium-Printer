package application.components.interfaces;

import java.util.ServiceLoader;

import javafx.stage.Stage;

public interface LyriumPrinterComponents {
	
	void initializeUi(Stage stage);
	
	void createSearchButton();
	
	void createPrintDocButton();
	
	void createHeadAlignmentButton();
	
	void createNozzleCheckButton();
	
	
	static LyriumPrinterComponents createServiceLoader() {
		return ServiceLoader.load(LyriumPrinterComponents.class).findFirst().get();
	}
}
