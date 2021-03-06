/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class ReadFileDemo {
   public static void main(String[] args) throws IOException {         
      //Specify the path of the file here
      File file = new File("C:\\zzz\\myfile.txt");
      BufferedInputStream bis = null;
      FileInputStream  fis= null;

      try
      {
          
          //= new BufferedInputStream (new FileInputStream("out.txt"));
          //FileInputStream to read the file
          fis = new FileInputStream(file);

          /*Passed the FileInputStream to BufferedInputStream
           *For Fast read using the buffer array.*/
          bis = new BufferedInputStream(fis);

          /*available() method of BufferedInputStream
           * returns 0 when there are no more bytes
           * present in the file to be read*/
          while( bis.available() > 0 ){             	
              System.out.print((char)bis.read());
          }

       }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe); 
        }
        finally
        {
            try{
               if(bis != null && fis!=null)
               {
       	          fis.close();
                  bis.close();
               }      
             }catch(IOException ioe)
              {
                  System.out.println("Error in InputStream close(): " + ioe);
              }         
        }
   }    
}