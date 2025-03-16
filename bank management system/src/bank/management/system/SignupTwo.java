
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JRadioButton Yes,No;
    JComboBox  incom,relegion,catgory,education,occupations  ; 
    JButton Next;
    String formno;
      
    SignupTwo(String formno){
        this.formno = formno;
        
        
        setLayout(null);
       
                
        JLabel additionaldetails = new JLabel("Page 2 :- Additional Details" );
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,25));
        additionaldetails.setBounds(250,35,500,50);
        add(additionaldetails);
        
        JLabel religion = new JLabel("Religion :" );
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Issai","Other"};
        relegion  = new JComboBox(valReligion);
        relegion.setBounds(300,140,400,30);
        relegion.setBackground(Color.WHITE);
        add(relegion);
        
        
        
        
        
        JLabel category = new JLabel("Category :" );
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,180,200,30);
        add(category);
        
        String valcategory[] = {"Jaat","Bharaman","Dhanak","Chamar","Other"};
        catgory = new JComboBox(valcategory);       
        catgory.setBounds(300,180,400,30);
        catgory.setBackground(Color.WHITE);
        add(catgory);
        
        
        JLabel income = new JLabel("Income :" );
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,220,200,30);
        add(income);
        
        String valincome[] = {"0-100000","100001-250000","250001-500000","500001-1000000","1000000+"};
        incom = new JComboBox(valincome);       
        incom.setBounds(300,220,400,30);
        incom.setBackground(Color.WHITE);
        add(incom);
        
        JLabel educational = new JLabel("Education :" );
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,260,200,30);
        add(educational);
        
        String valeducation[] = {"Matrix","12th","Graduation","Post Graduation","PhD"};
        education = new JComboBox(valeducation);       
        education.setBounds(300,260,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
                
        JLabel occupation = new JLabel("Occupation :" );
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,300,200,30);
        add(occupation);
        
        String valoccupation[] = {"Student","Government Employee","Private Employee","Farmer","Business","Other"};
        occupations = new JComboBox(valoccupation);       
        occupations.setBounds(300,300,400,30);
        occupations.setBackground(Color.WHITE);
        add(occupations);
        
        JLabel pan = new JLabel("PAN Number :" );
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,340,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setBounds(300,340,400,30);
        panTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number :" );
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,380,200,30);
        add(aadhar);
        
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(300,380,400,30);
        aadharTextField.setFont(new Font("Raleway", Font.BOLD,14));
        add(aadharTextField);
        
        JLabel existing = new JLabel("Existing Account :" );
        existing.setFont(new Font("Raleway",Font.BOLD,20));
        existing.setBounds(100,420,200,30);
        add(existing);
        
        
        Yes = new JRadioButton("Yes");
        Yes.setBounds(300,420,160,30);
        Yes.setBackground(Color.WHITE);
        add(Yes);
        
        No = new JRadioButton("No");
        No.setBounds(500,420,120,30);
        No.setBackground(Color.WHITE);
        add(No);
        
        ButtonGroup GenderGroup = new ButtonGroup();
        GenderGroup.add(Yes);
        GenderGroup.add(No);
        
               
         Next = new JButton("Next");
         Next.setBounds(620,560,80,30);
         Next.setBackground(Color.BLACK);
         Next.setForeground(Color.WHITE);
         Next.addActionListener(this);
         add(Next);
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750,700);
        setLocation(350,10);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)relegion.getSelectedItem();
        String  category = (String)catgory.getSelectedItem();
        String income = (String)incom.getSelectedItem();
        String existing = null ;
        if (Yes.isSelected()){
            existing = "Yes";
            
        }else if (No.isSelected()){
            existing = "No";
        }
        String occupation = (String)occupations.getSelectedItem();
        String educational = (String)education.getSelectedItem();
        String marital = null;
        String  pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        try {
            if (pan.equals("")){
                JOptionPane.showMessageDialog(null ,"Pan Number is Required");
                
            }else if(aadhar.equals("")) {
                JOptionPane.showMessageDialog(null ,"Aadhar Number is Required");
                

            }else{
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo VALUES ('"+formno+"', '"+religion+"','"+category+"','"+ income+"','"+educational+"','"+occupation+"', '"+pan+"','"+aadhar+"','"+existing+"')";
                c.s.executeUpdate(query);
                
                
                setVisible(false);
            new SignupThree(formno).setVisible(true);

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

   
    public static void main(String args[]) {
        new SignupTwo("");
    }
}