import java.util.*;

public class MultiPilaArtesanias {
    private int np;
    private PilaA v[] = new PilaA[100];

    public MultiPilaArtesanias() {
        np = 0;
        for (int i = 0; i < 100; i++) { // for instancia pilas Vacias
            v[i] = new PilaA();
        }
    }

    int nroElem(int i) {
        return (v[i].nroElem());
    }

    boolean esVacia(int i) {
        return (v[i].esVacia());
    }

    boolean esLlena(int i) {
        return (v[i].esLlena());
    }

    void adicionar(int i, Artesanias elem) {
        if (!v[i].esLlena()) {
            v[i].adicionar(elem); // pila.add(Artesanias)
        } else {
            System.out.print("Pila " + "(" + i + ")" + " --> esta llena <--");
        }
    }

    Artesanias eliminar(int i) {
        Artesanias elem = new Artesanias();
        if (!v[i].esVacia()) {
            elem = v[i].eliminar();
        } else {
            System.out.print("Pila " + "(" + i + ")" + " --> esta vacia <--");
        }
        return elem;
    }

    // Llenar para unica pila especifica
    void llenar(int i, int n) {
        v[i].llenar(n);
    }

    // Llenar multiple Pila
    void llenar(int n) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int m;

        np = n;// 4
        for (i = 0; i < np; i++) {
            System.out.print("\nNro. elementos Pila " + "(" + i + ")" + " : ");
            m = teclado.nextInt(); // Modificar Segun el tipo de dato
            v[i].llenar(m);
        }
    }

    // Mostrar unica pila especifica
    void mostrar(int i) {
        v[i].mostrar();
    }

    // Mostrar multiple Pila
    void mostrar() {
        int i = 0;
        int k = 1;
        for (i = 0; i < np; i++) {
            System.out.println("\n\nDatos Pila " + "(" + k + ")" + " ");
            v[i].mostrar();
            k++;
        }
    }

    //
    void vaciar(int i, PilaA z) {
        v[i].vaciar(z);
    }

    void vaciar(int i, int j) {
        v[i].vaciar(v[j]);
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    /*
     * // Adiccionar Getters y Setters Semestre
     * void setSemestre(int i, String s) {
     * v[i].setSemestre(s);
     * }
     * 
     * String getSemestre(int i) {
     * return v[i].getSemestre();
     * }
     */
}
