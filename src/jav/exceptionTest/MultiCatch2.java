/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.exceptionTest;

/**
 *
 * @author HP
 */

public class MultiCatch2 {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
