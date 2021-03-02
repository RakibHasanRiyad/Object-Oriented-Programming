/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ReadWriteFileTest1 {

    public static void main(String[] args) throws FileNotFoundException {
// Specify a filename directly
        File inFile = new File("text1.txt");
        PrintWriter out;
        try (Scanner in = new Scanner(inFile)) {
            out = new PrintWriter("text1.out.txt");
            int lineNumber = 1;
            // Read the input and write the output
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println("/* " + lineNumber + " */ " + line);
                lineNumber++;
            }
        }
        out.close();
        System.out.println("Program terminated.");
    }
}
