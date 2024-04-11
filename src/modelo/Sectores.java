package modelo;

import java.util.ArrayList;

public class Sectores {
    private ArrayList<Sector> sectores;
    
    // Constructor
    public Sectores() {
        this.sectores = new ArrayList<>();
    }

    
    // Metodos
    public void agregarSectores(Sector sectores[]){
        for(Sector sector: sectores){
            this.sectores.add(sector);
        }
    }
    
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
