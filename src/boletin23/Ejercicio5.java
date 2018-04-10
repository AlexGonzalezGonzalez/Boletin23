/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author estudios
 */
public class Ejercicio5 implements ActionListener {

    JFrame marco;
    JPanel p1;
    JTextField txt;
    JButton b1, b2;
    int conta = 0;
    String completo="";
    

    public Ejercicio5() {
        marco = new JFrame("Ejercicio 5");
        p1 = new JPanel();
        txt = new JTextField("0",9);
        b1 = new JButton("dibuxa");
        b2 = new JButton("limpa");
        
        marco.setLocation(540, 260);
        marco.setSize(600, 400);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        p1.add(txt);
        p1.add(b1);
        p1.add(b2);
        marco.add(p1);
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object boton = ae.getSource();
        if (boton == b1) {
             conta=0; 
             completo="";
            for (int i = 0; i < Integer.parseInt(this.txt.getText()); i++) {
                conta++;
            }
            for (int i = 0; i < conta; i++) {
                completo = completo + "O";
            }
            this.txt.setText(completo);
            this.txt.setForeground(Color.RED);
                
        } else {
            this.txt.setText("");
            this.txt.setForeground(Color.BLACK);
        }
        
    }
}
