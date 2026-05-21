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
public class Ejemplo11  implements MouseListener {
    
    @Override
public void mouseClicked(MouseEvent evento) {
    java.awt.Frame f = new java.awt.Frame("KeyListener");
        f.setLayout(new java.awt.FlowLayout());
        java.awt.TextField txt = new java.awt.TextField(15);
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                System.out.println("Tecla: " + e.getKeyChar());
            }
        });
        f.add(txt);
        f.setSize(200, 100);
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
