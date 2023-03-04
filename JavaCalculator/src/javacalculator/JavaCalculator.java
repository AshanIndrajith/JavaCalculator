/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author INSIGHT
 */
public class JavaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        clabody cal = new clabody();
    
    
    
    
    }
    
}

class clabody extends JFrame{

    public clabody() {
        
        setVisible(true);
        setTitle("My Cal");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        BorderLayout bd=new BorderLayout();
        JPanel p1=new JPanel();
        p1.setBackground(Color.red);
        JPanel p2=new JPanel();
        p2.setBackground(Color.GREEN);
        
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        
        TextField t1 =new TextField(30);
        p1.add(t1);
        
        GridLayout gl= new GridLayout(3,3);
        p2.setLayout(gl);
        
        Button b1= new Button("1");
        b1.setBackground(Color.red);
        p2.add(b1);
        
        Button b2= new Button("2");
        b2.setBackground(Color.blue);
        p2.add(b2);
        
        Button b3= new Button("3");
        b3.setBackground(Color.gray);
        p2.add(b3);
        
        Button b4= new Button("4");
        b4.setBackground(Color.orange);
        p2.add(b4);
        
        Button b5= new Button("5");
        b5.setBackground(Color.DARK_GRAY);
        p2.add(b5);
        
        Button b6= new Button("6");
        b6.setBackground(Color.PINK);
        p2.add(b6);
        
        Button b7= new Button("7");
        b7.setBackground(Color.red);
        p2.add(b7);
        
        Button b8= new Button("8");
        b8.setBackground(Color.darkGray);
        p2.add(b8);
        
        Button b9= new Button("9");
        b9.setBackground(Color.cyan);
        p2.add(b9);
        
        
        
        
        
        
        
        
        
        
    }
    
     


}
