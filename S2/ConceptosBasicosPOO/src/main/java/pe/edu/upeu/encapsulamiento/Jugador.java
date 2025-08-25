package pe.edu.upeu.encapsulamiento;

import lombok.Data;

/*@Getter
@Setter*/
@Data
public class Jugador {

    //Lombok libreria, mvn repository, para encapsulamiento por @Getter @Setter o @Data

    private String nombre;
    private String apellido;
    private int edad;
    private String pocision;
    private int numeroCamiseta;

    public String toString(){
        return "El jugador tiene estas caracteristicas:" +
                "\n\t nombre:" +nombre+
                "\n\t apellido:" +apellido+
                "\n\t edad:" +edad+
                "\n\t pocisiòn:" +pocision+
                "\n\t numero de camiseta:" +numeroCamiseta
                ;
    }
}
