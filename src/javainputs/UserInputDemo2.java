/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainputs;

import java.util.Scanner;

/**
 *
 * @author HP
 */
class UserInputDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");
        String str = sc.nextLine();              //reads string  
        System.out.println("You have entered: " + str);
    }
}
