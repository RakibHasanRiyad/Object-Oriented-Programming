/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author HP
 */
public class FileSize {
   public static void main(String[] argv) throws Exception {
      int size;
      URL url = new URL("https://www.tutorialspoint.com/javaexamples/net_multisoc.htm");
      URLConnection conn = url.openConnection();
      size = conn.getContentLength();
      if (size < 0) System.out.println("file size is empty.");
      else System.out.println("File size is = " + size + "bytes");
      conn.getInputStream().close();
   }
}