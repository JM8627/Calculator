package ru.krista.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double ans = 0;
        char op;
        System.out.print("Enter two numbers: ");
        String str1 = in.nextLine();
        try{
            num1 = Integer.parseInt(str1);
        } catch (NumberFormatException e){
            System.out.println("Не число");
            System.exit(0);
        }
        String str2 = in.nextLine();
        try{
            num2 = Integer.parseInt(str2);
        } catch (NumberFormatException e){
            System.out.println("Не число");
            System.exit(0);
        }
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = in.next().charAt(0);
        switch(op) {
           case '+': ans = num1 + num2;
              break;
           case '-': ans = num1 - num2;
              break;
           case '*': ans = num1 * num2;
              break;
           case '/':{ 
                if (num2 == 0) {
                  System.out.println("На 0 делить нельзя");
                    System.exit(0);
                }
                ans = num1 / num2;
              break;
           }
           default:  System.out.printf("Error! Enter correct operator");
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        in.close();
     }
    }
