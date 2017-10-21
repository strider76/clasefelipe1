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
public class Perro {
    
    private static int contadorPerros;
    private String nombre;
    private String raza;
    private Gato miau; // para comprobar la visibilidad de atributo protected de la clase Gato, ver construcutor con nombre de Perro
   
    
    public Perro () {Perro.contadorPerros =  Perro.contadorPerros +1;}

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        Perro.contadorPerros--;
    }
    
    public Perro (String nombre) {
        this.nombre = nombre;
        this.miau = new Gato();
        this.miau.patas = 4; // atributo patas es de toipo protected (visible solo para clases dentro del mismo paquete)
        Perro.contadorPerros =  Perro.contadorPerros +1;
    }
    
    public Perro (String nombre, String raza) {
        this.nombre =  nombre;
        this.raza = raza;
        Perro.contadorPerros =  Perro.contadorPerros +1;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre () {
        return this.nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El objeto actual se llama: " + this.nombre + " y es de raza: " + this.raza;
    }
    
    
}
