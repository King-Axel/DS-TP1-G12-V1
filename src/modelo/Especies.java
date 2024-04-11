package modelo;

import java.util.ArrayList;

public class Especies {
    private ArrayList<Object> especies;

    public Especies(){
        this.especies = new ArrayList<>();
    }
    
    public void agregarEspecies(Object especiesArray[]){
        String mensajeAdvertencia = """
                                    -------------------------------------------------------------------------------------------------------------------------------
                                        ADVERTENCIA: Se ha intentado agregar un objeto inesperado que no pertenece a la clase EspecieCarnivora o EspecieHerbivora.
                                        
                                        El objeto que se ha intentado introducir pertenece a la clase %s
                                    -------------------------------------------------------------------------------------------------------------------------------
                                    """;
        
        String mensajeAdicion = """
                                Se ha agregado la especie:
                                Nombre: %s
                                Dieta: %s
                                """;
        
        for(int i = 0; i < especiesArray.length; i++){
            //Nombre de la clase del objeto recibido, en este caso, claseNombreCompleto podria ser igual a 'modelo.EspecieCarnivora'
            String claseNombre = especiesArray[i].getClass().getName();
            
            if(claseNombre.endsWith("Carnivora") || claseNombre.endsWith("Herbivora")){
                String dieta = claseNombre.substring(14);
                
                this.especies.add(especiesArray[i]);
               
                String nombreEspecie = ((Especie) especiesArray[i]).getNombre();
                
                String adicion = String.format(mensajeAdicion, nombreEspecie, dieta);
                
                System.out.println(adicion);
            } else {
                String advertencia = String.format(mensajeAdvertencia, claseNombre);
                System.out.println(advertencia);
            }
        }
    }
    
    public ArrayList<Object> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Object> especies) {
        this.especies = especies;
    }
    
}
