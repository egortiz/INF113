import java.util.*;

public class ColaSExpositores {
    private int max = 20;;
    private Expositor v[] = new Expositor[max + 1];;
    private int ini;
    private int fin;

    ColaSExpositores() {
        ini = 0;
        fin = 0;
    }

    boolean esVacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        } else {
            return (false);
        }
    }

    boolean esLlena() {
        if (fin == max) {
            return (true);
        } else {
            return (false);
        }
    }

    int nroElem() {
        int w = (fin - ini);
        return (w);
    }

    void adicionar(Expositor elem) {
        if (!esLlena()) {
            fin++; // v[fin+1]=elem;
            v[fin] = elem; // fin++;
        } else {
            System.out.println("Cola Estudiante llena");
        }
    }

    Expositor eliminar() {
        Expositor elem = new Expositor();
        if (!esVacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola Simple vacia");
        }
        return (elem);
    }

    void mostrar() {
        if (!esVacia()) {
            System.out.println("\n---> Datos de la Cola Simple (Expositores) <---");
            System.out.println(
                    "*****************************************************************************************************");
            ColaSExpositores aux = new ColaSExpositores();
            while (!esVacia()) {
                Expositor elem = eliminar();
                elem.mostrarE();
                aux.adicionar(elem);
            }
            System.out.println(
                    "*****************************************************************************************************");
            vaciar(aux);
        } else {
            System.out.println("Cola Simple vacia");
        }
    }

    void vaciar(ColaSExpositores a) {
        while (!a.esVacia()) {
            adicionar(a.eliminar());
        }
    }

    void llenar(Expositor W, int n) {
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            Expositor elem = new Expositor();
            elem.leerE();
            adicionar(elem);
        }
    }

}