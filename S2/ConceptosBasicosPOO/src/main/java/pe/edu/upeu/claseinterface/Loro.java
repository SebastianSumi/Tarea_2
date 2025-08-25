package pe.edu.upeu.claseinterface;

public class Loro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Hola manito p, aprende pues!");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz zZZ ... Zzz ... Anggggg");
    }
}
