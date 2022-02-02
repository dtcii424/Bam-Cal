/**
 * Client Class for Client object and its information
 */
package application.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {
	private String Name;
	private String Email;
	private String Phone;
	private String BirthDate;
	private String Doctor;
	private String Username;
	/**
	 * Client constructor
	 * @param name
	 * @param email
	 * @param phone
	 * @param birthDate
	 * @param doctor
	 * @param username
	 */
	public Client(String name, String email, String phone, String birthDate, String doctor, String username) {
		super();
		Name = name;
		Email = email;
		Phone = phone;
		BirthDate = birthDate;
		Doctor = doctor;
		Username = username;
	}
	/**
	 * gets the name of a client
	 * @return
	 */
	public String getName() {
		return Name;
	}
	/**
	 * sets the name for a client
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * Gets the email of a client
	 * @return
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * Sets the enmail for client
	 * @param email
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * Gets the clients phone number
	 * @return
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * Sets client phone number
	 * @param phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * Gets the birthdate of a client
	 * @return
	 */
	public String getBirthDate() {
		return BirthDate;
	}
	/**
	 * sets a clients birthdate
	 * @param birthDate
	 */
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	/**
	 * Gets Client doctor
	 * @return
	 */
	public String getDoctor() {
		return Doctor;
	}
	/**
	 * sets the doctor for client
	 * @param doctor
	 */
	public void setDoctor(String doctor) {
		Doctor = doctor;
	}
	/**
	 * Gets the username of Client
	 * @return
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * Sets the username for a client
	 * @param username
	 */
	public void setUsername (String username) {
		Username = username;
	}
	/**
	 * Transfers Client object to String
	 */
	public String toString() {
		return  "\t" + Name + " " + Email + " " + Phone;
	}
	/**
	 * Adds new Client object to clients.csv file
	 * @param c
	 * @throws IOException
	 */
	public void addClient(Client c) throws IOException {
		FileWriter fileWriter = new FileWriter("data/clients.csv", true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println(Name + "," + Email + "," + Phone + "," + BirthDate + "," + Doctor + ","  + Username);
		printWriter.close();	
	}
	
}
