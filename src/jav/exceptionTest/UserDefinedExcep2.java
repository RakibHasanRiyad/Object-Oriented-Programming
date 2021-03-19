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

class UserDefinedExcep2 extends Exception{
   String str1;
   /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
   UserDefinedExcep2(String str2) {
	str1=str2;
   }
   @Override
   public String toString(){ 
	return ("MyException Occurred: "+str1) ;
   }
}

class ExcepTest{
   public static void main(String args[]){
	try{
            //boolean a= false;
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
                //if(a) 
                throw new UserDefinedExcep("This is My error Message");
	}
	catch(UserDefinedExcep exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}