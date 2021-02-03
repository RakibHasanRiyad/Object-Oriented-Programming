/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.encapsulation;

/**
 *
 * @author HP
 */


// Java program to access JavaBean class 

public class EncapTest2 {

    public static void main(String args[]) {
        Student s = new Student(); // object is created 
        s.setName("GFG"); // setting value to the object 
        System.out.println(s.getName());
    }
}
