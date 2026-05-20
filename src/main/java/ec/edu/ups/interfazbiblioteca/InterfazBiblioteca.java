package ec.edu.ups.interfazbiblioteca;

import ec.edu.ups.interfazbiblioteca.clases.EsquemaRatonR;

import ec.edu.ups.interfazbiblioteca.clases.EsquemaRaton5;

import ec.edu.ups.interfazbiblioteca.clases.EsquemaRatonM;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Color;

/**
 * @author ASUS
 */
public class InterfazBiblioteca {
    public static void main(String[] args) {
       Frame miVentana = new Frame();
Panel miPanel = new Panel();
GridLayout matriz = new GridLayout(3, 5);
Button[] botones = new Button[15];
for (int i = 0; i < 15; i++)
botones[i] = new Button("Botón " + i);
miPanel.setLayout(matriz);
for (int i = 0; i < 15; i++){
miPanel.add(botones[i]);
}
miVentana.add(miPanel);
miVentana.setSize(300, 100);
miVentana.setTitle("Ventana con GridLayout");
miVentana.setVisible(true);

for (int i = 0; i < 15; i++){
    if(i<5){
        botones[i].addMouseListener(new EsquemaRatonR());
    }else if(i<10){
     botones[i].addMouseListener(new EsquemaRaton5());}
    else{
           botones[i].addMouseListener(new EsquemaRatonM());
    }
    botones[i].setForeground(Color.WHITE);
}
    }
   
}