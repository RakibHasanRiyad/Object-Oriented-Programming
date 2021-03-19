/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author HP
 */


public class ZChatClient {

    static Socket s;

    static int port;

    static String name;

    public static void main(String[] args) {

        Receivemsg1 receive = new Receivemsg1();
        Sendmsg1 send = new Sendmsg1();

        Thread receiver = new Thread(receive);
        Thread sender = new Thread(send);

        try {
            port = Integer.parseInt(args[2]);
            s = new Socket(args[1], port);
            name = args[0];
            System.out.println("Connected to: " + s.getRemoteSocketAddress());
            System.out.println("Welcome " + name + "!");
            System.out.println("** Note: Type 'bye' and press Enter to disconnect **");

            receiver.start();
            sender.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Sendmsg1 implements Runnable {

    @Override
    public void run() {
        String input;
        PrintWriter out = null;
        try {
            out = new PrintWriter(ZChatClient.s.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (!(input = br.readLine()).equals("bye")) {
                out.println(input);
            }
            out.println("Client disconnected");
            ZChatClient.s.close();
        } catch (IOException e) {
            System.out.println("Disconnected");
        }
    }
}

//Sends
//      String input;
//      PrintWriter out = new PrintWriter(s.getOutputStream(), true);
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      while ((input = br.readLine()).length() > 0){
//        out.println(input);
//      }
class Receivemsg1 implements Runnable {

    @Override
    public void run() {
        String line;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(ZChatClient.s.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while ((line = in.readLine()) != null) {
                if (line.equals("Server disconnected")) {
                    System.out.println("> Server: bye");
                    System.out.println(line);
                    break;
                }
                System.out.println("> Server: " + line);
            }
        } catch (IOException e) {
            System.out.println("Disconnected");
        }
    }
}

//Receives
//      String line;
//      BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//      while((line = in.readLine()) != null) {
//        System.out.println(">>> Server: " + line);
//      }
