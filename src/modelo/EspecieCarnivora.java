package modelo;

public class EspecieCarnivora extends Especie {
    private double porcentajeComida;
    
    // Constructor
    public EspecieCarnivora(String nombreEspecie, double porcentajeComida) {
        super(nombreEspecie);
        this.porcentajeComida = porcentajeComida;
    }
    
    // Setter
    public void setProcentajeComida(double porcentajeComida){
        this.porcentajeComida = porcentajeComida;
    }
    
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    
    // Getter
    public double getPorcentajeComida(){
        return porcentajeComida;
    }
    
    public String getNombre(){
        return super.getNombre();
    }
}
