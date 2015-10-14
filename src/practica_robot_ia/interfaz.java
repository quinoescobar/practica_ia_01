
package practica_robot_ia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Interfaz extends JPanel {
   
        Matriz objetoMatriz = new Matriz(10,10,true);
        int n= objetoMatriz.getN();
        int m=objetoMatriz.getM(); 
        
    public Interfaz()
    {
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        hacerRecuadro((Graphics2D) g, 0, 0);

      
    }

    public void hacerRecuadro(Graphics2D g,int x1, int y1)
    {
        int nn= n*1000;
        
        for(int x=0;x<m;x++)
        {
            g.drawLine(x1, y1,m ,x1);
            x1+=100;
            //y1++;
            
        }
        for(int x=0;x<m;x++)
        {
            g.drawLine(x1, y1,m ,y1);
            y1+=100;
            
        }
    }
}
