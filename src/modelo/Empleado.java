package modelo;

public class Empleado {
    private String nombre;
    private int documento;
    private String domicilio;
    
    // Constructor
    public Empleado(String nombre, int documento, String domicilio) {
        this.nombre = nombre;
        this.documento = documento;
        this.domicilio = domicilio;
    }
    
    // setters ///////////////////////////////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    // getters 
    public String getNombre() {
        return nombre;
    }
    
    public int getDocumento() {
        return documento;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
}
