
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Withdrawal extends JFrame implements ActionListener{
    String pin ; 
    JTextField amount ;
    JButton withdraw , back ;
    Withdrawal(String pin){
        this.pin = pin;
        setLayout(null);
        
        
         
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(0,0,900,900);
        add(label);
        
        
        JLabel text = new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAWAL");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD, 12));
        text.setBounds(160,290,350,20);
        label.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Railway",Font.BOLD, 15));
        amount.setBounds(170,350,320,25);
        label.add(amount);
        
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(170,485,150,30);
        withdraw.addActionListener(this);
        label.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(340,485,150,30);
        back.addActionListener(this);

        label.add(back);
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==withdraw){
             String withdrawl = amount.getText();
             Date date = new Date();
             if (withdraw.equals("")){
                 JOptionPane.showMessageDialog(null, "AMOUNT DEBITED");
             } else {
                 try{
                     Conn conn = new Conn();
                 String query = "insert into bank values('"+pin+"','"+date+"','Withdrawal','"+withdrawl+"')";
                 conn.s.executeUpdate(query);
                  JOptionPane.showMessageDialog(null,"Rs. "+withdrawl+"Withdrawal Successfully");
                  setVisible(false);
                  new Transaction(pin  ).setVisible(true);
                  
                  
                 }catch(Exception e){
                     System.out.println(e);
                 }
                
             }
         } else  if(ae.getSource()== back){
             setVisible(false);
             new Transaction(pin).setVisible(true);
             
         }
             
         
     }

   
    public static void main(String args[]) {
        new Withdrawal("");
        
    }
}
