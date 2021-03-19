/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */

public class SplitHostIP {
   public static void main(String[] args) {
      InetAddress ipadd;
      String hostname;
      try {
         ipadd = InetAddress.getLocalHost();
         hostname = ipadd.getHostName();
         System.out.println("Your IP address : " + ipadd);
         System.out.println("Your Hostname : " + hostname);
      } catch (UnknownHostException e) {
      }
   }
}