package oops2;

import java.util.Scanner;

public class Manager extends Employee{
	
	public void TotalSalary(int Salary) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the incentive");
		int incentive = sc.nextInt();
		System.out.println("Managers Salary : " + (Salary+incentive));
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int Salary = sc.nextInt();
		manager.TotalSalary(Salary);	
	}
}
