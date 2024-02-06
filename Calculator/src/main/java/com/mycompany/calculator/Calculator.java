/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import java.util.Scanner;
/**
 *
 * @author Mpilonhle
 */
public class Calculator {

    public static void main(String[] args) {
      char operator;
      Double num1, num2, result;
      
      //create object of scanner class//
      Scanner input = new Scanner(System.in);
      
     //user to enter a number//
      System.out.println("Please enter first number");
      num1 = input.nextDouble();
      
      //user to enter a number //
      System.out.println("Please enter second number");
      num2 = input.nextDouble();
      
      //user to enter an operator//
       System.out.println("Please enter an operator");
        operator = input.next().charAt(0);
        
        switch (operator) {
            //perform additon//
            case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
                break;
        
            //perform subtraction//    
            case '-':
            result = num1 + num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            
            //perform division//    
            case '/':
             if (num2 != 0) {
                    result = num1 / num2;
                    System.err.println(num1 + "/" + num2 + result);
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                
            //perform multiplication// 
            case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
                break;
        //if user enters invalid operator//        
        default:
        System.out.println("Invalid operator!");
        break;
        }
            
        }
    }

