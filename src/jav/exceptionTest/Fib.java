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
public class Fib {
 
    public static int FIbo(int n){
    
        if (n==0) return 0;
        //System.out.println("Fibonacci Series");
        return FIbo(n-1)+FIbo(n-2);
    }
    
    public static void main(String args[]){
    
        
        FIbo(2);
        
    }
    
    
}
