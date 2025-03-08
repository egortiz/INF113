package Ejercicio01_EnteroPila;

import java.util.*;

public class Entero {
	private int numero;

	// Constructores por defecto
	public Entero() {
		this.numero = 0;
	}

	// Constructores con parmetros
	public Entero(int numero) {
		super();
		this.numero = numero;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// To String
	@Override
	public String toString() {
		return "Entero [numero=" + numero + "]";
	}

	// Leer_Entero
	public void leerEntero() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-ENTERO <-------------");
		System.out.print("Numero Entero    --->: ");
		this.numero = teclado.nextInt();
	}

	// Mostrar_Entero
	public void mostrarEntero() {
		System.out.println(toString());
	}
}
