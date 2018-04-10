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
public class Ejercicio1 implements ActionListener {

    JFrame marco;
    JPanel panel, hidden;
    JLabel et;
    JButton bEt;

    public Ejercicio1() {
        marco = new JFrame("Ejercicio 1");
        panel = new JPanel();

        et = new JLabel("Premiches o boton");
        bEt = new JButton("Premer");
        marco.setLocation(540, 260);
        marco.setDefaultCloseOperation(3);
        marco.setSize(600, 400);

        bEt.addActionListener(this);
        et.setVisible(false);

        panel.add(et);
        panel.add(bEt);
        marco.add(panel);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        et.setVisible(true);
    }
}
