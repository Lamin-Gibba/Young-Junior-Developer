 import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawda Jammeh
 */
public class MultiplicationTable {
    public static void main(String args[]){
    int n, c;
    
    
    System.out.println("Enter an integer to print it's multiplication table: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println("Multiplication table of " + n);
    
    for (c = 1; c <= 10; c++ )
    System.out.println(n + "*" + c + " = " + (n*c));
    
    }
}
