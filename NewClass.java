/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewClass extends JFrame implements ActionListener{
  
    JFrame frame = new JFrame();
    
    
    JPanel cardPanel = new JPanel();
    CardLayout cardLayout = new CardLayout();
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
   
    JButton button1 = new JButton("Switch to Button 1");
    JButton button2 = new JButton("Switch to Button 2");
  
    public NewClass(){
 
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        cardPanel.setLayout(cardLayout);
        
        button1.setSize(100, 100);
        button1.addActionListener(this);
        button2.setSize(100,100);
        button2.addActionListener(this);
         
        panel1.add(button1);
        panel2.add(button2);
        
        panel1.add(new JLabel("Panel 1"));
        panel2.add(new JLabel("Panel 2"));
        
        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == button1) {
            cardLayout.show(cardPanel, "Panel 1");
       }
       if (e.getSource() == button2) {
           cardLayout.show(cardPanel, "Panel 2");
       }
    }
 
    public static void main (String [] args) {
        NewClass obj = new NewClass();
    }
}