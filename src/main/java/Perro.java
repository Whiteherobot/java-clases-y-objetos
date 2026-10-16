/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-11
 */
public class Perro {
    
    public String nombre;
    public String raza;
    public String peso ;
    public String edad;
    
     public static void main(String[] args) {
        var perro1 = new Perro();
        perro1.raza="Pastor Alemán";
        perro1.nombre="Pepe";
        perro1.peso= "8";
        perro1.edad = "5";
        
        System.out.println("El raza del perro es: "+perro1.raza);
        System.out.println("El nombre del perro es: "+perro1.nombre);
        System.out.println("El peso del perro es: "+perro1.peso);
        System.out.println("La edad del perro es: "+perro1.edad);
        
       var perro2 = new Perro();
        perro2.raza="Pitbull";
        perro2.nombre="Chompiras";
        perro2.peso= "27";
        perro2.edad = "5";
        System.out.println("El raza del perro es: "+perro2.raza);
        System.out.println("El nombre del perro es: "+perro2.nombre);
        System.out.println("El peso del perro es: "+perro2.peso);
        System.out.println("La edad del perro es: "+perro2.edad);
     
}
}

