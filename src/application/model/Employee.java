/**
 * Employee Class for Employee object and its information
 */
package application.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Employee {
	private String Name;
	private String Email;
	private String Phone;
	private String Code;
	private String UserName;
	private String UserPass;
	private String OpenTime;
	private String ClosingTime;
	private ArrayList<Client> clients;
	private ArrayList<Appointment> appointments;
	/**
	 * Employee Constructor
	 * @param name
	 * @param email
	 * @param phone
	 * @param code
	 * @param userName
	 * @param userPass
	 * @param openTime
	 * @param closingTime
	 */
	public Employee(String name, String email, String phone, String code, String userName, String userPass, String openTime, String closingTime) {
		super();
		Name = name;
		Email = email;
		Phone = phone;
		Code = code;
		UserName = userName;
		UserPass = userPass;
		OpenTime = openTime;
		ClosingTime = closingTime;
		clients = new ArrayList<Client>();
		appointments = new ArrayList<Appointment>();
	}
	/**
	 * Gets the name of a employee
	 * @return
	 */
	public String getName() {
		return Name;
	}
	/**
	 * sets the name of a employee
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * gets the email of an employee
	 * @return
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * sets email of employee
	 * @param email
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * gets the phone number of an employee
	 * @return
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * sets phone number for an employee
	 * @param phone
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * gets the username of an employee
	 * @return
	 */
	public String getUserName() {
		return UserName;
	}
	/**
	 * sets the username for an employee
	 * @param userName
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}
	/**
	 * gets user password
	 * @return
	 */
	public String getUserPass() {
		return UserPass;
	}
	/**
	 * sets user password
	 * @param userPass
	 */
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	/**
	 * Gets Employee business code
	 * @return
	 */
	public String getCode() {
		return Code;
	}
	/**
	 * Sets Employee business code
	 * @param code
	 */
	public void setCode(String code) {
		Code = code;
	}
	/**
	 * Gets the opening time for employee
	 * @return
	 */
	public String getOpenTime() {
		return OpenTime;
	}
	/**
	 * Sets the opening time for employee
	 * @param openTime
	 */
	public void setOpenTime(String openTime) {
		OpenTime = openTime;
	}
	/**
	 * Gets the closing time for employee
	 * @return
	 */
	public String getClosingTime() {
		return ClosingTime;
	}
	/**
	 * Sets the closing time for employee
	 * @return
	 */
	public void setClosingTime(String closingTime) {
		ClosingTime = closingTime;
	}
	
	/**
	 * Gets Clients ArrayLists
	 * @return
	 */
	public ArrayList<Client> getClients() {
		return clients;
	}
	/**
	 * Gets Appointments ArrayList
	 * @return
	 */
	public ArrayList<Appointment> getAppointments(){
		return appointments;
	}
	/**
	 * Add Appointment to ArrayList
	 * @param x
	 */
	public void addAppointment(Appointment x){
		appointments.add(x);
	}
	/**
	 * Add Client to ArrayList
	 * @param x
	 */
	public void addClient(Client x){
		clients.add(x);
	}
	/**
	 * Removes client from ArayList
	 * @param x
	 */
	public void removeClient(Client x) {
		clients.remove(x);
	}
	/**
	 * Remove Appointment from ArayLists
	 * @param x
	 */
	public void removeAppointment(Appointment x) {
		appointments.remove(x);
	}
	/**
	 *Transfers Employee object to string 
	 */
	public String toString() {
		String list = "";
	    for(int i = 0; i < appointments.size(); i++) {
	    	list += appointments.get(i) + " \n";
	    }
        return  list;//Name + " " + Email + " " + Phone + " " + OpenTime + " " + ClosingTime + "\n" + list;
	}
	/**
	 * Adds new Employee to employees.csv file
	 * @param e
	 * @throws IOException
	 */
	public void addEmployee(Employee e) throws IOException {
		FileWriter fileWriter = new FileWriter("data/employees.csv", true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println(Name + "," + Email + "," + Phone + "," + Code + "," + UserName + "," +  UserPass + "," + OpenTime + "," + ClosingTime);
		printWriter.close();	
		
	}
}

