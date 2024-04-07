package modelo;

public class Herbivoro extends Animal {
    
    // Constructor
    public Herbivoro(int edad, double peso, Pais paisOrigen, Especie especie){
        super(edad, peso, paisOrigen, especie);
    }
    
    // Metodo para calcular la comida que consumen los herviboros
    public double calcularAlimento() {
        return 0;
    }
}
