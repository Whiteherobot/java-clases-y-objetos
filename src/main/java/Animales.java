/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-11
 */
public class Animales {

    public String nombre;
    public String genero;
    public String edad ;
    public String peso;
  
    public static void main(String[] args) {
        
        var animal1 = new Animales();
        animal1.nombre="Leon";
        animal1.genero="Macho";
        animal1.edad="10";
        animal1.peso="130";
        
        System.out.println("El nombre del animal: "+animal1.nombre);
        System.out.println("El genero del animal es: "+animal1.genero);
        System.out.println("La edad del animal: "+animal1.edad);
        System.out.println("El peso del animal es: "+animal1.peso);
        
        var animal2 = new Animales();
        animal2.nombre="Jirafa";
        animal2.genero="Hembra";
        animal2.edad="15";
        animal2.peso="930";
        System.out.println("El nombre del animal es: "+animal2.nombre);
        System.out.println("El genero del animal es: "+animal2.genero);
        System.out.println("La edad del animal: "+animal2.edad);
        System.out.println("El peso del animal es: "+animal2.peso);
    }
    
}
