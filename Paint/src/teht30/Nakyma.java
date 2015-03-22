 package teht30;

 import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 import javax.swing.*;

 public class Nakyma extends JFrame{

 private Naytto naytto;
 public Nakyma() {

 naytto = new Naytto();
 naytto.addMouseListener(new Hiirikuuntelija());
 naytto.addMouseMotionListener(new Hiirikuuntelija());
 add(naytto, BorderLayout.CENTER);
 pack();
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
private class Hiirikuuntelija extends MouseAdapter{
 public void mouseDragged(MouseEvent e) {
 naytto.viiva(e.getX(),e.getY());
     System.out.println(e.getX());
     System.out.println(e.getY());
 }
 public void mousePressed(MouseEvent e) {
 naytto.klikki(e.getX(),e.getY());
     System.out.println("Klikki!");
 }
 }


 public static void main(String[] args){
 new Nakyma();
 }
 }