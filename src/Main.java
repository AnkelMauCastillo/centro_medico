import mx.edu.uacm.modelo.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Persona persona = new Persona("Pedro",32,"Masculino","calle 4",12345678,"@gmail.com","mexicana","Soltero");
        //noinspection deprecation
        Persona persona1 = new Estudiante(
                "Pablo",32,"Masculino","calle 4",12345678,"@gmail.com","mexicana","Soltero",
                "121233","Sodtware",9.0, 3L, new Date(2022, Calendar.MARCH, 3));

        Medico medico = new Medico( "Pepé", 23, "Masculino","calle 5", 123456,
                "aaa@gmail.com", "Colombiana", "Soltero", 765354,23456.0,new Date(23/01/213));
        Medico medico1 = new Medico( "Pedro", 23, "Masculino","calle 5", 123456,
                "aaa@gmail.com", "Colombiana", "Soltero", 12345,23456.0,new Date(23/01/213));


        System.out.println(persona);
        System.out.println(persona1);
        System.out.println();

        Expediente expediente = new Expediente();
        //System.out.println(expediente.getExpedientes());
        expediente.agregarConsulta(new Consulta(new Date(23,4,2023), medico));
        expediente.agregarConsulta(new Consulta(new Date(24, 5,2023 ), medico1));
        /*for (Consulta next : expediente.getExpedientes().values()) {
            System.out.println(next);

        }

         */

        for (Consulta c:
             expediente) {
            System.out.println(c);
        }

        Iterator<Consulta> iterador = expediente.iterator();
        iterador.next();
        iterador.remove();
        System.out.println();
        for (Consulta c:
                expediente) {
            System.out.println(c);
        }





    }
}