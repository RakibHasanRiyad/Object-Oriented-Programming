/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

/**
 *
 * @author HP
 */
public class This {
    int x;
    
    public This(int x)
    {
        this.x = x;
    }
    
    public static void main (String Args[])
    {
        This myObj = new This(5);

        System.out.println( myObj);
        System.out.println("Value of x = " + myObj.x);
    }
}
