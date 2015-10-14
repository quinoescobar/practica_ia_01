
package practica_robot_ia;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Practica_Robot_IA extends JFrame {

    
    private Interfaz interfaz;
    
    
    
      
    public Practica_Robot_IA(int ancho, int largo)
    {
        interfaz = new Interfaz();
        interfaz.setToolTipText("Area de dibujado");
        add(BorderLayout.CENTER, interfaz);
        setSize(ancho, largo);
        
        
        JMenu menuArchivo = new JMenu("Archivo");
        
        
        JMenuItem elementoCrear = new JMenuItem("Crear");
        menuArchivo.add(elementoCrear);
        
        JMenuItem elementoSalir = new JMenuItem("Salir");
        menuArchivo.add(elementoSalir);
        
        elementoSalir.addActionListener(
        
        new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent evento)
            {
                System.exit(0);
            }
        }
        
        );
        
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menuArchivo);
        
        
        //interfaz.hacerRecuadro((Graphics2D) g, largo, largo);
    }
    
    
    public static void main(String[] args) {
        
        Practica_Robot_IA prueba= new Practica_Robot_IA(1000,1000);
        
        prueba.setVisible(true);
        
    }
    
}
