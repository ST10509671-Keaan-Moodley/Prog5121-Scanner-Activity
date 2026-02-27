package com.mycompany.scanneractivity;

import java.util.Scanner;


public class ScannerActivity {

    public static void main(String[] args) {
        String name;
        int num1;
        int num2;
        int sum1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name and surname:");
        name = scanner.nextLine();
        System.out.print("Enter your first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter your second number:");
        num2 = scanner.nextInt();
        sum1 = num1 + num2;
        
        System.out.println("Name: " + name);
        System.out.println("Sum: " + sum1);
        scanner.close();
        
               
       
     
    

        
       
        
       
       
        

        
    }
}
