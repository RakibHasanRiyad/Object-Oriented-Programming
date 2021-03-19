/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicprog;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StringToInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d", result);
        System.out.printf("\n");
    }
}
