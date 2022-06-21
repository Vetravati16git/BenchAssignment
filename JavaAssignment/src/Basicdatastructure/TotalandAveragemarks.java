package Basicdatastructure;
import java.util.Scanner;


public class TotalandAveragemarks {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int grandTotal = 0;
        
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.print("Enter name of subject " + (i+1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter score by student in each subject " + (i+1) + ": ");
            totalmarks[i] = in.nextInt();
            
            System.out.println("Total = " + totalmarks[i]);
            double avg =  totalmarks[i] /(double)n;
            System.out.println("Average = " + avg);
        
            grandTotal += totalmarks[i];
            
        
        }
        System.out.println("Total = " +grandTotal );
        double avg = grandTotal / (double)n;
        System.out.println("Average = " + avg);
    }
}