package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

    public void probarJugador(){
        Jugador jugador=new Jugador();
        jugador.setNombre("Juan");
        jugador.setApellido("Perez");
        jugador.setEdad(20);
        jugador.setPocision("Derecho");
        jugador.setNumeroCamiseta(12);
        System.out.println(jugador);
    }

    public void probarEstudiante () {
        Estudiante estudiante=new Estudiante();
        estudiante.setCarrera("Sistemas");
        estudiante.estudiar();
    }

    public static void main(String[] args) {
        Persona persona =new Persona();
        persona.setNombre("Juan");
        persona.setEdad(20);
        persona.setGenero('M');
        persona.saludo();
        ClaseGeneral clase=new ClaseGeneral();
        clase.probarJugador();
        clase.probarEstudiante();
    }
}
