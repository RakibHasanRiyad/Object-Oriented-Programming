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

public class NullPointer {    

   public static void main(String args[])
   {
	try{
		String str=null;
		System.out.println (str.length());
	}
        catch(NullPointerException e){
		System.out.println("NullPointerException..");
	}
   }
}
