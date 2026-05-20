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

public class Saludar2 implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {

    Label titulo = new Label("Amiguito");

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

