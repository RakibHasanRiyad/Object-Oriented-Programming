/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author HP
 */
public class FileModifiedTime {

    public static void main(String[] argv) throws Exception {
        URL u = new URL("https://www.tutorialspoint.com/cpp_standard_library/cpp_fstream_close.htm");

        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("The last modification time of file is :" + new Date(timestamp));
    }
}
