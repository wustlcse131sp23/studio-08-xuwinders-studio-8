package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;

	public Date (int month, int day ,int year  ) {
		this.month = month;
		this.day = day;
		this.year = year;
		//this.holiday = false;
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	public static void main(String[] args) {
    	Date today = new Date (4,6,2023);
    	System.out.println(today.toString());
    	Date tmr = new Date (4,7,2023);
    	Date Xmas = new Date (12,25,2022);
    	Date bDay = new Date (10,30,2002);
    	
    	System.out.println(today.equals(tmr));
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(today);
    	list.add(tmr);
    	list.add(Xmas);
    	list.add(Xmas);
    	list.add(bDay);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
   
    	set.add(tmr);
     	set.add(today);
    	set.add(Xmas);
    	set.add(Xmas);
    	set.add(bDay);
    	System.out.println(set);
    }



}
