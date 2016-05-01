/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Enrique
 */
public class Main {
    public static void main(String args[])
    {
        Cola cola=new Cola();
        int i;
        try
        {
            for(i=0;i<10;i++)
            {
                cola.insertar(i);
            }
            System.out.println(cola.frenteCola());
            cola.visualizar();
            System.out.println(cola.quitar());
            
        } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
