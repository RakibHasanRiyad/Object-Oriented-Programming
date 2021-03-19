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
public class Temperature {
    
    private float tempValue;
    private char scale;
    
    //Setting values
    public void setTempValue(float temp)
    {
        this.tempValue = temp;
    }
    
    public void setScaleValue(char c)
    {
        this.scale = c;
    }
    
    ///Getting Value
    
    public float getTempValue()
    {
        return this.tempValue;
    }
    
    public char getScaleValue()
    {
        return this.scale;
        
    }
    
    
    
    
    public static void main(String args[])
    {
    
        System.out.println();
        
    }
}
