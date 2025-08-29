package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int a, b;

    class ClaseInterna1{
        double r;

        double sumar(){
            return a+b;
        }
    }

    class ClaseInterna2{
        double r;

        double restar(){
            return a-b;
        }
    }

}

class ClaseExterna2{
    public static void main(String[] args) {
        ClaseExterna  claseExterna = new ClaseExterna();
        claseExterna.a = 10;
        claseExterna.b = 20;
        ClaseExterna.ClaseInterna1 claseInterna = claseExterna.new ClaseInterna1();
        System.out.println(claseInterna.sumar());
        ClaseExterna.ClaseInterna2 claseInterna2 = claseExterna.new ClaseInterna2();
        System.out.println(claseInterna2.restar());
    }
}