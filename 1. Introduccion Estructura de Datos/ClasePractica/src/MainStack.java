import java.util.*;

public class MainStack {
    public static void main(String[] args){
        Stack<Tema> a = new Stack<Tema>();
        Tema t1 = new Tema(0, "repaso");
        Tema t2 = new Tema(1, "pila");
        Tema t3 = new Tema(2, "cola");
        Tema t4 = new Tema(3, "listas");
        Tema t5 = new Tema(4, "arboles");

        // Agregando
        a.push(t1);
        a.push(t2);
        a.push(t3);
        a.push(t4);
        a.push(t5);
        mostrarT(a);

        Stack<Practica> b = new Stack<Practica>();
        Practica p1 = new Practica("f1", "lucy", 1, 78);
        Practica p2 = new Practica("f1", "maria", 1, 90);
        Practica p3 = new Practica("f1", "juan", 1, 60);
        Practica p4 = new Practica("f1", "pedro", 1, 89);
        Practica p5 = new Practica("f2", "lucy", 2, 60);
        Practica p6 = new Practica("f3", "maria", 3, 80);
        Practica p7 = new Practica("f3", "juan", 3, 70);
        Practica p8 = new Practica("f4", "lucy", 4, 78);
        Practica p9 = new Practica("f4", "ana", 4, 80);

        // Agregar
        b.push(p1);
        b.push(p2);
        b.push(p3);
        b.push(p4);
        b.push(p5);
        b.push(p6);
        b.push(p7);
        b.push(p8);
        b.push(p9);
        mostrarP(b);

    }

    // Procedimiento mostrar Practica
    private static void mostrarP(Stack<Practica> b) {
        Stack<Practica> aux = new Stack<Practica>();

        while (!b.empty()) {
            Practica tx = b.pop();
            tx.mostrar();
            aux.push(tx);
        }
        vaciarP(b, aux);
    }

    // Procedimiento vaciar Practica
    private static void vaciarP(Stack<Practica> a, Stack<Practica> aux) {
        while (!aux.empty())
            a.push(aux.pop());
    }

    // Procedimiento MostrarTema
    private static void mostrarT(Stack<Tema> a) {
        Stack<Tema> aux = new Stack<Tema>();
        while (!a.empty()) {
            Tema tx = a.pop();
            tx.mostrar();
            aux.push(tx);
        }
        vaciar(a, aux);
    }

    // Procedimiento VaciarTema
    private static void vaciar(Stack<Tema> a, Stack<Tema> b) {
        while (!b.empty()) {
            a.push(b.pop());
        }

    }

}
