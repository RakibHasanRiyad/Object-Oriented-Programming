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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageFrame extends JPanel {

   @Override
   public void paint(Graphics g) {
      Image img = createImageWithText();
      g.drawImage(img, 50,50,this);
   }

   private Image createImageWithText() {
      BufferedImage bufferedImage = new BufferedImage(50,50,BufferedImage.TYPE_INT_RGB);
      BufferedImage bufferedImageOut = new BufferedImage(500,500,BufferedImage.TYPE_INT_RGB);

      try{
 
            URL url =new URL("https://upload.wikimedia.org/wikipedia/commons/8/84/Bangladesh_Open_University_Dhaka.jpg");
            // read the url
           bufferedImage = ImageIO.read(url);
 
           Graphics2D g2d = bufferedImageOut.createGraphics();
           g2d.drawImage(bufferedImage, 0, 0, 500, 500, null);
           g2d.dispose();
           
            // for png 
            //ImageIO.write(bufferedImage, "png",new File("C:\\zzz\\network\\bou.png"));
 
            // for jpg
            //ImageIO.write(bufferedImage, "jpg",new File("C:\\zzz\\network\\bou.jpg"));
 
        }catch(IOException e){
            e.printStackTrace();
        }
      
      
      return bufferedImageOut;
   }
   
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.getContentPane().add(new ImageFrame());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(620, 650);
      frame.setBackground(new Color(144,238,144));
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}