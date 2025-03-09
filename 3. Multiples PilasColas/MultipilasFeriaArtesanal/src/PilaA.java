import java.util.*;

public class PilaA {
    private int max = 100;
    private Artesanias v[] = new Artesanias[max + 1];
    private int tope;

    PilaA() {
        tope = 0;
    }

    boolean esVacia() {
        if (tope == 0) {
            return (true);
        } else {
            return (false);
        }
    }

    boolean esLlena() {
        if (tope == (max)) {
            return (true);
        } else {
            return (false);
        }
    }

    int nroElem() {
        return (tope);
    }

    void adicionar(Artesanias elem) {
        if (!esLlena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena!!! ");
        }
    }

    Artesanias eliminar() {
        Artesanias elem = new Artesanias();
        if (!esVacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Artesanias de la Pila ");
            PilaA aux = new PilaA();
            while (!esVacia()) {
                Artesanias elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarA();
            }
            vaciar(aux);
        }
    }

    void llenar(int n) {
        for (int i = 1; i <= n; i++) {
            Artesanias z = new Artesanias();
            z.leerA();
            adicionar(z);
        }
    }

    void vaciar(PilaA a) {
        while (!a.esVacia()) {
            adicionar(a.eliminar());
        }
    }
}
