/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123220181;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class LoginPage extends JFrame implements ActionListener {
    
    JLabel header = new JLabel("Selamat Datang!");
    JLabel infoLogin = new JLabel("Silahkan masuk untuk melanjutkan");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    
    JTextField userName = new JTextField();
    JTextField passWord = new JTextField();
    
    JRadioButton KelLaki = new JRadioButton("Laki-Laki");
    JRadioButton KelPerempuan = new JRadioButton("Perempuan");
    
    JButton tombolLogin = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(500, 525);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
    // tampilkan Label
        add(header);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        header.setBounds(25,25,170,35);
       
        add(infoLogin);
        infoLogin.setFont(new Font("Arial", Font.BOLD, 14));
        infoLogin.setBounds(25,50,250,35);
        
        add(username);
        //username.setFont(new Font("Arial", Font.BOLD, 15));
        username.setBounds(25,80,150,35);
        
        add(password);
        //username.setFont(new Font("Arial", Font.BOLD, 15));
        password.setBounds(25,140,150,35);
        
        add(jenisKelamin);
        jenisKelamin.setBounds(25,200,150,35);
        
        
    // tampilkan text field
        add(userName);
        userName.setBounds(25,110,435,25);
        
        add(passWord);
        passWord.setBounds(25,170,435,25);
        //passWord.setEchoChar('*');
        
        
    //  tampilkan radiobutton
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(KelLaki);
        pilihJenisKelamin.add(KelPerempuan);
        
        add(KelLaki);
        KelLaki.setBounds(25, 225, 100, 25);
        
        add(KelPerempuan);
        KelPerempuan.setBounds(200, 225, 100, 25);
        
        
    // tampilkan login
        add(tombolLogin);
        tombolLogin.setBounds(15, 275, 455, 35);
        tombolLogin.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = userName.getText();
            String jenisKelamin = KelLaki.isSelected() ? "Mr. " : "Mrs. ";
            String password = passWord.getText();
            
            if(username.equals("")&& password.equals("")){
                throw new Exception("Username dan Password Belum diisi");
            } else if(password.equals("")){
                throw new Exception("Password Belum diisi");
            } else if (username.equals("")  ){
                throw new Exception("Username Belum diisi");
            }
            
            new MenuPage(username, jenisKelamin);
            this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}