/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicprog;

import java.io.Console;

/**
 *
 * @author HP
 */
import java.io.Console;
import java.io.IOException;

public class ConsoleT {

    public static void main(String args[]) throws IOException {
        Console console = System.console();
        System.out.println("Reading input from console using Console in Java6 ");
        System.out.println("Please enter your input: ");
        String input = console.readLine();
        System.out.println("User Input from console: " + input);
        System.out.println("Reading password from Console in Java: "); //password will not be echoed to console and stored in char array char[] password = console.readPassword(); System.out.println("Password entered by user: " + new String(password)); } }

    }
}