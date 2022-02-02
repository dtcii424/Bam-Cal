/**
 * Main function to run the entire Application BAM-Cal
 */
package application;

import java.io.IOException;

//import application.view.EmployeeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	public static Stage primaryStage;
	private static AnchorPane loginLayout;
	/**
	 * Start function to setup the stage
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Bam-Cal");
		showLoginView();
	}
	/**
	 * Shows the login view
	 * @throws IOException
	 */
	public static void showLoginView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Login.fxml"));
		loginLayout = loader.load();
		Scene scene = new Scene(loginLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * Shows the Employee View
	 * @throws IOException
	 */
	public static void showEmployeeView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Employee.fxml"));
		AnchorPane employeeLayout = loader.load();
		loginLayout.getChildren().setAll(employeeLayout);
	}
	/**
	 * Shows the Client View
	 * @throws IOException
	 */
	public static void showClientView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Client.fxml"));
		AnchorPane clientLayout = loader.load();
		loginLayout.getChildren().setAll(clientLayout);
	}
	/**
	 * Shows the Create New User View
	 * @throws IOException
	 */
	public static void showCreateNewUserView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/CreateNewUser.fxml"));
		AnchorPane NewUserLayout = loader.load();
		loginLayout.getChildren().setAll(NewUserLayout);
	}
	/**
	 * Shows the Create New Client View
	 * @throws IOException
	 */
	public static void showCreateNewClientView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/CreateNewClient.fxml"));
		AnchorPane NewClientLayout = loader.load();
		loginLayout.getChildren().setAll(NewClientLayout);
	}
	/**
	 * Shows the Create New Employee View
	 * @throws IOException
	 */
	public static void showCreateNewEmployeeView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/CreateNewEmployee.fxml"));
		AnchorPane NewEmployeeLayout = loader.load();
		loginLayout.getChildren().setAll(NewEmployeeLayout);
	}
	/**
	 * Shows the Add Appointment View
	 * @throws IOException
	 */
	public static void showAddAppointment() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddAppointment.fxml"));
		AnchorPane clientLayout = loader.load();
		loginLayout.getChildren().setAll(clientLayout);
	}
	/**
	 * Shows the Delete Employee View
	 * @throws IOException
	 */
	public static void showDeleteEmployee() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/DeleteAccount.fxml"));
		AnchorPane clientLayout = loader.load();
		loginLayout.getChildren().setAll(clientLayout);
	}
	/**
	 * Shows the Delete Appointment View
	 * @throws IOException
	 */
	public static void showDeleteAppointment() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/DeleteAppointment.fxml"));
		AnchorPane clientLayout = loader.load();
		loginLayout.getChildren().setAll(clientLayout);
	}
	/**
	 * Show Edit Account View
	 * @throws IOException
	 */
	public static void showEditAccount() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/EditAccount.fxml"));
		AnchorPane editAccount = loader.load();
		loginLayout.getChildren().setAll(editAccount);
	}
	/**
	 * Show Get Client Info View
	 * @throws IOException
	 */
	public static void showGetClientInfo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/GetClientInfo.fxml"));
		AnchorPane clientLayout = loader.load();
		loginLayout.getChildren().setAll(clientLayout);
	}
	/**
	 * Show About View/How to use application (ReadMe.txt)
	 * @throws IOException
	 */
	public static void showAboutView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/About.fxml"));
		AnchorPane aboutLayout = loader.load();
		loginLayout.getChildren().setAll(aboutLayout);
		
	}
	/**
	 *	main function that starts the program
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}


