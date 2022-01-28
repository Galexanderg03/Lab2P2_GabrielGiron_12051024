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
public class Animal {
    private String NombreCientifico;
    private String Nombre;
    private String Habitat;
    private String Alimentacion;
    private String Rasgos;
    private String distribucionGeografica;
    private int Vida;

    public Animal(String NombreCientifico, String Nombre, String Habitat, String Alimentacion, String Rasgos, String distribucionGeografica, int Vida) {
        this.NombreCientifico = NombreCientifico;
        this.Nombre = Nombre;
        this.Habitat = Habitat;
        this.Alimentacion = Alimentacion;
        this.Rasgos = Rasgos;
        this.distribucionGeografica = distribucionGeografica;
        this.Vida = Vida;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String NombreCientifico) {
        this.NombreCientifico = NombreCientifico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public String getRasgos() {
        return Rasgos;
    }

    public void setRasgos(String Rasgos) {
        this.Rasgos = Rasgos;
    }

    public String getDistribucionGeografica() {
        return distribucionGeografica;
    }

    public void setDistribucionGeografica(String distribucionGeografica) {
        this.distribucionGeografica = distribucionGeografica;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    @Override
    public String toString() {
        return "Animal{" + "NombreCientifico=" + NombreCientifico + ", Nombre=" + Nombre + ", Habitat=" + Habitat + ", Alimentacion=" + Alimentacion + ", Rasgos=" + Rasgos + ", distribucionGeografica=" + distribucionGeografica + ", Vida=" + Vida + '}';
    }
    
    
}
