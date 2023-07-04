package org.hmoldovan.pooherencia;

public class AlumnoInternacional extends Alumno {

    public AlumnoInternacional(){
        System.out.println("inicializando constructor alumno internacional.....");
        System.out.println();
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais=pais;
    }

    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno internacional, del pais " + getPais() + ", mi nombre es " + getNombre();
    }
}
