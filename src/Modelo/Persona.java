/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gabriel
 */
public class Persona extends SerVivo{
    private float estatura;
    
    public Persona(float estatura, String nombre, int edad, boolean estaVivo) {
        super(nombre, edad, estaVivo);
        this.estatura = estatura;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String presumirEstatura(String saludo){
        return saludo + ", soy " + this.getNombre() + " y mi estatura es de " + this.getEstatura();
    }
}   
