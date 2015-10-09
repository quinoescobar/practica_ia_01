/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_robot_ia;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author quinoEscobar Erickazo
 */
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
        
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menuArchivo);
        
    }
    
    
    public static void main(String[] args) {
        
        Practica_Robot_IA prueba= new Practica_Robot_IA(1000,1000);
        
        prueba.setVisible(true);
        
    }
    
}
