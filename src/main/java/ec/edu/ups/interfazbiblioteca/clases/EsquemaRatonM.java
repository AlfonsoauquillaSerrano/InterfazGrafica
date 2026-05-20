/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazbiblioteca.clases;

import ec.edu.ups.interfazbiblioteca.InterfazBiblioteca;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EsquemaRatonM implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {

Frame miVentana = new Frame("holi");
Panel miPanel = new Panel();
Button botonL = new Button("Libro");
Button botonU = new Button("Usuario");
miPanel.add(botonL);
miPanel.add(botonU);
miVentana.add(miPanel);
miVentana.setSize(200, 300);
miVentana.setLocation(500, 500);
miVentana.setVisible(true);
botonL.addMouseListener(new EsquemaRatonR());
botonU.addMouseListener(new EsquemaRatonR());;
}
@Override
public void mousePressed(MouseEvent evento) {
    System.out.println("hola");
}
@Override
public void mouseReleased(MouseEvent evento) {
    System.out.println("pepe");
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

