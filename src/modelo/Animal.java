package modelo;

public abstract class Animal {
    private int edad;
    private double peso;
    private Pais paisOrigen;
    private Especie especie;
    
    // Constructor /////////////////////////////
    public Animal(int edad, double peso, Pais paisOrigen, Especie especie) {
        this.edad = edad;
        this.peso = peso;
        this.paisOrigen = paisOrigen;
        this.especie = especie;
    }
    
    // Setters /////////////////////////////////
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPeso(double peso) { 
        this.peso = peso;
    }
    
    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
    // Getters //////////////////////////////////
    public int getEdad() {
        return edad;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public Pais getPaisOrigen() {
        return paisOrigen;
    }
    
    public Especie getEspecie() {
        return especie;
    }
}
