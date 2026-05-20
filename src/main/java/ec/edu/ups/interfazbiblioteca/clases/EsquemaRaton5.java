/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfazbiblioteca.clases;

import ec.edu.ups.interfazbiblioteca.InterfazBiblioteca;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EsquemaRaton5 implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {

Frame miMarco = new Frame();
Panel panelMenuNorte = new Panel();
Panel panelGeneral = new Panel();
BorderLayout puntosCardinales = new BorderLayout();
FlowLayout opcionesMenu = new FlowLayout();
Button botonNorth = new Button("norte");

Button botonSur = new Button("Sur");
Button botonEste = new Button("Este");
Button botonOeste = new Button("Oeste");
Button botonCentro = new Button("Centro");
panelGeneral.setLayout(puntosCardinales);
panelMenuNorte.setLayout(opcionesMenu);
miMarco.add(panelGeneral);

botonNorth.setBackground(Color.YELLOW);
botonOeste.setBackground(new Color (128,0,0));
botonSur.setBackground(Color.BLUE);
botonEste.setBackground(new Color (128,0,0));
botonCentro.setBackground(Color.GREEN);


panelGeneral.add(botonNorth, BorderLayout.NORTH);
panelGeneral.add(botonSur, BorderLayout.SOUTH);
panelGeneral.add(botonEste, BorderLayout.EAST);
panelGeneral.add(botonOeste, BorderLayout.WEST);
panelGeneral.add(botonCentro, BorderLayout.CENTER);
miMarco.setSize(400, 150);
miMarco.setTitle("Ventana con BorderLayout");
miMarco.setVisible(true);
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
setBackground(new Color(75,0,130));
}}

