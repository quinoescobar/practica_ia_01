
package practica_robot_ia;


public class Matriz {
    
    
    private int M;
    private int N;
    private boolean isRandom;
    private int v[];
    
    public Matriz(int m, int n, boolean b)
    {
        this.M = m;
        this.N = n;
        this.isRandom = b;
        /* Poner un límite de matriz máxima , 100 x 100 , mínimo 3 x 3 */
           
              
        
   }
    
    public int getN()
    {
        return N;
    }
    
    public int getM()
    {
        return M;
    }
}
