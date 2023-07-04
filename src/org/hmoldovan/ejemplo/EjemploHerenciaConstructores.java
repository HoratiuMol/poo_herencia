package org.hmoldovan.ejemplo;

import org.hmoldovan.pooherencia.*;

import java.sql.SQLOutput;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos del tipo persona \n");
        System.out.println(" , nombre :" + persona.getNombre()
                + " , apellido :" + persona.getApellido()
                + " , edad : " + persona.getEdad());

        if(persona instanceof  Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno \n");
            System.out.println("Institución : " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matemáticas : " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia : " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano : " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional \n");
                System.out.println("Pais : " + ((AlumnoInternacional) persona).getPais());
                System.out.println("Nota Idiomas : " + ((AlumnoInternacional) persona).getNotaIdiomas());

            }
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor \n");
            System.out.println("Asignatura : " + ((Profesor) persona).getAsignatura());

        }

        System.out.println("============================= sobre escritura saludar ===========================");
        System.out.println(persona.saludar());
        System.out.println("=================================================");

      /* System.out.println("============================= sobre escritura nota promedio===========================");
        System.out.println(((Alumno) persona).calcularPromedio());
        System.out.println("=================================================");
        Da errir de ClassCastException
        */
    }
}
