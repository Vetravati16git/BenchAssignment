package collection4;
import java.util.LinkedList;
public class Date {
	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("23-12-2000");
	l.add("12-12-2021");
	l.add("16-03-1998");
	l.add("26-04-2022");
	l.add("26-10-2001");
	for(int i=0;i<l.size();i++) {
	 String s=l.get(i).toString();
	 String [] s1=s.split("-");
	 int year=Integer.parseInt(s1[2]);
	 if((year%4==0)&& (year % 100!= 0)||year%400==0) {
		 System.out.println("The date is "+l.get(i)+" is a leap year");
	 }
	 else
		 System.out.println("The date is "+l.get(i)+" is a not leap year");
	}
}
}
