/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazbiblioteca.clases;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ASUS
 */
public class Ejemplo2 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent evento) {
        java.awt.Frame f = new java.awt.Frame("Cambiando el Label");
        f.setLayout(new java.awt.FlowLayout());

        java.awt.Label miLabel = new java.awt.Label("xd");

        java.awt.Button b1 = new java.awt.Button("b1");
        java.awt.Button b2 = new java.awt.Button("b2");
        java.awt.Button b3 = new java.awt.Button("b3");
        java.awt.Button b4 = new java.awt.Button("b4");

        java.awt.event.ActionListener escuchador = new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (e.getSource() == b1) {
                    miLabel.setText("Hola");
                }
                if (e.getSource() == b2) {
                    miLabel.setText("Como");
                }
                if (e.getSource() == b3) {
                    miLabel.setText("Estas");
                }
                if (e.getSource() == b4) {
                    miLabel.setText("Amiguito");
                }
            }
        };

        b1.addActionListener(escuchador);
        b2.addActionListener(escuchador);
        b3.addActionListener(escuchador);
        b4.addActionListener(escuchador);
        f.add(miLabel);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setSize(300, 150);
        f.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent evento) {
    }

    @Override
    public void mouseReleased(MouseEvent evento) {
    }

    @Override
    public void mouseEntered(MouseEvent evento) {
        evento.getComponent().setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent evento) {
        evento.getComponent().
                setBackground(Color.YELLOW);

    }
}
