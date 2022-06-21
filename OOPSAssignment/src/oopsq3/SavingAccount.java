package oopsq3;
import java.util.Scanner;

public class SavingAccount extends BankAccount{

	@Override
	public void totalcash(int fixedDeposite) {
		System.out.println("SavingAccount : "+ fixedDeposite);
	}
	
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(); 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Fixed deposite Amount");
		int fixedDeposite = scn.nextInt();
		sa.totalcash(fixedDeposite);
	}
}
