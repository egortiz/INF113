package Ejercicio2;
import java.util.*;

public class Medicos {
	private String nombre;
	private int edad;
	private String experiencia;
	private CCircularM cc = new CCircularM ();
	
	
	// Constructores por defecto
	public Medicos() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.experiencia = "";
		this.cc = new CCircularM ();
	}
	
	
	// Constructores con Parametros
	public Medicos(String nombre, int edad, String experiencia, CCircularM cc) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.experiencia = experiencia;
		this.cc = cc;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public CCircularM getCc() {
		return cc;
	}

	public void setCc(CCircularM cc) {
		this.cc = cc;
	}

	
	// To String
	@Override
	public String toString() {
		return "Medicos [nombre=" + nombre + ", edad=" + edad + ", experiencia=" + experiencia + "]";
	}
	
	// Metodo Leer Medico
    public void leerME() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("----------------> LEER-MEDICO <----------------" );
    	
    	System.out.print("Nombre                 ---> ");
    	this.nombre = teclado.nextLine();
    	
    	System.out.print("Edad                   ---> ");
    	this.edad = teclado.nextInt();
    	teclado.nextLine();
    	
    	System.out.print("Experiencia            ---> ");
    	this.experiencia = teclado.nextLine();	
    	
    	System.out.print("Cant. Medicamento(s)   ---> ");
		int y = teclado.nextInt();
		cc.llenar(y);
    }
    
    // Metodo Mostrar Medico
  	public void mostrarME() {
  		//System.out.println("********************************************************************************");
  		System.out.println(toString());
  		System.out.println("\n[CCircularM  (Medicamentos):]");
  	    cc.mostrar();
  	}	
}
