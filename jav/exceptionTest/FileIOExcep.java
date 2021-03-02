/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.exceptionTest;



import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author HP
 */




public class FileIOExcep
{
    public void checkFileNotFound()
    {
        try
        {
            FileInputStream in = new FileInputStream("C:\\zzz\\newfile.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
            //---------Need To show-------//
            //System.out.println( fileNotFoundException);
        
        }
    }
    public static void main(String[] args)
    {
        FileIOExcep example = new FileIOExcep();
        example.checkFileNotFound();
    }
}