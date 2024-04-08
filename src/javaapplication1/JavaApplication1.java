package javaapplication1;


import modelo.Animal;
import modelo.Carnivoro;
import modelo.Empleado;
import modelo.Especie;
import modelo.Pais;
import modelo.Sector;
import modelo.Sectores;
import vista.Vista_Principal;

public class JavaApplication1 {

    public static void main(String[] args) {
        Vista_Principal ventana = new Vista_Principal();
        
        Pais pais1 = new Pais("Congo");
        Pais pais2 = new Pais("Nigeria");
        
        Especie especie1 = new Especie("Tigre", 20);
        Especie especie2 = new Especie("Leon", 20);

//        Edad, peso, pais, especie
        Carnivoro animal1 = new Carnivoro(10, 150, pais1 , especie1);
        Carnivoro animal2 = new Carnivoro(10, 210, pais1 , especie2);
                
        
//        Nombre, dni, domicilio
        Empleado empleado1 = new Empleado("Patricio Reyes", 45321584, "Siempre viva 124");
        Empleado empleado2 = new Empleado("Ramiro Pereyra", 36541247, "Avenida Rosario");
        Empleado empleado3 = new Empleado("Ana Villanueva", 41521457, "Siempre viva 124");
        
//        Numero de sector, empleado, capacidad, latitud, longitud
        Sector sector1 = new Sector(1, empleado1, 10, 1235417, 9214712 );
        sector1.agregarAnimal(animal1);
        sector1.agregarAnimal(animal2);
        
        
        
        
        Sectores grupoSectores = new Sectores();
        
        
    }
    
}
