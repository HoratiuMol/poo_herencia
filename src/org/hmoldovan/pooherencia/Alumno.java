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
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);

    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion=institucion;//porque institucion es propio de alumno y no del padre, por eso no se
        //incluye el super.SUPER() SIEMPRE PRIMERO
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaCastellano, double notaMatematicas, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas=notaMatematicas;
        this.notaCastellano=notaCastellano;
        this.notaHistoria=notaHistoria;

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
