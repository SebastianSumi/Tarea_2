package pe.edu.upeu.encapsulamiento.modelo;

public class Persona {

    //ApacheNetBeans clickDerecho -> refactor -> encapsulateFields

    String nombre;
    int edad;
    char genero;

    public void saludo(){
        System.out.println("Hola mi nombre es: "+getNombre());
        System.out.println("Y mi edad es: "+getEdad());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
}
