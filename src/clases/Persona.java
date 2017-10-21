/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author manolo
 */
public class Persona {
    
    private String nombre;
    private String ape1;
    private String ape2;

    public Persona(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }
    
    public String getNombreCompleto () {
        return this.creacionNombreCompleto();
    }
    
    private String creacionNombreCompleto () {
        return this.nombre + ' ' + this.ape1 + ' ' + this.ape2;
    }
}
