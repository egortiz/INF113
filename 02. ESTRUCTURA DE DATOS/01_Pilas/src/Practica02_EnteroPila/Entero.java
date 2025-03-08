package Practica02_EnteroPila;
import java.util.*;

public class Entero {
	private int numero;
	
	//Constructor_por_defecto
	public Entero() {
		this.numero = 0;
	}
	
	//Constructor _con_parametros
	public Entero(int numero) {
		super();
		this.numero = numero;
	}
	
	
	//Getters_y_setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//To string
	@Override
	public String toString() {
		return "entero [numero=" + numero + "]";
	}
	
	//Leer_Entero
	public void leerEntero() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------> LEER-ENTERO <-------------" );
		System.out.print("Numero Entero    --->: ");
		this.numero = teclado.nextInt();
	}
	
	//Mostrar_Entero
	public void mostrarEntero() {
		System.out.println(toString());
	}
}
