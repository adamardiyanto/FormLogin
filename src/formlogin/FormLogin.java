/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

/**
 *
 * @author ADAM ARDI
 */
import javax.swing.*;
import java.awt.event.ActionEvent;

public class FormLogin {

   
    public static void main(String[] args) {
GUI g = new GUI();        

    }
    
}
class GUI extends JFrame {
    String pass="admin";
   final JTextField fuser = new JTextField(10);
   final JPasswordField fpass = new JPasswordField(10);

   JLabel luser = new JLabel(" Username ");
   JLabel lpass = new JLabel(" Password ");
   JButton btnOk = new JButton("Login");
   JButton btnCancel = new JButton("Cancel");

public GUI() {
    
setTitle("LOGIN");
	setDefaultCloseOperation(3);
	setSize(350,200);
        setLocation(500,275);
setLayout(null);
	add(luser);
	add(fuser);
        add(lpass);
	add(fpass);
        add(btnOk);
        add(btnCancel);
luser.setBounds(10,10,120,20);
fuser.setBounds(140,10,150,20);
lpass.setBounds(10,30,120,20);
fpass.setBounds(140,30,150,20);
btnOk.setBounds(180,130,100,20);
btnOk.setBackground(new java.awt.Color(0,30,255));
btnCancel.setBounds(50,130,100,20);
btnCancel.setBackground(new java.awt.Color(255,0,0));

        
btnOk.addActionListener((ActionEvent e) -> {
    if(fuser.getText().equalsIgnoreCase("admin") && pass.equalsIgnoreCase(fpass.getText()))
    {
        Biodata bio = new Biodata();
        bio.setVisible(true);
        dispose();}
    else 
    {
        JOptionPane.showMessageDialog(null, "username atau password salah");
    }
    
});
        setVisible(true);
}
}