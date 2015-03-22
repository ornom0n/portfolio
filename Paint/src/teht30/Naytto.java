 package teht30;

 import java.awt.*;
 import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
 import javax.swing.*;


 public class Naytto extends JPanel{
 private int yalku;
 private int xalku;
 private int xloppu;
 private int yloppu;
 private BufferedImage img;
 private Graphics puskuri;
 private ArrayList<Viiva> viivat;
 public Naytto() {
 viivat = new ArrayList<Viiva>();
 setPreferredSize(new Dimension(400,300));
 setBackground(Color.YELLOW);
 img=new BufferedImage(400,300,BufferedImage.TYPE_INT_RGB);
 puskuri = img.getGraphics();
 puskuri.setColor(Color.YELLOW);
 puskuri.fillRect(0,0,400,300);
 
 }
 public void klikki(int x,int y){
 xalku=x;
 yalku=y;
 
}
public void viiva(int x,int y){
 xloppu=x;
 yloppu=y;
 viivat.add(new Viiva(xalku,yalku,xloppu,yloppu));
 repaint();
}


 public synchronized void paintComponent(Graphics g){
 super.paintComponent(g);
 g.setColor(Color.RED);
 for(Viiva viiva : viivat){
     g.drawLine(viiva.getX1(), viiva.getY1(), viiva.getX2(), viiva.getY2());
 }
 
 xalku=xloppu;
 yalku=yloppu;
 }
 }