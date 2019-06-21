
package ejemploTres;

public class Operacion {
    
    public static int obtenerSuma(int[] valores){
      
      int suma = 0;
      
        for (int i = 0; i <valores.length; i++) {
            
            suma+= valores[i];
        }
        
        return suma;
    }
    
    
}
