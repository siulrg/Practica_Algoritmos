/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author Luis Enrique
 */
public class Cola {
    private int frente; 
    private int fin;
    private static final int MAXIM=10;
    private Object [] lista;
    public Cola()
    {
        frente=0;
        fin=-1;
        lista=new Object[MAXIM];
    }
    public void insertar(Object element) throws Exception
    {
        if(!colaLlena())
        {
            lista[++fin]=element;
        }
        else
        {
            throw new Exception("La cola esta llena");
        }
    }
    public boolean colaLlena()
    {
        return fin==(MAXIM-1);
    }
    public Object quitar() throws Exception
    {
        if(!colaVacia())
        {
            return lista[++frente];
        }
        else
        {
            throw new Exception("La cola esta vacia");
        }
    }
    public boolean colaVacia()
    {
        return frente>fin;
    }
    public void visualizar()
    {
        System.out.println("La cola posee los siguinetes elementos:");
        for(int i=frente;i<(fin+1);i++)
        {
            System.out.println(lista[i]);
        }
    }
    public void eliminarCola()
    {
        frente=0;
        fin=-1;
    }
    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return lista[frente];
        }
        else
        {
            throw new Exception("La cola esta vacia");
        }
    }
}