
package metodoDos;

public class Operacion {
    
    public static boolean comporbarCadena(String cadena) {
        
        boolean opcion = false;
        
        if ((cadena.startsWith("A"))||
                (cadena.startsWith("C"))||
                (cadena.startsWith("D"))){
        
            opcion = true;   
        }
        
        return opcion;
    }
}

