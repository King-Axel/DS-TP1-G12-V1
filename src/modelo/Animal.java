package modelo;

public class Animal {
    private int edad;
    private double peso;
    private Pais paisOrigen;
    private Object especie;
    private int extraComidaKgs = 0; // Solo para animales de una especie Herbivora
    
    // Constructores /////////////////////////////
    // Para un animal de especie carnivora
    public Animal(Object especie, Pais paisOrigen, int edad, double peso) {
        String nombreClase = especie.getClass().getName();
        if(nombreClase == "modelo.EspecieHerbivora" || nombreClase == "modelo.EspecieCarnivora"){
            this.especie = especie;
        } else {
            throw new IllegalArgumentException("La especie debe ser del tipo EspecieHerbivora o EspecieCarnivora");
        }
        
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.paisOrigen = paisOrigen;
    }
    
    // Para un animal de especie herbivora
    public Animal(Object especie, Pais paisOrigen, int edad, double peso, int extraComidaKgs) {
        String nombreClase = especie.getClass().getName();
        if(nombreClase.endsWith("Herbivora") || nombreClase.endsWith("Carnivora")){
            this.especie = especie;
        } else {
            throw new IllegalArgumentException("La especie debe ser del tipo EspecieHerbivora o EspecieCarnivora");
        }
        
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.paisOrigen = paisOrigen;
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
