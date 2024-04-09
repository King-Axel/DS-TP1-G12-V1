package modelo;

public abstract class Especie {
    private String nombre;

    public Especie(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }
}
