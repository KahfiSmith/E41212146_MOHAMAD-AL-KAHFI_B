/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
public class Windows {
    
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Belajar Java Frame");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        JLabel label = new JLabel("Masukkan NIM");
        frame.setLayout(null);
        frame.add(label);
        label.setBounds(20, 20, 150, 30);
        JTextField textfield = new JTextField();
        frame.add(textfield);
        textfield.setBounds(150, 20, 230, 30);
        JButton button = new JButton("Simpan");
        frame.add(button);
        button.setBounds(120, 60, 89, 20);

    }
    
}
