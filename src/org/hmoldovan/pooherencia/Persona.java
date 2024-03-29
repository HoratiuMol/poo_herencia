package org.hmoldovan.pooherencia;

public class Persona {//persona hereda también de Object, asi que alumno es hijo  de persona y objetc de forma indirecta

    private String nombre; //todo atributo "protected" en la case padre es accesible en toda su descendencia, pero lo mejor es que sean priovate y mediante
    ///get and sett se permite que la clase hijha los pueda acceder
    private String apellido;
    private String email;
    private int edad;

    public Persona(){
        System.out.println("Persona : inicializando constructor......");
        System.out.println();
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido; //inicializamos parametros
    }



    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar(){
        return "Hola que tal";
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad + '\'' +
                ",saludo=" + this.saludar();
    }
}
