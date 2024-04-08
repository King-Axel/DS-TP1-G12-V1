package javaapplication1;


import java.util.ArrayList;
import modelo.Animal;
import modelo.Carnivoro;
import modelo.Empleado;
import modelo.Especie;
import modelo.Herbivoro;
import modelo.Pais;
import modelo.Sector;
import modelo.Sectores;
import vista.Vista_Principal;

public class JavaApplication1 {

    public static void main(String[] args) {
        Vista_Principal ventana = new Vista_Principal();
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        ArrayList<Sector> listaSectores = new ArrayList<>();
        
        Pais pais1 = new Pais("Congo");
        Pais pais2 = new Pais("Nigeria");
        Pais pais3 = new Pais("Yemen");
        
//      Especies carnivoras
        Especie especie1 = new Especie("Tigre", 20);
        Especie especie2 = new Especie("Leon", 20);
        
//      Aca ojo con el porcentaje de comida que es solo de los carnivoros, pero queda como 0 en los hervivoros
        Especie especie3 = new Especie("Jirafa", 0);
        Especie especie4 = new Especie("Cebra", 0);

//        Edad, peso, pais, especie
        Carnivoro animal1 = new Carnivoro(10, 150, pais1 , especie1);
        Carnivoro animal2 = new Carnivoro(12, 210, pais2 , especie2);
        
        Herbivoro animal3 = new Herbivoro(9, 1000, pais3 , especie3);
        Herbivoro animal4 = new Herbivoro(2, 80, pais3 , especie4);
                
        
//        Nombre, dni, domicilio
        Empleado empleado1 = new Empleado("Patricio Reyes", 45321584, "Siempre viva 124");
        Empleado empleado2 = new Empleado("Ramiro Pereyra", 36541247, "Avenida Rosario");
        Empleado empleado3 = new Empleado("Ana Villanueva", 41521457, "Siempre viva 124");
        
//        Numero de sector, empleado, capacidad, latitud, longitud
        Sector sector1 = new Sector(1, empleado1, 10, 1235417, 9214712,  listaAnimales);
        sector1.agregarAnimal(animal1);
        sector1.agregarAnimal(animal2);
        
        Sector sector2 = new Sector(2, empleado2, 10, 6954121, 7945120,  listaAnimales);
        sector2.agregarAnimal(animal3);
        sector2.agregarAnimal(animal4);
        
        Sector sector3 = new Sector(3, empleado3, 10, 4914171, 4955699,  listaAnimales);
        
//        ArrayList<Animal> animales = new ArrayList();
//        animales = sector1.getAnimales();
//
//        System.out.println("Numero Sector: " + sector1.getNumero());
//        for(Animal animal: animales){
//            System.out.println("Especie: " + animal.getEspecie().getNombre());
//            System.out.println("Peso: " + animal.getPeso());
//            System.out.println("Edad: " + animal.getEdad());
//            System.out.println("Pais de Origen: " + animal.getPaisOrigen().getNombre());
//        }
        
        Sectores grupoSectores = new Sectores(listaSectores);
        
        grupoSectores.agregarSector(sector1);
        grupoSectores.agregarSector(sector2);
        grupoSectores.agregarSector(sector3);
        
        
    }
    
}
