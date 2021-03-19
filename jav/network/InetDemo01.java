/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

/**
 *
 * @author HP
 */
import java.io.*;
import java.net.*;

public class InetDemo01 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            InetAddress ip2 = InetAddress.getByName("www.bou.edu.bd");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            
            System.out.println("Host Name: " + ip2.getHostName());
            System.out.println("IP Address: " + ip2.getHostAddress());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
