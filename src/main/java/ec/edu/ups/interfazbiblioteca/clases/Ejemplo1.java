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
public class Ejemplo1 implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent evento) {

        java.awt.Frame f = new java.awt.Frame("BorderLayout");
        f.setLayout(new java.awt.BorderLayout());
        f.add(new java.awt.Button("Norte"), java.awt.BorderLayout.NORTH);
        f.add(new java.awt.Button("Sur"), java.awt.BorderLayout.SOUTH);
        f.add(new java.awt.Button("Este"), java.awt.BorderLayout.EAST);
        f.add(new java.awt.Button("Oeste"), java.awt.BorderLayout.WEST);
        f.add(new java.awt.Button("Centro"), java.awt.BorderLayout.CENTER);

        f.setSize(300, 200);
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
