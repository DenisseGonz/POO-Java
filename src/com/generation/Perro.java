package com.generation;

public class Perro {

    //Propiedades y atributos de la clase
    String nombre;
    String raza;
    int edad;
    String tamanio;

    //Esto es el constructor
    public Perro() {
    }

    public Perro (String nombre, String raza, int edad, String tamanio){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
    }

    //métodos de la clase

    public void caracteristicas(){
        System.out.println("Hola, mi nombre es: "+this.nombre+
                ", soy de raza "+this.raza+" tengo "+this.edad+
                " años y soy de tamaño "+this.tamanio);
    }
    public void comer(){
        System.out.println(this.nombre+" está comiendo");
    }
    public void dormir(){
        System.out.println(this.nombre+" está durmiendo");
    }
    public void jugar(){
        System.out.println(this.nombre+" está jugando con la pelota");
    }

}
