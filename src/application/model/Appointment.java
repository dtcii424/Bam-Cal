/**
 * Appointment Class for Appointment object and its information
 */
package application.model;


public class Appointment {
	private String name, doctor, date, time;
	/**
	 * constructor for appointment object
	 * @param name string
	 * @param doctor string
	 * @param date string
	 * @param time string
	 */
	public Appointment(String name, String doctor, String date, String time) {
		super();
		this.name = name;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
	}
	/**
	 * gets the name for appointment
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets the name for appointment
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * gets the doctor for appointment
	 * @return
	 */
	public String getDoctor() {
		return doctor;
	}
	/**
	 * sets the doctor for appointment
	 * @param doctor
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	/**
	 * gets the date for appointment
	 * @return
	 */
	public String getDate() {
		return date;
	}
	/**
	 * sets the date for appointment
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * gets the time for appointment
	 * @return
	 */
	public String getTime() {
		return time;
	}
	/**
	 * sets the time for appointment
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * Takes a time and transfers it to 12 hr time frame
	 * @param time
	 * @return
	 */
	public static String clientTime(String time) {
        String clientTime = "";
		String[] u = time.split(":");
		int num = Integer.parseInt(u[0]);
		
		if (num < 12 && num != 0){
            return time + " AM";
		}
        else if (num > 12){
            num -= 12; 
            clientTime = String.valueOf(num) + ":" + u[1];
            return clientTime + " PM";
        }
        else if (num == 12){
            return time + " PM";
        }
        else if (num == 0){
            return "12:" + u[1] + " AM";
        }
		
		return null;

	}
	

	@Override
	/**
	 * transfers Appointment object to string for Employees
	 */
	public String toString() {
		String cTime = clientTime(time);
		return name + " - " + cTime + " " + date;
	}
	/**
	 * transfers Appointment object to string for Clients
	 */
	public String toStringClient() {
		String cTime = clientTime(time);
		return doctor + " - " + cTime + " " + date;
	}
	
	
	
}
