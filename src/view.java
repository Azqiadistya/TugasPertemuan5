import java.awt.event.*;
import javax.swing.*;

public class view extends JFrame implements ActionListener {
        JLabel ljudul = new JLabel("KALKULATOR BALOK");

        JLabel lpanjang = new JLabel("Panjang");
        JTextField tpanjang = new JTextField(25);
        JLabel llebar = new JLabel("Lebar");
        JTextField tlebar = new JTextField(25); 
        JLabel ltinggi = new JLabel("Tinggi");
        JTextField ttinggi = new JTextField(25);

        JLabel lhasil = new JLabel("Hasil");
        JLabel lluas = new JLabel();
        JLabel lkeliling = new JLabel();
        JLabel lluaspermukaan = new JLabel();
        JLabel lvolume = new JLabel();

        JButton bhitung = new JButton("HITUNG");
        JButton breset = new JButton("RESET");

        public view() {
            setTitle("KALKULATOR BALOK");

            setSize(350, 450);
            setLayout(null);
            add(ljudul);
            add(lpanjang);
            add(tpanjang);
            add(llebar);
            add(tlebar);
            add(ltinggi);
            add(ttinggi);

            add(lhasil);
            add(lluas);
            add(lkeliling);
            add(lluaspermukaan);
            add(lvolume);

            add(bhitung);
            add(breset);

            ljudul.setBounds(120,10,200,35);
            lpanjang.setBounds(20,40,100,20);
            tpanjang.setBounds(130,40,150,20);
            llebar.setBounds(20,65,100,20);
            tlebar.setBounds(130,65,150,20);
            ltinggi.setBounds(20,95,100,20);
            ttinggi.setBounds(130,95,150,20);

            lhasil.setBounds(145,125,500,30);
            lluas.setBounds(30,160,500,30);
            lkeliling.setBounds(30,185,500,30);
            lluaspermukaan.setBounds(30,210,500,30);
            lvolume.setBounds(30,235,500,30);

            bhitung.setBounds(70,300,80,20);
            breset.setBounds(170,300,80,20);

            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            bhitung.addActionListener(this);
            breset.addActionListener(this);
           }

        @Override
        public void actionPerformed(ActionEvent e){
            double panjang, lebar, tinggi;

            if (e.getSource() == bhitung) {
                if (tpanjang.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Panjang harus diisi!");
                } else if (tlebar.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Lebar harus diisi!");
                } else if (ttinggi.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tinggi harus diisi");
                } else {
                    try {
                        panjang = Double.parseDouble(tpanjang.getText());
                        lebar = Double.parseDouble(tlebar.getText());
                        tinggi = Double.parseDouble(ttinggi.getText());

                        Balok balok = new Balok(panjang, lebar, tinggi);

                        lluas.setText("Luas Persegi Panjang            : " + balok.hitungLuas());
                        lkeliling.setText("Keliling Persegi Panjang       : " + balok.hitungKeliling());
                        lluaspermukaan.setText("Luas Permukaan Balok          : " + balok.hitungLuasPermukaan());
                        lvolume.setText("Volume Balok                          : " + balok.hitungLuasPermukaan());
                    } catch(NumberFormatException err){
                        JOptionPane.showMessageDialog(this, "Masukkan dalam bentuk angka");
                    }
                }
            }

            if (e.getSource() == breset) {
                lluas.setText(" ");
                lkeliling.setText(" ");
                lluaspermukaan.setText(" ");
                lvolume.setText(" ");
                tpanjang.setText("");
                tlebar.setText("");
                ttinggi.setText("");
            }
        }
    }

