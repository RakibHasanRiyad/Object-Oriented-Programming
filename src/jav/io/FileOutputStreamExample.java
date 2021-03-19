/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.io;

/**
 *
 * @author HP
 */
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\jaynul.txt");
            String s = "Welcome to BOU.";
            int a = 1024;
            String s2;
            s2 = String.valueOf(a) ;
 
            byte b[] = s2.getBytes();//converting string into byte array    
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
