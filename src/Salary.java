import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class Salary extends Frame implements ActionListener{ 
	JFrame f;
	JLabel trollyL1,trollyL2,enter,rent,medical,bonus,gross,tax,zakat,convance,net;
	JTextField	enter_tf,rent_tf,medical_tf,bonus_tf,gross_tf,tax_tf,zakat_tf,convance_tf,net_tf;  
    JButton calc,exit,clear,about;  
    Salary(){  
		f=new JFrame("Trolly Load");
		f.setBounds(0,0,1000,1000);
		
		trollyL1=new JLabel("Sindhiana Transport Co.");
		trollyL1.setBounds(140,20,250,50);
		Font font1=new Font("Old English Text MT",Font.ITALIC,25);
		trollyL1.setFont(font1);

		trollyL2=new JLabel("Employee Salary Calculation");
		trollyL2.setBounds(120,40,300,50);
		Font font2=new Font("Old English Text MT",Font.ITALIC,25);
		trollyL2.setFont(font2);		
		
		enter=new JLabel("Enter Pay");
		enter.setBounds(10,100,200,20);
		
		rent=new JLabel("House Rent 45%");
		rent.setBounds(10,150,200,20);
		
		medical=new JLabel("Medical Allowance 15%");
		medical.setBounds(10,200,200,20);	
				
		bonus=new JLabel("Bonus 5%");
		bonus.setBounds(10,250,200,20);		
		
		gross=new JLabel("Gross Pay");
		gross.setBounds(10,300,200,20);		
		
		tax=new JLabel("Income Tax 5%");
		tax.setBounds(10,350,200,20);
		
		zakat=new JLabel("Zakat 2.5%");
		zakat.setBounds(10,400,200,20);		

		convance=new JLabel("Convance Allowance 5%");
		convance.setBounds(10,450,200,20);

		net=new JLabel("Net Income");
		net.setBounds(10,500,200,20);
		
        enter_tf=new JTextField();  
        enter_tf.setBounds(200,100,200,20);
		
        rent_tf=new JTextField();  
        rent_tf.setBounds(200,150,200,20); 
			rent_tf.setEditable(false);  
        medical_tf=new JTextField();  
        medical_tf.setBounds(200,200,200,20);		
			medical_tf.setEditable(false);  
        bonus_tf=new JTextField();  
        bonus_tf.setBounds(200,250,200,20);		
			bonus_tf.setEditable(false);  
        gross_tf=new JTextField();  
        gross_tf.setBounds(200,300,200,20);		
			gross_tf.setEditable(false);  
        tax_tf=new JTextField();  
        tax_tf.setBounds(200,350,200,20);		 
			tax_tf.setEditable(false);  

		zakat_tf=new JTextField();
		zakat_tf.setBounds(200,400,200,20);		
			zakat_tf.setEditable(false); 
		convance_tf=new JTextField();
		convance_tf.setBounds(200,450,200,20);
			convance_tf.setEditable(false); 
		net_tf=new JTextField();
		net_tf.setBounds(200,500,200,20);
			net_tf.setEditable(false); 
        calc=new JButton("Calculate");  
        calc.setBounds(500,100,150,20);  
		
		exit=new JButton("EXIT");
		exit.setBounds(100,600,100,40);
		
		clear=new JButton("CLEAR");
		clear.setBounds(200,600,100,40);
		
		about=new JButton("ABOUT");
		about.setBounds(300,600,100,40);
		
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		f.add(trollyL1);
		f.add(trollyL2);
		f.add(enter);
		f.add(rent);
		f.add(medical);
		f.add(bonus); 
		f.add(gross);
		f.add(tax);
		f.add(zakat);
		f.add(convance);
		f.add(net);
		f.add(enter_tf);
		f.add(rent_tf);
		f.add(medical_tf);
		f.add(bonus_tf);
		f.add(gross_tf);
		f.add(tax_tf);
		f.add(zakat_tf);
		f.add(convance_tf);
		f.add(net_tf);
		f.add(calc);
		f.add(exit);
		f.add(clear);
		f.add(about);
		
        setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.show();
	}
	private void clear()
	{
		enter_tf.setText("");
		rent_tf.setText("");
		medical_tf.setText("");
		bonus_tf.setText("");
		gross_tf.setText("");
		tax_tf.setText("");
		zakat_tf.setText("");
		convance_tf.setText("");
		net_tf.setText("");
	}			
             
    public void actionPerformed(ActionEvent z) {  
 
        if(calc==z.getSource()){  
		String s1=enter_tf.getText();  
        int pay=Integer.parseInt(s1);
		double a,b,c,d,e,f,h,g;
		a=0.45*pay;
            rent_tf.setText(""+(a));
		b=0.15*pay;
			medical_tf.setText(""+(b));
		c=0.05*pay;
			bonus_tf.setText(""+(c));
		d=pay+a+b+c;
			gross_tf.setText(""+(d));
		e=0.05*pay;
			tax_tf.setText(""+(e));
		f=0.025*pay;
			zakat_tf.setText(""+(f));
		g=0.08*pay;
			convance_tf.setText(""+(g));
		h=d-(g+f+e);
			net_tf.setText(""+(h));			
        } 
		if(clear==z.getSource()){
			clear();
		}
		if(exit==z.getSource()){
			System.exit(0);
		}
		if(about==z.getSource()){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nContact: 03066558872");
		}				
    }  
public static void main(String[] args) {  
    new Salary();  
}  
}  