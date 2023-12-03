package myoutputvariableproject;

import java.text.DecimalFormat;
import java.util.Locale;

public class MyOutputVariableProject {

    public static void main(String[] args) {
        long numero = 123098;
        double PI = Math.PI;
        String status = "";
        int grade = 8;

        System.out.printf("%d %n", numero);
        System.out.printf("%08d %n", numero);
        System.out.printf("%+d %n", numero);
        Locale.setDefault(Locale.US);
        DecimalFormat formato1 = new DecimalFormat("###,##,##");
        String valorFormateado1 = formato1.format(numero);
        System.out.printf("%s %n", valorFormateado1);

        System.out.println("Manejo de operador condicional");

        status = (grade >= 7) ? "Passed" : "Fail";

        System.out.println(status);

    }

}
