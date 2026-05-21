package ec.edu.ups.interfazbiblioteca;



import ec.edu.ups.interfazbiblioteca.clases.Ejemplo0;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo1;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo10;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo11;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo12;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo13;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo14;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo2;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo3;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo4;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo5;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo6;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo7;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo8;
import ec.edu.ups.interfazbiblioteca.clases.Ejemplo9;
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

 botones[0].addMouseListener(new Ejemplo0());
 botones[1].addMouseListener(new Ejemplo1());
 botones[2].addMouseListener(new Ejemplo2());
 botones[3].addMouseListener(new Ejemplo3());
 botones[4].addMouseListener(new Ejemplo4());
 botones[5].addMouseListener(new Ejemplo5());
 botones[6].addMouseListener(new Ejemplo6());
 botones[7].addMouseListener(new Ejemplo7());
 botones[8].addMouseListener(new Ejemplo8());
 botones[9].addMouseListener(new Ejemplo9());
 botones[10].addMouseListener(new Ejemplo10());
 botones[11].addMouseListener(new Ejemplo11());
 botones[12].addMouseListener(new Ejemplo12());
 botones[13].addMouseListener(new Ejemplo13());
 botones[14].addMouseListener(new Ejemplo14());

    }
   
}