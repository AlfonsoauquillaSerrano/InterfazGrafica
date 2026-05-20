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
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ASUS
 */
public class EsquemaRatonR implements MouseListener{
@Override
public void mouseClicked(MouseEvent evento) {

Frame miVentana = new Frame();
Panel miPanel = new Panel();
Label titulo = new Label("XD");
miPanel.add(titulo,BorderLayout.SOUTH);
FlowLayout posicionamientoSecuencial = new FlowLayout();
Button botonA = new Button("Primer botón");
Button botonB = new Button("Segundo botón");
Button botonC = new Button("Tercer botón");
Button botonD = new Button("Cuarto botón");
miPanel.setLayout(posicionamientoSecuencial);
miVentana.add(miPanel);
miPanel.add(botonA);
miPanel.add(botonB);
miPanel.add(botonC);
miPanel.add(botonD);
miVentana.setSize(500, 80);
miVentana.setLocation(500, 500);
miPanel.add(titulo);
miVentana.setTitle("Ventana con flow layout");
miVentana.setVisible(true);

botonA.addMouseListener(new EsquemaRatonSaludar(titulo));
botonB.addMouseListener(new Saludar2());
botonC.addMouseListener(new Saludar3());
botonD.addMouseListener(new Saludar4());

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
setBackground(Color.MAGENTA);

}}
