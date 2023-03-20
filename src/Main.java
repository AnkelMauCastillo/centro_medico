import mx.edu.uacm.modelo.Estudiante;
import mx.edu.uacm.modelo.Persona;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Persona persona = new Persona("Pedro",32,"Masculino","calle 4",12345678,"@gmail.com","mexicana","Soltero");
        //noinspection deprecation
        Persona persona1 = new Estudiante("Pablo",32,"Masculino","calle 4",12345678,"@gmail.com","mexicana","Soltero",
                "121233","Sodtware",9.0, 3L, new Date(2022, Calendar.MARCH, 3));

        System.out.println(persona);
        System.out.println(persona1);
    }
}