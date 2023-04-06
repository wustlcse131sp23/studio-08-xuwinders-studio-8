package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public Date getDate() {
		return this.date;
	}
	

	public String toString() {
		return date.toString() + " at " + time.toString();
	}



	public static void main(String[] args) {
		Appointment a = new Appointment(new Date (12, 15, 2023), new Time (11, 30));
		Appointment b = new Appointment(new Date (12, 16, 2023), new Time (12, 30));
		Appointment c = new Appointment(new Date (12, 15, 2023), new Time (11, 30));
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		LinkedList<Appointment> list = new LinkedList<Appointment>();      
		list.add(a);                                     
		list.add(b);                                       
		list.add(c);                                      
                                   
		System.out.println(list);                            
		
	}

}
