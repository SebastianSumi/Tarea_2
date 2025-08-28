package pe.edu.upeu.encapsulamiento;

public class Estudiante {

    //IntelliJ clickDerecho -> generate -> getter and setter

    private String nombre;
    private String carrera;

    public void estudiar() {
        System.out.println("Estudiar, investigar ... en la carrera de: "+carrera);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
