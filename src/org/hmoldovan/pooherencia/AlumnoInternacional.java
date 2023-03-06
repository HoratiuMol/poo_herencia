package org.hmoldovan.pooherencia;

public class AlumnoInternacional extends Alumno {

    public AlumnoInternacional(){
        System.out.println("inicializando constructor alumno internacional.....");
        System.out.println();
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

}
