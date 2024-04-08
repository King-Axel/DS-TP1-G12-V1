package modelo;

import java.util.ArrayList;

public class Sectores {
    private ArrayList<Sector> sectores;
    
    // Constructor

    public Sectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }

    
    // Metodos
    public void agregarSector(Sector sector) {
        sectores.add(sector);
    }
    
    // Setter
    public void setSectores(ArrayList sectores) {
        this.sectores = sectores;
    }
    
    // Getter
    public ArrayList getSectores() {
        return sectores;
    }
}
