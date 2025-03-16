
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener{
    
    
    long random;
    JTextField nameTextField,fnameTextField,mnameTextField,emailTextField,addressTextField,CityTextField,districtTextField,pinTextField,stateTextField;
    JButton Next;
    JRadioButton Male, Female,married,Unmarried,divorced;
    JDateChooser dateChooser;
    
    
    SignupOne(){
        
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 100L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,30,600,40);
        add(formno);
        
        JLabel Personaldetails = new JLabel("Page 1 :- Personal Details" );
        Personaldetails.setFont(new Font("Raleway",Font.BOLD,25));
        Personaldetails.setBounds(250,80,500,50);
        add(Personaldetails);
        
        JLabel Name = new JLabel("Name :" );
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100,140,100,30);
        add(Name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(nameTextField);
        
        
        
        JLabel Fname = new JLabel("Father's Name :" );
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,180,200,30);
        add(Fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,180,400,30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(fnameTextField);
        
        
        JLabel Mname = new JLabel("Mother's Name :" );
        Mname.setFont(new Font("Raleway",Font.BOLD,20));
        Mname.setBounds(100,220,200,30);
        add(Mname);
        
        mnameTextField = new JTextField();
        mnameTextField.setBounds(300,220,400,30);
        mnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(mnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,260,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,260 ,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :" );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,300,200,30);
        add(gender);
        
        Male = new JRadioButton("Male");
        Male.setBounds(300,300,160,30);
        Male.setBackground(Color.WHITE);
        add(Male);
        
        Female = new JRadioButton("Female");
        Female.setBounds(500,300,120,30);
        Female.setBackground(Color.WHITE);
        add(Female);
        
        ButtonGroup GenderGroup = new ButtonGroup();
        GenderGroup.add(Male);
        GenderGroup.add(Female);
        
        
        JLabel email = new JLabel("E-mail :" );
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(emailTextField);
        
        JLabel ms = new JLabel("Marital Status :" );
        ms.setFont(new Font("Raleway",Font.BOLD,20));
        ms.setBounds(100,380,200,30);
        add(ms);
        
        
        married = new JRadioButton("Married");
        married.setBounds(300,380,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450,380,110,30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);
        
        
        divorced = new JRadioButton("Divorced");
        divorced.setBounds(625,380,110,30);
        divorced.setBackground(Color.WHITE);
        add(divorced);
        
        ButtonGroup msGroup = new ButtonGroup();
        msGroup.add(married);
        msGroup.add(Unmarried);
        msGroup.add(divorced);
        
        
        
        JLabel address = new JLabel("Address :" );
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,420,200,30);
        add(address);
        
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300,420,400,30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(addressTextField);
        
        JLabel City = new JLabel("City :" );
        City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(100,460,200,30);
        add(City);
        
        
        CityTextField = new JTextField();
        CityTextField.setBounds(300,460,400,30);
        CityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(CityTextField);
        
        JLabel district = new JLabel("District :" );
        district.setFont(new Font("Raleway",Font.BOLD,20));
        district.setBounds(100,500,200,30);
        add(district);
        
        districtTextField = new JTextField();
        districtTextField.setBounds(300,500,400,30);
        districtTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(districtTextField);
        
        
        JLabel state = new JLabel("State :" );
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(stateTextField);
        
        
        JLabel pin = new JLabel("Pincode :" );
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,580,200,30);
        add(pin);
        
        pinTextField = new JTextField();
        pinTextField.setBounds(300,580,400,30);
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(pinTextField);
        
        
        
        
        
        
         Next = new JButton("Next");
         Next.setBounds(620,630,80,30);
         Next.setBackground(Color.BLACK);
         Next.setForeground(Color.WHITE);
         Next.addActionListener(this);
         add(Next);
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String mname = mnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null ;
        if (Male.isSelected()){
            gender = "Male";
            
        }else if (Female.isSelected()){
            gender = "female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "married";
        }else if (Unmarried.isSelected()){
            marital = "Unmarried";
        }else if (divorced.isSelected()){
            marital = "divorced";
        }
        String  state = stateTextField.getText();
        String address = addressTextField.getText();
        String district = districtTextField.getText();
        String City = CityTextField.getText();
        String pin = pinTextField.getText();
        
        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null ,"Name is Required");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null ," Father's Name is Required");
            }else if(mname.equals("")){
                JOptionPane.showMessageDialog(null ," Mother's Name is Required");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null ," email is Required");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null ," Date of Birth is Required");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null ," Address is Required");
            }else if(City.equals("")){
                JOptionPane.showMessageDialog(null ," City Name is Required");
            }else if(district.equals("")){
                JOptionPane.showMessageDialog(null ," District Name is Required");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null ," State Name is Required");
            }else if(pin.equals("")){
                JOptionPane.showMessageDialog(null ," Pin Code Name is Required");
            }else {
                Conn c = new Conn();
                String query = "INSERT INTO signup VALUES ('"+formno+"', '"+name+"','"+fname+"','"+ mname+"','"+dob+"','"+gender+"', '"+email+"', '"+marital+"', '"+address+"','"+City+"','"+district+"', '"+state+"',  '"+pin+"')";
                c.s.executeUpdate(query);
                
                
                
                 setVisible(false);
            new SignupTwo(formno).setVisible(true);

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

   
    public static void main(String args[]) {
        new SignupOne();
    }
}