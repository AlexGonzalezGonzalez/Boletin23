/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author estudios
 */
public class Ejercicio4 implements ActionListener {
    
    JFrame marco, marco2;
    JPanel p1, p2;
    JButton b1;
    JLabel et;
    
    public Ejercicio4() {
        marco = new JFrame("Ventana 1");
        marco2 = new JFrame("Ventana 2");
        b1 = new JButton("Ver ventana 2");
        et = new JLabel("Ventana 2");
        p1 = new JPanel();
        p2 = new JPanel();
        
        marco.setSize(600, 400);
        marco2.setSize(600, 400);
        marco.setLocation(540, 260);
        marco2.setLocation(540, 240);
        
        b1.addActionListener(this);
        p1.add(b1);
        p2.add(et);
        marco.add(p1);
        marco2.add(p2);
        marco.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        marco.setVisible(false);
        marco2.setVisible(true);
    }
    
}
