package pe.edu.upeu.enums;

enum GENERO{
    Femenino,
    Masculino;
}

public class Estudiante {
    String codigo;
    String nombre;
    String apellido;
    GENERO genero;
    CARRERA carrera;

    public Estudiante(String codigo, String nombre, String apellido, GENERO genero, CARRERA carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("202010569","David",
                "Mamani",GENERO.Masculino,CARRERA.Sistemas);
        System.out.println(estudiante.codigo+" "+estudiante.nombre+" "
                +estudiante.apellido+" "+estudiante.genero+" "+estudiante.carrera);
    }
}
