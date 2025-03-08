package Ejercicio03_CaracterRotarPila;
import java.util.*;
public class Caracter {
	private String caracter;
	
	//Constructor por defecto
	public Caracter() {
		super();
		this.caracter = "";
	}
	
	//Constructor con parametros
	public Caracter(String caracter) {
		super();
		this.caracter = caracter;
	}
	
	//Getters y Setters
	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
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
		System.out.print("Numero Entero    --->: ");
		this.caracter = teclado.next();
	}

	//Mostrar_Entero
	public void mostrarCaracter() {
		System.out.println(toString());
	}
}

	
	
	
	
	
	
	
	
	
	
	
	


