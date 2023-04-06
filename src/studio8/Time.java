package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	
	public Time (int hour, int minute  ) {
		this.hour = hour;
		this.minute = minute;
	}
	public String toString() {
		return hour + ":" + minute;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	public static void main(String[] args) {
		Time now = new Time (13,15);
    	System.out.println(now.toString());
    	Time then = new Time (13,20);
    	System.out.println(now.equals(then));
    }

}