/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author estudios
 */
public class Ejercicio2 implements ActionListener {

    JFrame marco;
    JPanel panel, hidden;
    JButton bPro, bBases;

    public Ejercicio2() {
        marco = new JFrame("Curso DAM");
        panel = new JPanel();
        bPro = new JButton("Programacion");
        bBases = new JButton("Bases");

        marco.setLocation(540, 260);
        marco.setSize(600, 400);
        bPro.addActionListener(this);
        bBases.addActionListener(this);

        panel.add(bPro);
        panel.add(bBases);
        marco.add(panel);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object boton = ae.getSource();
        if (boton == bPro) {
            marco.setTitle("Programacion");
        } else {
            marco.setTitle("Bases de Datos");
        }

    }
}
