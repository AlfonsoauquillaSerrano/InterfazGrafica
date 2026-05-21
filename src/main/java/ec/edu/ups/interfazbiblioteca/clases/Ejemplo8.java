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
public class Ejemplo8  implements MouseListener {
    
    @Override
public void mouseClicked(MouseEvent evento) {
    java.awt.Frame f = new java.awt.Frame("List");
        f.setLayout(new java.awt.FlowLayout());
        java.awt.List lista = new java.awt.List(3);
        lista.add("Opción 1");
        lista.add("Opción 2");
        f.add(lista);
        f.setSize(200, 150);
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
setBackground(Color.BLUE);

    
}}
