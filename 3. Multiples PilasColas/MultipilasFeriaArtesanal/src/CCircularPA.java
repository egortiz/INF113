import java.util.*;

public class CCircularPA {
	private int max = 100;
	private PilaA v[] = new PilaA[max + 1];;
	private int ini, fin;

	CCircularPA() {
		ini = 0;
		fin = 0;
	}

	int nroElem() {
		return ((max + fin - ini) % max);
	}

	boolean esVacia() {
		if (nroElem() == 0) {
			return (true);
		} else {
			return (false);
		}
	}

	boolean esLlena() {
		if (nroElem() == max) {
			return (true);
		} else {
			return (false);
		}
	}

	void adicionar(PilaA elem) {
		if (!esLlena()) {
			fin = (fin + 1) % max;
			v[fin] = elem;
		} else {
			System.out.println("--> Cola Circular llena <--");
		}
	}

	PilaA eliminar() {
		PilaA elem = new PilaA();
		if (!esVacia()) {
			ini = (ini + 1) % max;
			elem = v[ini];
			if (nroElem() == 0) {
				ini = fin = 0;
			}
		} else {
			System.out.println("--> Cola Circular Vacia <--");
		}
		return (elem);
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola vacia xxx");
		} else {
			System.out.println("\n---> Datos de la Cola Circular (PilaA) <---");
			System.out.println(
					"*****************************************************************************************************");
			CCircularPA aux = new CCircularPA();
			while (!esVacia()) {
				PilaA elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			System.out.println(
					"*****************************************************************************************************");
			vaciar(aux);
		}
	}

	void vaciar(CCircularPA a) {
		while (!a.esVacia()) {
			adicionar(a.eliminar());
		}
	}

	/*
	 * void llenar(int n) {
	 * System.out.println("Ingrese Dato(s) de la Cola");
	 * for (int i = 0; i < n; i++) {
	 * PilaA elem = new PilaA();
	 * elem.leer();
	 * adicionar(elem);
	 * }
	 * }
	 */
}
