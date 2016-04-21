/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

/**
 *
 * @author Luis Enrique
 */
public class Cola {
    private String lista[];
    private static final int MAXIM=5;
    private int frente, fin;
    public Cola()
    {
        frente=0;
        fin=-1;
        lista=new String[MAXIM];
    }
    public void insertar(String element)
    {
        if(colaLlena())
        lista[++fin]=element;
    }
    public boolean colaLlena()
    {
        return fin==MAXIM;
    }
    public boolean colaVacia()
    {
        return frente>fin;
    }
    public String quitar() throws Exception
    {
        if(colaVacia())
            return lista[frente++];
        else
            throw new Exception("Cola Vacia");
    }
}
