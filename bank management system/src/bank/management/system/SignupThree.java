
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;
 import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4, c5,c6, c7,c8;
    JButton Submit, Cancel;
    String formno;
    
    SignupThree(String formno ){
         this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD, 22));
        type.setBounds(100,140,400,40);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD, 18));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,40);
        add(r1);
        
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD, 18));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,400,40);
        add(r2);
        
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD, 18));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,40);
        add(r3);
        
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD, 18));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,400,40);
        add(r4);
        
        
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(r1);
        typeGroup.add(r2);
        typeGroup.add(r3);
        typeGroup.add(r4);
        
        
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD, 22));
        card.setBackground(Color.WHITE);
        card.setBounds(100,260,250,40);
        add(card);
        
        JLabel details = new JLabel(" YOUR 16 DIGIT Card Number");
        details.setFont(new Font("Raleway",Font.BOLD, 12));
        details.setBackground(Color.WHITE);
        details.setBounds(100,300,250,20);
        add(details);
        
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-8463");
        number.setFont(new Font("Raleway",Font.BOLD, 22));
        number.setBackground(Color.WHITE);
        number.setBounds(300,260,260,40);
        add(number);
        
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD, 22));
        pin.setBackground(Color.WHITE);
        pin.setBounds(100,330,250,40);
        add(pin);
        JLabel detail = new JLabel(" YOUR 4 DIGIT PIN ");
        detail.setFont(new Font("Raleway",Font.BOLD, 12));
        detail.setBackground(Color.WHITE);
        detail.setBounds(100,380,250,20);
        add(detail);
        
        
        JLabel code = new JLabel("XXXX");
        code.setFont(new Font("Raleway",Font.BOLD, 22));
        code.setBackground(Color.WHITE);
        code.setBounds(300,330,260,40);
        add(code);
        
        
        JLabel facility = new JLabel("Services Required:");
        facility.setFont(new Font("Raleway",Font.BOLD, 22));
        facility.setBackground(Color.WHITE);
        facility.setBounds(100,410,260,40);
        add(facility);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD, 18));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,450,200,30);
        add(c1);
        c2 = new JCheckBox("CREDIT CARD");
        c2.setFont(new Font("Raleway",Font.BOLD, 18));
        c2.setBackground(Color.WHITE);
        c2.setBounds(300,450,200,30);
        add(c2);
        c3 = new JCheckBox("INTERNET BANKING");
        c3.setFont(new Font("Raleway",Font.BOLD, 18));
        c3.setBackground(Color.WHITE);
        c3.setBounds(300,480,290,30);
        add(c3);
        c4 = new JCheckBox("MOBILE BANKING");
        c4.setFont(new Font("Raleway",Font.BOLD, 18));
        c4.setBackground(Color.WHITE);
        c4.setBounds(100,480,200,30);
        add(c4);
        c5 = new JCheckBox("EMAIL & SMS ALERTS");
        c5.setFont(new Font("Raleway",Font.BOLD, 18));
        c5.setBackground(Color.WHITE);
        c5.setBounds(300,510,290,30);
        add(c5);
        c6 = new JCheckBox("CHEQUE BOOK");
        c6.setFont(new Font("Raleway",Font.BOLD, 18));
        c6.setBackground(Color.WHITE);
        c6.setBounds(100,510,200,30);
        add(c6);
        c7 = new JCheckBox("E- STATEMENT");
        c7.setFont(new Font("Raleway",Font.BOLD, 18));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,540,200,30);
        add(c7);
        
        c8 = new JCheckBox("I hereby declare that the information provided above is correct");
        c8.setFont(new Font("Raleway",Font.BOLD, 15));
        c8.setBackground(Color.WHITE);
        c8.setBounds(100,570,800,30);
        add(c8);
        
        
        
        Submit = new JButton("Submit");
        Submit.setBounds(250,620,100,30);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
         
         Cancel = new JButton("Cancel");
         Cancel.setBounds(350,620,100,30);
         Cancel.setBackground(Color.BLACK);
         Cancel.setForeground(Color.WHITE);
         Cancel.addActionListener(this);
         add(Cancel);
        
        setSize(850,820);
        setLocation(350,0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()== Submit){
            String type = null;
            if(r1.isSelected()){
                type = "Saving Account";
            }else if(r2.isSelected()){
                type = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                type = "Current Account";
            }else if(r4.isSelected()){
                type = "Recurring Deposit Account";
            }            
           
            
            Random random = new Random();
            String card = "" + Math.abs((random.nextLong() % 90000000L) + 9054942000000000L);
            String pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility +"ATM Card";
            }else if(c2.isSelected()){
                facility = facility +"Credit Card";
            }else if(c3.isSelected()){
                facility = facility +"Internet Banking";
            }else if(c4.isSelected()){
                facility = facility +"Mobile Bankin";
            }else if(c5.isSelected()){
                facility = facility +"Email & SMS Alert";
            }else if(c6.isSelected()){
                facility = facility +"E-Statement";
            }else if(c7.isSelected()){
                facility = facility +"Cheque Book";
            }
            
            
            try {
                if(type.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else {
                    Conn conn = new Conn();
                    String query1 = "INSERT INTO signupthree VALUES ('"+formno+"','"+type+"', '"+card+"','"+pin+"','"+ facility+"')";
                    String query2 = "INSERT INTO login VALUES ('"+formno+"','"+card+"','"+pin+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number :" +card+"\n Pin :"+pin);
                    setVisible(false);
                    new Deposit(pin).setVisible(false);
                
                
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource() == Cancel){
            setVisible(false);
            new Login().setVisible(true);
        
        }
    }
    

    public static void main(String args[]) {
        
        new SignupThree("");
    }
}