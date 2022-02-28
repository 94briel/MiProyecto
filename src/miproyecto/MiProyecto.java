/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyecto;
import Modelo.Animal;
import Modelo.Persona;
/**
 *
 * @author gabriel
 */
public class MiProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona raul = new Persona(1.80f, "Raul", 22, true);
        Animal loro = new Animal("AAA", "Fernando", 11, false);
        Persona camilo = new Persona(1.72f, "Camilo", 30, true);
        System.out.println(loro.gritar());
    }
    
}
