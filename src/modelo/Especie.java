package modelo;

public class Especie {
    private String nombre;
    private double porcentajeComida;

    public Especie(String nombre, double porcentajeComida) {
        this.nombre = nombre;
        this.porcentajeComida = porcentajeComida;
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
