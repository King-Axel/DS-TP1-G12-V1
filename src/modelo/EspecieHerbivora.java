package modelo;

public class EspecieHerbivora extends Especie {
    // Constructor
    public EspecieHerbivora(String nombreEspecie){
        super(nombreEspecie);
    }
    
    // Metodo para calcular la comida que consumen los herviboros
    public double calcularAlimento() {
        return 0;
    }
    
    // Setter
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    
    // Getter
    public String getNombre(){
        return super.getNombre();
    }
}
