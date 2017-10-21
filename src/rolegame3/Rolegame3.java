/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolegame3;

import clases.Chico;
import clases.Perro;
import clases.Gato;
import clases.Persona;

/**
 *
 * @author manolo
 */
public class Rolegame3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creacion de Nela" );
        Perro perroNela = new Perro("nela", "perro de agua");
        System.out.println("El objeto perroNela se llama: " + perroNela.getNombre() + " y es de raza: " + perroNela.getRaza());
        System.out.println("Creacion de Taco");        
        Perro perroTaco = new Perro();
        perroTaco.setNombre("taco");
        perroTaco.setRaza("Labrador");
        System.out.println("datos de Taco: " + perroTaco);
        Perro perroChica = null; // Creamos la referencia objeto perroChica pero con ningun valor creado por new
        // perroChica.setNombre("Error por objeto no instanciado");
        perroChica = new Perro("Chica");
        perroChica.setRaza("Podenco");
        System.out.println("datos de Chica: " + perroChica);
        Perro mismoChica;
        mismoChica = perroChica; //dos objetpos que apuntan a una misma direccion
        //Perro mismoChica = perroChica; //tAMBIEN VALIDO , EVITA HACERLO EN DOS PASOS
        mismoChica.setNombre("Chica mejorada");
        System.out.println("datos de Chica modificada por mismoChica: " + perroChica);
        
        Gato miauMain = new Gato();
        //System.out.println("El numero de patas de gato es: " + miauMain.patas); // daria un error por ser un atributyo protected fuera del paquete "clases" donde esta declarada
        
        Persona manolo = new Persona("manuel", "millan", "galan");
        System.out.println("El nombre completo de manolo es : " + manolo.getNombreCompleto());
        
     
        System.out.println("Nos saltamos las restricciones" );
        Chico chicoBueno = new Chico("chico correcto");
        chicoBueno.setEdad(-3);
        System.out.println("La edad de chico bueno es " + chicoBueno.getEdad());
        Chico chicoMalo = new Chico("chico incorrecto");
        chicoMalo.edad = -3;
        System.out.println("La edad de chico malo es " + chicoMalo.getEdad());
    }
    
}
