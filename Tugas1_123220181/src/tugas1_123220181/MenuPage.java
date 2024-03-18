/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123220181;

import perhitungan.balok;
import perhitungan.persegi;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class MenuPage extends JFrame implements ActionListener {
    
    JLabel header = new JLabel();
    JLabel infoHalaman = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luasPersegi = new JLabel("Luas Persegi");
    JLabel kelilingPersegi = new JLabel("Keliling Persegi");
    JLabel volumeBalok = new JLabel("Volume Balok");
    JLabel LPermukaanBalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuasP = new JLabel("[Hasil berupa angka]");
    JLabel hasilKelP = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolB = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPerB = new JLabel("[Hasil berupa angka]");
    
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    MenuPage(String username, String jenisKel){
        setVisible(true);
        setSize(525, 550);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
    // tampilkan Label
        add(header);
        header.setText("Welcome, " + jenisKel + username);
        header.setFont(new Font("Arial", Font.BOLD, 22));
        header.setBounds(25,25,330,35);
        
        add(infoHalaman);
        infoHalaman.setFont(new Font("Arial", Font.PLAIN, 13));
        infoHalaman.setBounds(25,50,400,35);
        
        add(panjang);
        panjang.setBounds(25,100,50,15);
        
        add(lebar);
        lebar.setBounds(25,140,50,15);
        
        add(tinggi);
        tinggi.setBounds(25,180,50,15);
        
        add(hasil);
        hasil.setBounds(241,330,50,15);
        
        add(luasPersegi);
        luasPersegi.setBounds(25,360,100,15);
        
        add(hasilLuasP);
        hasilLuasP.setBounds(195,360,150,15);
        
        add(kelilingPersegi);
        kelilingPersegi.setBounds(25,385,100,15);
        
        add(hasilKelP);
        hasilKelP.setBounds(195,385,150,15);
        
        add(volumeBalok);
        volumeBalok.setBounds(25,410,100,15);
        
        add(hasilVolB);
        hasilVolB.setBounds(195,410,150,15);
        
        add(LPermukaanBalok);
        LPermukaanBalok.setBounds(25,435,150,15);
        
        add(hasilLuasPerB);
        hasilLuasPerB.setBounds(195,435,150,15);
        
    // tampilkan text field
        add(Panjang);
        Panjang.setBounds(150,95,335,30);
        
        add(Lebar);
        Lebar.setBounds(150,135,335,30);
        
        add(Tinggi);
        Tinggi.setBounds(150,175,335,30);
        
        
    // tampilkan button
        add(hitung);
        hitung.setBounds(25,230,460,35);
        
        add(reset);
        reset.setBounds(25,275,460,35);
    
        hitung.addActionListener(this);
        reset.addActionListener(this);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == hitung) {
        // Memeriksa apakah ada input kosong
        if (Panjang.getText().isEmpty() && Lebar.getText().isEmpty() && Tinggi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Panjang, lebar, dan tinggi belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Panjang.getText().isEmpty() && Lebar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Panjang dan Lebar belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Lebar.getText().isEmpty() && Tinggi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lebar dan Tinggi belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Panjang.getText().isEmpty() && Tinggi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Panjang dan Tinggi belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Panjang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Panjang belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Lebar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lebar belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        if (Tinggi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tinggi belum diisi");
            return; // Keluar dari metode actionPerformed
        }
        // Jika tidak ada input yang kosong, lakukan perhitungan
        double panjang = Double.parseDouble(Panjang.getText());
        double lebar = Double.parseDouble(Lebar.getText());
        double tinggi = Double.parseDouble(Tinggi.getText());

        persegi bangun1 = new persegi(panjang, lebar);
        balok bangun2 = new balok(panjang, lebar, tinggi);

        String hasilLuas = String.valueOf(bangun1.LuasPersegi());
        String hasilKeliling = String.valueOf(bangun1.KelilingPersegi());
        String hasilVolumeBalok = String.valueOf(bangun2.VolumeBalok());
        String hasilLuasPermukaanBalok = String.valueOf(bangun2.LuasPermukaanBalok());

        hasilLuasP.setText(hasilLuas);
        hasilKelP.setText(hasilKeliling);
        hasilVolB.setText(hasilVolumeBalok);
        hasilLuasPerB.setText(hasilLuasPermukaanBalok);
    } else if (e.getSource() == reset) {
        hasilLuasP.setText("[Hasil berupa angka]");
        hasilKelP.setText("[Hasil berupa angka]");
        hasilVolB.setText("[Hasil berupa angka]");
        hasilLuasPerB.setText("[Hasil berupa angka]");
        Panjang.setText("");
        Lebar.setText("");
        Tinggi.setText("");
    }
}

}