package org.hmoldovan.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        super();//por defecto si se omite super() llama por defecto al constructo padre, si el padre no tiene un coinstructor vacío daría error
        System.out.println("Inicializando constructo alumno.....");
        System.out.println();
    }

    public Alumno(String nombre){

    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
