package org.hmoldovan.ejemplo;

import org.hmoldovan.pooherencia.Alumno;
import org.hmoldovan.pooherencia.AlumnoInternacional;
import org.hmoldovan.pooherencia.Persona;
import org.hmoldovan.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la Clase Alumno =======");
        Persona alumno=new Alumno();
        alumno.setNombre("Horatiu");
        alumno.setApellido("Moldovan");
        ((Alumno)alumno).setInstitucion("Instituto Nacional");//al hacer referencia la objeto padre, debemos hacer un cast respecto al método hijo, en este caso
        //alumno
        ((Alumno) alumno).setNotaCastellano(5.5);
        ((Alumno) alumno).setNotaHistoria(6.3);
        ((Alumno) alumno).setNotaMatematicas(5.6);

        System.out.println("======= Creando la instancia de la Clase Alumno Internacional =======");
        AlumnoInternacional alumnoInternacional=new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setEdad(14);
        alumnoInternacional.setInstitucion("Instituo Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(5.6);
        alumnoInternacional.setNotaHistoria(6);
        alumnoInternacional.setNotaMatematicas(7);
        alumnoInternacional.setPais("Rumania");


        System.out.println("======= Creando la instancia de la Clase Profesor =======");
        Profesor profesor=new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Java");

        System.out.println("Alumno: " + alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + ((Alumno) alumno).getInstitucion());
        System.out.println();

        System.out.println(alumnoInternacional.getNombre()
        + " " + alumnoInternacional.getApellido()
        + " " + alumnoInternacional.getInstitucion()
        + " " + alumnoInternacional.getPais());
        System.out.println();

        System.out.println("Profesor "
                 + profesor.getAsignatura()
                + " : " + profesor.getNombre()
                + " " + profesor.getApellido());
        System.out.println();

        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null){
            String hija= clase.getName();
            String padre= clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre: " + padre );
            clase=clase.getSuperclass();
        }
    }
}
