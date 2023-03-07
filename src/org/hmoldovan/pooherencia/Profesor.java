package org.hmoldovan.pooherencia;

public class Profesor extends Persona {

    public Profesor(){
        System.out.println("Inicializando constructo profesor.....");
        System.out.println();
    }



    public Profesor(String nombre, String apellido,String asignatura){
        super(nombre, apellido);
        this.asignatura=asignatura;
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
