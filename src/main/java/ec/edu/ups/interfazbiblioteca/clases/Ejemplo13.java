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
public class Ejemplo13  implements MouseListener {
    
    @Override
public void mouseClicked(MouseEvent evento) {
java.awt.Frame f = new java.awt.Frame("FocusListener");
        f.setLayout(new java.awt.FlowLayout());
        java.awt.Button b1 = new java.awt.Button("Boton con Foco");
        b1.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                System.out.println("El boton gano el foco");
            }
        });
        f.add(b1);
        f.add(new java.awt.Button("Otro boton"));
        f.setSize(250, 100);
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

    
}}
