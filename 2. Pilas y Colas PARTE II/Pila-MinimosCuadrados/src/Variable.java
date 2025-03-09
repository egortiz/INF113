import java.util.*;

public class Variable {
	private double variable;
	
	// Constructor por defecto
	public Variable() {
		this.variable = 0;
	}
	
	// Constructor con parametros
	public Variable(double variable) {
		super();
		this.variable = variable;
	}

	// Getters y Setters
	public double getVariable() {
		return variable;
	}

	public void setVariable(double variable) {
		this.variable = variable;
	}
	
	// Leer Variable
	public void leerV() {
		Scanner teclado = new Scanner(System.in);
		this.variable = teclado.nextDouble();
	}
	
	// Mostrar Variable
	public void mostrarV() {
		System.out.println(this.variable);
	}
}
