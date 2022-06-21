package oops2;

import java.util.Scanner;

public class Labour extends Employee{
	
	public void TotalSalary(int salary) {
		System.out.println("Labour Salary : " + (1.5*salary));
	}
	
	public static void main(String[] args) {
		Labour labour = new Labour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int Salary = sc.nextInt();
		labour.TotalSalary(Salary);	
	}

	
}
