package org.hmoldovan.ejemplo;

import org.hmoldovan.pooherencia.Alumno;
import org.hmoldovan.pooherencia.AlumnoInternacional;
import org.hmoldovan.pooherencia.Persona;
import org.hmoldovan.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la Clase Alumno =======");
        Persona alumno=new Alumno("Horatiu", "moldovan", 18, "Isabel la Católica" );

        ((Alumno) alumno).setNotaCastellano(5.5);
        ((Alumno) alumno).setNotaHistoria(6.3);
        ((Alumno) alumno).setNotaMatematicas(5.6);
        alumno.setEmail("horatiu.moldovan@email.com");

        System.out.println("======= Creando la instancia de la Clase Alumno Internacional =======");
        AlumnoInternacional alumnoInternacional=new AlumnoInternacional("Peter", "Gosling", "Rumania");

        alumnoInternacional.setEdad(14);
        alumnoInternacional.setInstitucion("Instituo Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(5.6);
        alumnoInternacional.setNotaHistoria(6);
        alumnoInternacional.setNotaMatematicas(7);
        alumnoInternacional.setEmail("horatiu.moldovan@email.com");


        System.out.println("======= Creando la instancia de la Clase Profesor =======");
        Profesor profesor=new Profesor("Andrés","Guzmán","Java");
        profesor.setEdad(41);
        profesor.setEmail("horatiu.moldovan@email.com");

        System.out.println("Alumno: " + alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + ((Alumno) alumno).getInstitucion());
        System.out.println();

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);


    }



    public static void imprimir(Persona persona){
        System.out.println("=================================================");
        System.out.println(persona);
    }
}
