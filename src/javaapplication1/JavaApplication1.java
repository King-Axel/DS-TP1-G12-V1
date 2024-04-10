package javaapplication1;


import java.util.ArrayList;
import modelo.Animal;
import modelo.Especies;
import modelo.EspecieCarnivora;
import modelo.Empleado;
import modelo.EspecieHerbivora;
import modelo.Pais;
import modelo.Paises;
import modelo.Sector;
import modelo.Sectores;
import vista.VistaPrincipal;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        ArrayList<Sector> listaSectores = new ArrayList<>();
        
        Paises listaPaises = new Paises();
        Especies listaEspecies = new Especies();

// Creacion de paises
        Pais congo = new Pais("Congo");
        Pais nigeria = new Pais("Nigeria");
        Pais yemen = new Pais("Yemen");
        Pais india = new Pais("India");
        Pais tanzania = new Pais("Tanzania");
        Pais somalia = new Pais("Somalia");
        Pais sudan = new Pais("Sudan");
        Pais etiopia = new Pais("Etiopia");
        
    // Agregando paises a la clase Paises que contiene un arrayList con todos los paises que se crearon
        Pais[] paisesArray = {congo, nigeria, yemen, india, tanzania, somalia, sudan, etiopia};

        listaPaises.agregarPaises(paisesArray);
        
//      Especies carnivoras
//                                                 Nombre de especie, Porcentaje de su peso en carne que consume
        EspecieCarnivora tigre = new EspecieCarnivora("Tigre", 0.5);
        EspecieCarnivora leon = new EspecieCarnivora("Leon", 0.85);
        
//      Especies Herbivoras
//                                                 Nombre de Especie
        EspecieHerbivora jirafa = new EspecieHerbivora("Jirafa");
        EspecieHerbivora cebra = new EspecieHerbivora("Cebra");
        
    // Agregando todas las especies a un array de especies
        Object[] especiesArray = {tigre, leon, jirafa, cebra, yemen};
        listaEspecies.agregarEspecies(especiesArray);
        
//        Creacion de animales
//                                  Especie, Pais, Edad, Peso, Extra de comida que comen los herviboros 
        Animal animal1 = new Animal(tigre, india, 8, 200);
        Animal animal2 = new Animal(leon, tanzania, 10 , 210);
        
        Animal animal3 = new Animal(jirafa, somalia, 17, 1000, 10);
        Animal animal4 = new Animal(cebra, sudan, 15 , 370, 5);
                
        
//        Creacion de Empleados
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
        
        VistaPrincipal ventana = new VistaPrincipal(listaPaises, listaEspecies);
        
    }
    
}
