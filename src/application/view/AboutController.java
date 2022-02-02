/**
 * Controller for About Page View
 */
package application.view;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AboutController implements EventHandler <ActionEvent> {
	
	@Override
	/**
	 * Back Button
	 */
	public void handle(ActionEvent event) {
		try {
			Main.showLoginView();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
