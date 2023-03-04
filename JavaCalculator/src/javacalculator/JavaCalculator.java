/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import java.awt.BorderLayout;
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
        
        
        
        
        
        
    }
    
     


}
