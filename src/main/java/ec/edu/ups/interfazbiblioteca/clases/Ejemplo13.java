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
public class Ejemplo13 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent evento) {
        java.awt.Frame f = new java.awt.Frame("FocusListener");
        f.setLayout(new java.awt.FlowLayout());
        java.awt.Button b1 = new java.awt.Button("Primer boton");
        java.awt.Button b2 = new java.awt.Button("Segundo boton");
        java.awt.event.FocusAdapter miEscuchadorFoco = new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent e) {

                java.awt.Button botonActivo = (java.awt.Button) e.getSource();
                System.out.println("El '" + botonActivo.getLabel() + "' ganó el foco");
            }
        };
        b1.addFocusListener(miEscuchadorFoco);
        b2.addFocusListener(miEscuchadorFoco);

        f.add(b1);
        f.add(b2);
        f.setSize(300, 100);
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
                setBackground(Color.RED);

    }
}
