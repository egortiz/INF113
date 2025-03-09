import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CCircularPA ccpa = new CCircularPA();
        PilaA pa = new PilaA();

        // Llenar Colas
        llenarPA(pa);

        // Mostrar Colas
        pa.mostrar();

    }

    // Cargar Colas
    public static void llenarPA(PilaA PA) {
        PA.adicionar(new Artesanias("3469141", "Charango", "Madera", 500));
        PA.adicionar(new Artesanias("3469141", "Guitarra", "Madera", 1500));
        PA.adicionar(new Artesanias("2211441", "Zampoña", "Bambu", 30));
        PA.adicionar(new Artesanias("2211441", "Quena", "Madera", 25.50));
        PA.adicionar(new Artesanias("4304569", "Manilla", "Lana", 2.5));
        PA.adicionar(new Artesanias("2370878", "Chompa", "Lana", 60));
        PA.adicionar(new Artesanias("39856845", "Polera", "Lycra", 15));
    }

    public static void llenarColas(CCircularPA A, PilaA PA) {
        /*
         * *
         * PA.adicionar(new ("3469141", "Eddy", "Ortiz", "Machicado"));
         * PA.adicionar(new Expositor("2370878", "Rufina", "Mamani", "Machicado"));
         * E.adicionar(new Expositor("2211441", "Pedro", "Ortiz", "Arenas"));
         * E.adicionar(new Expositor("4304569", "Carlos", "Ortiz", "Machicado"));
         * E.adicionar(new Expositor("79856845", "Yazid", "Ortiz", "Pañuni"));
         * E.adicionar(new Expositor("45897855", "Elias", "Apaza", "Choque"));
         * E.adicionar(new Expositor("39856845", "Lizeth", "Quispe", "Peña"));
         * 
         * 
         * PA.adicionar(new Artesanias("3469141", "Charango", "Madera", 500));
         * A.adicionar(new Artesanias("3469141", "Guitarra", "Madera", 1500));
         * A.adicionar(new Artesanias("2211441", "Zampoña", "Bambu", 30));
         * A.adicionar(new Artesanias("2211441", "Quena", "Madera", 25.50));
         * A.adicionar(new Artesanias("4304569", "Manilla", "Lana", 2.5));
         * A.adicionar(new Artesanias("2370878", "Chompa", "Lana", 60));
         * A.adicionar(new Artesanias("39856845", "Polera", "Lycra", 15));
         * 
         */

    }
}
