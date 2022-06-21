package Basicdatastructure;

import java.util.*;

public class PassFail {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter english marks =");
		int eng=sc.nextInt();
		System.out.println("Enter math marks =");
		int math=sc.nextInt();
		System.out.println("Enter science marks =");
		int sci=sc.nextInt();
		if (eng>=60 && math>=60 && sci>=60) {
			System.out.println("Passed");
		}
		else if((eng>60 && math>60)|| (eng>60 && sci>60)||(math>60 && sci>60)){
			System.out.println("Promoted");
		}
		else if((eng>60 && math<60 && sci<60)||(eng<60 && math>60 && sci<60)||(eng<60 && math<60 && sci>60)||(eng<60 &&  math<60 && sci<60))
		{
			System.out.println("fail");
		}
		

	}

}