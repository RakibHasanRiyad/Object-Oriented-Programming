/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainputs;

import java.util.*;

/**
 *
 * @author HP
 */
class UserInputDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.print("Enter second number- ");
        int b = sc.nextInt();
        System.out.print("Enter third number- ");
        int c = sc.nextInt();
        int d = a + b + c;
        System.out.println("Total= " + d);
    }
}
