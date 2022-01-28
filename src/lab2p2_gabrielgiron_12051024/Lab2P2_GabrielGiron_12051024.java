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
                    Editar();
                    break;
                }
                case 3:
                {
                    Imprimir();
                    break;
                }
                case 4:
                {
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
    
    public static void Editar()
    {
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre cientifico del animal que se editara");
        for (int i = 0; i < Animales.size(); i++) {
            if(Nombre.equals(Animales.get(i).getNombreCientifico()))
            {
                int OP = Integer.parseInt(JOptionPane.showInputDialog("1)Editar solo 1 Atributo\n 2)Editar Todo"));
                if(OP == 1)
                {
                    int O = Integer.parseInt(JOptionPane.showInputDialog(
                            "1)Editar Nombre Cientifico\n"
                                    + "2)Editar Nombre\n"
                                    + "3)Editar Habitat\n"
                                    + "4)Editar Alimentacion\n"
                                    + "5)Editar Rasgos\n"
                                    + "6)Editar Distribucion Geografica\n"
                                    + "7)Editar Vida\n"
                    ));
                    switch(O)
                    {
                        case 1:
                        {
                            String E = JOptionPane.showInputDialog("Ingrese el Nuevo Nombre Cientifico");
                            Animales.get(i).setNombreCientifico(E);
                            break;
                        }
                        case 2:
                        {
                            String E = JOptionPane.showInputDialog("Ingrese el Nuevo Nombre");
                            Animales.get(i).setNombre(E);
                            break;
                        }
                        case 3:
                        {
                            String E = JOptionPane.showInputDialog("Ingrese el Nuevo Habitat");
                            Animales.get(i).setHabitat(E);
                            break;
                        }
                        case 4:
                        {
                            String H = "";
                            int E = Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            "Eliga la nueva Alimentacion: \n "
                                                    + "1) Carnivoro\n"
                                                    + "2) Herbivoro\n"
                                                    + "3) Omnivoro\n"
                                                    + "4) Descomponedores"
                                    ));
                            if(E == 1)
                                H = "Carnivoro";
                            
                            if(E == 2)
                                H = "Herbivoro";
                            
                            if(E == 3)
                                H = "Omnivoro";
                            
                            if(E == 4)
                                H = "Descomponedores";
                            
                            Animales.get(i).setAlimentacion(H);
                            break;
                        }
                        case 5:
                        {
                            String E = JOptionPane.showInputDialog("Ingrese el Nuevo Rasgo");
                            Animales.get(i).setRasgos(E);
                            break;
                        }
                        case 6:
                        {
                            String E = JOptionPane.showInputDialog("Ingrese la nueva Distribucion Geografica");
                            Animales.get(i).setDistribucionGeografica(E);
                            break;
                        }
                        case 7:
                        {
                            int E = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva vida del animal"));
                            Animales.get(i).setVida(E);
                            break;
                        }
                    }
                }
                
                if(OP == 2)
                {
                    //Nombre Cientifico
                    String NC = JOptionPane.showInputDialog("Ingrese el Nuevo Nombre Cientifico");
                    Animales.get(i).setNombreCientifico(NC);
                    
                    //Nombre
                    String N = JOptionPane.showInputDialog("Ingrese el Nuevo Nombre");
                    Animales.get(i).setNombre(N);
                    
                    //Habitat
                    String H = JOptionPane.showInputDialog("Ingrese el Nuevo Habitat");
                    Animales.get(i).setHabitat(H);
                    
                    //Alimentacion
                    String A = "";
                    int E = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Eliga la nueva Alimentacion: \n "
                                            + "1) Carnivoro\n"
                                            + "2) Herbivoro\n"
                                            + "3) Omnivoro\n"
                                            + "4) Descomponedores"
                            ));
                    if(E == 1)
                        A = "Carnivoro";

                    if(E == 2)
                        A = "Herbivoro";

                    if(E == 3)
                        A = "Omnivoro";

                    if(E == 4)
                        A = "Descomponedores";
                    Animales.get(i).setAlimentacion(H);
                    
                    //Rasgo
                    String R = JOptionPane.showInputDialog("Ingrese el Nuevo Rasgo");
                    Animales.get(i).setRasgos(R);
                    
                    //Distribucion Geografica
                    String DB = JOptionPane.showInputDialog("Ingrese la nueva Distribucion Geografica");
                    Animales.get(i).setDistribucionGeografica(DB);
                    
                    //Vida
                    int V = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva vida del animal"));
                    Animales.get(i).setVida(V);
                }
                break;
            }
        }
    }
}
