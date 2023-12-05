
package outputvarables;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author User
 */
public class MyOutputVarablesProject {

    
     public static void main(String[] args) {
        long numero = 123098;
        double pi = Math.PI;
        String status = "";
        int grade = 8;
        System.out.printf("%d %n", numero);
        System.out.printf("%08d %n", numero);
        System.out.printf("%+d %n", numero);
        
        Locale.setDefault(Locale.US); // Use the US format to print out numbers
        DecimalFormat formato1 = new DecimalFormat("###,###.##");
        String valorFormateado1 = formato1.format(numero);
        
        System.out.printf("%s %n", valorFormateado1);
        /* continue generating code...
        
        ...
        */
        //Frist part
        System.out.println("Manejo del operador condicional");
        //Get status the estudent 
        status = (grade >= 7) ? "Passed" : "Fail";
        
        //Print status
        System.out.println(status);
    }
}
