package pe.edu.upeu.encapsulamiento;

import pe.edu.upeu.encapsulamiento.modelo.Persona;

public class ClaseGeneral {

    public String probarJugador(){
        Jugador jugador=new Jugador();
        jugador.setNombre("Juan");
        jugador.setApellido("Perez");
        jugador.setEdad(20);
        jugador.setPocision("Derecho");
        jugador.setNumeroCamiseta(12);
        return "El jugador tiene estas caracteristicas:" +
                "\n\t nombre:" +jugador.getNombre()+
                "\n\t apellido:" +jugador.getApellido()+
                "\n\t edad:" +jugador.getEdad()+
                "\n\t pocisiòn:" +jugador.getPocision()+
                "\n\t numero de camiseta:" +jugador.getNumeroCamiseta()
                ;
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
    }
}
