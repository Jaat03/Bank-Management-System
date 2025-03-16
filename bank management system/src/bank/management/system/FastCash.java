
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import java.sql.*;


public class FastCash extends JFrame implements ActionListener{
    String pin ; 
    JTextField amount ;
    JButton withdraw , back,dep,bac ,wow,bat , bats;
    FastCash(String pin){
        this.pin = pin;
        setLayout(null);
        
        
         
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(0,0,900,900);
        add(label);
        
        
        JLabel text = new JLabel("SELECT THE AMOUNT YOU WANT TO WITHDRAWAL");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD, 12));
        text.setBounds(160,290,350,20);
        label.add(text);
        
               
        withdraw = new JButton("Rs.100");
        withdraw.setBounds(170,340,150,30);
        withdraw.addActionListener(this);
        label.add(withdraw);
        
        back = new JButton("Rs.500");
        back.setBounds(340,340,150,30);
        back.addActionListener(this);
        label.add(back);
        dep = new JButton("Rs.1000");
        dep.setBounds(170,390,150,30);
        dep.addActionListener(this);
        label.add(dep);
        
        bac = new JButton("Rs.2000");
        bac.setBounds(340,390,150,30);
        bac.addActionListener(this);
        label.add(bac);
        wow = new JButton("Rs.5000");
        wow.setBounds(170,440,150,30);
        wow.addActionListener(this);
        label.add(wow);
        
        bat = new JButton("Rs.10000");
        bat.setBounds(340,440,150,30);
        bat.addActionListener(this);

        label.add(bat);
        
        bats = new JButton("BACK");
        bats.setBounds(340,490,150,30);
        bats.addActionListener(this);

        label.add(bats);
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==bats){
             setVisible(false);
             new Transaction(pin).setVisible(true);
        } else  {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            try{
                ResultSet rs = conn.s.executeQuery("select *from bank where pin = '"+pin+"' ");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                       
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                
                if (ae.getSource() != bats && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank value('"+pin+"','"+date+"','withdrawl', '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Successfully");
                
                
                setVisible(false);
                new Transaction(pin).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
     }
   
    public static void main(String args[]) {
        new FastCash("");
        
    }
}
