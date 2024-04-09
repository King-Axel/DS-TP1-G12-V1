package modelo;

public class Animal {
    private int edad;
    private double peso;
    private Pais paisOrigen;
    private Object especie;
    private int extraComidaKgs; // Solo para animales de una especie Herbivora
    
    // Constructores /////////////////////////////
    // Para un animal de especie carnivora
    public Animal(Object especie, Pais paisOrigen, int edad, double peso, int extraComidaKgs) {
        this.edad = edad;
        this.peso = peso;
        this.paisOrigen = paisOrigen;
        this.especie = especie;
        this.extraComidaKgs = extraComidaKgs;
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
    
    public void setEspecie(Object especie) {
        this.especie = especie;
    }
    
    public void setExtraComidaKgs(int extraComidaKgs){
        this.extraComidaKgs = extraComidaKgs;
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
    
    public Object getEspecie() {
        return especie;
    }
    
    public int getExtraComidaKgs() {
        return extraComidaKgs;
    }
}
