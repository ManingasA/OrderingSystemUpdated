
package orderingsystem;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class NewClass1 {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel textPanel = new JPanel();
        
        JScrollPane scroll;
        
        JLabel qty = new JLabel("QTY");
        JLabel pName = new JLabel("Product Name");
        JLabel price = new JLabel("Price");
        JLabel amount = new JLabel("Amount");
        
        Date newDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLLL dd, yyyy");
        
        JLabel date = new JLabel(dateFormat.format(newDate));
        JLabel time = new JLabel(timeFormat.format(newDate));
        
        JTextArea receipt = new JTextArea();
        String text = "    1" + "          Creamsilk" + "           8.00" + "        8.00"
             + "\n" + "    2" + "          Downy" + "                10.00" + "       10.00";
        /*
        JTable receipt = new JTable();
        Object[] columns = {"", "", "", ""};
        Object[][] rows = {{"1", "Downy", "12", "12"},
                           {"2", "Crackers", "10", "20"},
                           {"3", "Piattos", "30", "90"},
                           {"4", "Piattos", "30", "90"},
                           {"5", "Piattos", "30", "90"},
                           {"6", "Piattos", "30", "90"},
                           {"7", "Piattos", "30", "90"},
                           {"8", "Piattos", "30", "90"},
                           {"9", "Piattos", "30", "90"},
                           {"10", "Piattos", "30", "90"},
                           {"11", "Piattos", "30", "90"},
                           {"12", "Piattos", "30", "90"},
                           {"13", "Piattos", "30", "90"},
                           {"14", "Pillows", "50", "200"}
        }
        DefaultTableModel model = new DefaultTableModel();;*/
        
    public NewClass1() {
        
        frame.setLayout(null);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        panel.setBounds(100, 100, 300, 300);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        
        date.setBounds(10, 0, 100, 30);
        time.setBounds(10, 25, 100, 30);
        
        qty.setBounds(15, 70, 50, 30);
        pName.setBounds(50, 70, 100, 30);
        price.setBounds(145, 70, 50, 30);
        amount.setBounds(190, 70, 50, 30);
                
        receipt.setText(text);
        receipt.setBackground(new Color(230, 230, 230));
        receipt.setBounds(0, 0, 290, 100);
        receipt.setLineWrap(true);
        receipt.setBorder(null);
        /*model.setColumnIdentifiers(columns);
        for(Object[]row : rows) {
        model.addRow(row);
        }
        receipt.setModel(model);
        receipt.setBounds(0, 20, 100, 20);  
        receipt.setBackground(Color.WHITE);
        receipt.getTableHeader().setVisible(false);
     
        receipt.getColumnModel().getColumn(0).setPreferredWidth(40);
        receipt.getColumnModel().getColumn(1).setPreferredWidth(100);
        receipt.getColumnModel().getColumn(2).setPreferredWidth(60);
        receipt.getColumnModel().getColumn(3).setPreferredWidth(60);*/
        
        scroll = new JScrollPane(receipt);
        scroll.setBounds(10, 100, 290, 100);
        scroll.setBorder(null);
        
        panel.add(scroll);
        panel.add(qty);
        panel.add(pName);
        panel.add(price);
        panel.add(amount);
        panel.add(date);
        panel.add(time);
        
        frame.add(panel);

        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       
    }
    
    public static void main (String []args) {
        NewClass1 obj = new NewClass1();
    }
}
