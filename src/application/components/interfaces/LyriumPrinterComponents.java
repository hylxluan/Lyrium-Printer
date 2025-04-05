package application.components.interfaces;

import java.util.ServiceLoader;

import javafx.stage.Stage;

public interface LyriumPrinterComponents {
	
	void initializeUi(Stage stage);
	
	static LyriumPrinterComponents createServiceLoader() {
		return ServiceLoader.load(LyriumPrinterComponents.class).findFirst().get();
	}
}
