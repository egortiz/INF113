package Ejercicio02_CaracterPila;
import java.util.*;

public class Caracter {
	private char caracter;
	
	
	//Constructor por defecto
	public Caracter() {
		this.caracter = ' ';
	}
	
	//Constructor con parametros
	public Caracter(char caracter) {
		super();
		this.caracter = caracter;
	}
	
	//Getters y Setters
	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	//To String
	@Override
	public String toString() {
		return "Caracter [caracter=" + caracter + "]";
	}
	
	//Leer_Caracter
	public void leerCaracter() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-CARACTER <-------------" );
		System.out.print("Caracter    --->: ");
		this.caracter = teclado.next().charAt(0);
	}

	//Mostrar_Entero
	public void mostrarCaracter() {
		System.out.println(toString());
	}
}
