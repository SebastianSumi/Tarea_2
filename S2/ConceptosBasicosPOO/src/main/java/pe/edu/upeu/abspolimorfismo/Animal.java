package pe.edu.upeu.abspolimorfismo;

public abstract class Animal {
    protected String tipo = "XXXX";

    public abstract void emitirSonido();

    public void dormir(){
        System.out.println("zzz..ZZZz....(con mucho respeto)");
    }

}
