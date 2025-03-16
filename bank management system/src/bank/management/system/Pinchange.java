
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Pinchange extends JFrame implements ActionListener{
    
   
    JLabel text ,pintext ,repintext;
    JTextField repin,cpin;
    JButton change , back;
    String pin;
    Pinchange(String pin){
        this.pin = pin;
        
        setLayout(null);
        
        
         
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(0,0,900,900);
        add(label);
        
        text = new JLabel ("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,23));
        text.setBounds(230,280,500,35);
        label.add(text);
        
        pintext = new JLabel ("NEW PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,20));
        pintext.setBounds(165,320,180,25);
        label.add(pintext);
        
        
        cpin = new JTextField();
        cpin.setFont(new Font("Railway",Font.BOLD,20));
        cpin.setBounds(330,320,180,25);
        label.add(cpin);
        
        repintext = new JLabel ("RE-ENTER PIN ");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,20));
        repintext.setBounds(165,360,180,25);
        label.add(repintext);
        
         repin = new JTextField();
        repin.setFont(new Font("Railway",Font.BOLD,20));
        repin.setBounds(330,360,180,25);
        label.add(repin);
        
         change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        label.add(change);
        
        
         back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        label.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== change){
        try {
        String npin = cpin.getText();
        String rpin = repin.getText();
        if(!npin.equals(rpin)){
            JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH");
            return;
            }
        
        if(npin.equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER NEW PIN");
            return;
        }
        if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE RE-ENTER NEW PIN");
            return;
        }
        Conn conn = new Conn();
        String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pin+"'";
        String query2 = "update signupthree set pin = '"+rpin+"' where pin ='"+pin+"'";
        String query3 = "update login set pin = '"+rpin+"' where pin ='"+pin+"'";
        conn.s.executeUpdate(query1);
        conn.s.executeUpdate(query2);
        conn.s.executeUpdate(query3);
        
         JOptionPane.showMessageDialog(null, "PIN CHANGE SUCCESSFULLY");
         
         setVisible(false);
        new Transaction(rpin).setVisible(true);
        
    }catch(Exception e){
                System.out.println(e);
                }
    
    }else{ 
        setVisible(false);
        new Transaction(pin).setVisible(true);
        
    }
        
    
    
}

    public static void main(String args[]) {
        new Pinchange("");
       
    }
}
