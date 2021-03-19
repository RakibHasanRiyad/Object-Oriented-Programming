/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */


public class SocketAtSpecificPort {

    public static void main(String[] args) throws IOException {
        try {
            InetAddress addr = InetAddress.getByName("157.240.192.35");
            Socket theSocket = new Socket(addr, 80);
            System.out.println("Connected to "
                    + theSocket.getInetAddress()
                    + " on port " + theSocket.getPort() + " from port "
                    + theSocket.getLocalPort() + " of "
                    + theSocket.getLocalAddress());
        } catch (UnknownHostException e) {
            System.err.println("I can't find " + e);
        } catch (SocketException e) {
            System.err.println("Could not connect to " + e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
