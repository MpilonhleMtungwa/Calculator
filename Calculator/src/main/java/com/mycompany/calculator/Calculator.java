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
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter first number");
      num1 = input.nextDouble();
      
      System.out.println("Please enter second number");
      num2 = input.nextDouble();
      
       System.out.println("Please enter an operator");
        operator = input.next().charAt(0);
        
        switch (operator) {
            case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
                break;
        
            case '-':
            result = num1 + num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                
            case '/':
             if (num2 != 0) {
                    result = num1 / num2;
                    System.err.println(num1 + "/" + num2 + result);
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                
            case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
                break;
                
        default:
        System.out.println("Invalid operator!");
        break;
        }
            
        }
    }

