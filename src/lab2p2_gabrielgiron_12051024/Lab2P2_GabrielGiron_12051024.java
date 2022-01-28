/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_gabrielgiron_12051024;
/**
 *
 * @author Galex
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Lab2P2_GabrielGiron_12051024 {


    static ArrayList<Animal> Animales = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalesPorDefecto();
        int opcion = -1;
        while(opcion != 5)
        {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "1) Agregar Animal\n"+
                            "2) Editar Animal\n"+
                            "3) Imprimir Animal\n"
                          + "4) Alimentar Animal\n"
                          + "5)Salir"
                    ));
            switch(opcion)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    Imprimir();
                    break;
                }
            }
        }
    }
    
    public static void AnimalesPorDefecto()
    {
        //Ciervo
        String NombreCientifico1 = "Cervidae";
        String Nombre1 = "Ciervo";
        String Habitat1 = "Bosques";
        String Alimentacion1 = "Herbivoro";
        String Rasgos1 = "Cola Corta";
        String Geografia1 = "Europa";
        int Vida1 = 10;
        Animales.add(new Animal(NombreCientifico1, Nombre1, Habitat1, Alimentacion1, Rasgos1, Geografia1, Vida1));
        
        //Tigre 
        String NombreCientifico2 = "Panthera Tigris";
        String Nombre2 = "Tigre";
        String Habitat2 = "Sabanas";
        String Alimentacion2 = "Carnivoro";
        String Rasgos2 = "Pelaje Anaranjado";
        String Geografia2 = "India";
        int Vida2 = 80;
        Animales.add(new Animal(NombreCientifico2, Nombre2, Habitat2, Alimentacion2, Rasgos2, Geografia2, Vida2));
        
        //Tiburon
        String NombreCientifico3 = "Selachimorpha";
        String Nombre3 = "Tiburon";
        String Habitat3 = "Mar Abierto";
        String Alimentacion3 = "Carnivoro";
        String Rasgos3 = "Colmillos Afilados";
        String Geografia3 = "SudaAfrica";
        int Vida3 = 200;
        Animales.add(new Animal(NombreCientifico3, Nombre3, Habitat3, Alimentacion3, Rasgos3, Geografia3, Vida3));
    }
    
    public static void Imprimir()
    {
        int OP = Integer.parseInt(JOptionPane.showInputDialog(
                          "1) Imprimir por Posicion de Lista\n"
                        + "2) Imprimir Lista Completa\n"
                        + "3) Imprimir por Nombre Cientifico"
        ));
        
        switch(OP)
        {
            case 1:
            {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Posicion del Animal en la lista"));
                if(pos < Animales.size())
                {
                    JOptionPane.showMessageDialog(null, Animales.get(pos).toString());
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Numero Ingresado es mayor que el tamaño de la Lista");
                }
                break;
            }
            case 2:
            {
                String Salida = "";
                for (int i = 0; i < Animales.size(); i++) 
                {
                    Salida = Salida + Animales.get(i).toString() + "\n";
                }
                JOptionPane.showMessageDialog(null, Salida);
                break;
            }
            case 3:
            {
                String Nombre = JOptionPane.showInputDialog("Ingrese el nombre cientifico del animal");
                for (int i = 0; i < Animales.size(); i++) {
                    if(Nombre.equals(Animales.get(i).getNombreCientifico()))
                    {
                        JOptionPane.showMessageDialog(null, Animales.get(i).toString());
                        break;
                    }
                }
                break;
            }
        }
    }
}
