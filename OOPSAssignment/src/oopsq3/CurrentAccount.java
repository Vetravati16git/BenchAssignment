package oopsq3;
import java.util.Scanner;

public class CurrentAccount extends BankAccount{

	@Override
	public void totalcash(int cashCredit) {
		System.out.println("CurrentAccount : "+ cashCredit);
	}
	
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(); 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Cash Credit Amount");
		int cashCredit = scn.nextInt();
		ca.totalcash(cashCredit);
	}
}
