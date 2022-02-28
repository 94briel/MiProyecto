/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gabriel
 */
public class Animal extends SerVivo{
    private String grito;
    
    public Animal(String grito, String nombre, int edad, boolean estaVivo) {
        super(nombre, edad, estaVivo);
        this.grito = grito;
    }
    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }
    
    public String gritar() {
        if (this.isEstaVivo()) return "ESTOY GRITANDO";
        else return "No puedo gritar";
    }
}