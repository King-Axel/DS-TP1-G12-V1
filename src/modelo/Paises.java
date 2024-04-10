/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Dilan
 */
public class Paises {
    private ArrayList<Pais> paises;
    
    public Paises(){
        this.paises = new ArrayList<>();
    }
    
    public void agregarPaises(Pais paisesArray[]){
        System.out.println("Agregando paises al ArrayList<>()");
        
        for(int i = 0; i < paisesArray.length; i++) {
            this.paises.add(paisesArray[i]);
            System.out.println("Se ha agregado el pais: " + paisesArray[i].getNombre());
        }
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    } 
}
