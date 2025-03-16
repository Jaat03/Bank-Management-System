package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login , signup , clear ;
    JTextField cardTextField; 
    JPasswordField pinTextField;
    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(40,10,100,100);
        add(label);
        
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        
        JLabel cardno = new JLabel("Cardno");
        cardno.setFont(new Font("railway",Font.BOLD,38));
        cardno.setBounds(120,150,250,30);
        add(cardno);
        
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
       
        
        
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("railway",Font.BOLD,38));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);
        
        
         login = new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);
        
         clear = new JButton("CLEAR");
         clear.setBounds(450,300,100,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);
        
         signup = new JButton("SIGN UP");
         signup.setBounds(300,350,250,30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
         add(signup);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,500);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
      
        
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String card = cardTextField.getText().trim();
            String pin = new String(pinTextField.getPassword()).trim();
            String query = "SELECT * FROM login WHERE card ='"+card+"' AND pin ='"+pin+"' ";
            try{
            
           
                
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card  or Pin ");
                }
            }catch(Exception e){
                System.out.println(e);
                
            }
        
        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    }

    public static void main(String[] args) {
        new Login();
    }

    
    
}