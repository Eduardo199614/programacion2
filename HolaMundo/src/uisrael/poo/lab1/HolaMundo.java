
package uisrael.poo.lab1;

/**
 *
 * @author User
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Este es mi primer programa Java! y 3+2 es: "+(3+2));
        saludar("Luis");
    }
    
     public static void saludar(String nombre){
         System.out.println("Hola"+nombre+"como estas");
     }
}
