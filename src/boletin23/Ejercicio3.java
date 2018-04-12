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
public class Ejercicio3 implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton bSaudo, bDesp;
    JLabel et;
    
    public Ejercicio3() {
        marco = new JFrame("Curso DAM");
        panel = new JPanel();
        bSaudo = new JButton("Saudo");
        bDesp = new JButton("Despedida");
        et = new JLabel("Un saudo a DAM");
        
        marco.setLocation(540, 260);
        marco.setSize(600, 400);
        et.setVisible(false);
        bSaudo.addActionListener(this);
        bDesp.addActionListener(this);
        
        panel.add(bSaudo);
        panel.add(bDesp);
        panel.add(et);
        marco.add(panel);
        marco.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object boton = ae.getSource();
        if (boton == bSaudo) {
            et.setVisible(true);
        } else {
            System.exit(0);
        }
    }
    
}
