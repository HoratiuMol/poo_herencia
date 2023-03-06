package org.hmoldovan.pooherencia;

public class Profesor extends Persona {

    public Profesor(){
        System.out.println("Inicializando constructo profesor.....");
        System.out.println();
    }

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
