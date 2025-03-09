package Ejercicio2;
import java.util.*;

public class Especialidades {
	private String especialidad;
	private MultiColaPA m = new MultiColaPA(); 
	private PilaME p = new PilaME ();
	
	// Constructor por defecto
	public Especialidades() {
		super();
		this.especialidad = "";
		this.m = new MultiColaPA();
		this.p = new PilaME ();
	}
	
	
	// Constructor con Parametros
	public Especialidades(String especialidad, MultiColaPA m, PilaME p) {
		super();
		this.especialidad = especialidad;
		this.m = m;
		this.p = p;
	}

	public Especialidades(String especialidad) {
		super();
		this.especialidad = especialidad;
	}
	
	// Getters y Setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public MultiColaPA getM() {
		return m;
	}

	public void setM(MultiColaPA m) {
		this.m = m;
	}

	public PilaME getP() {
		return p;
	}

	public void setP(PilaME p) {
		this.p = p;
	}

	// To String
	@Override
	public String toString() {
		return "Especialidades [especialidad=" + especialidad + "]";
	}
	
	
	// Metodo Leer Especialidad
    public void leerE() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("-------------> LEER-ESPECIALIDAD <-------------" );
    	
    	System.out.print("Especialidad           ---> ");
    	this.especialidad = teclado.nextLine();
    	
    	System.out.print("Cant. Pacientes        ---> ");
		int n = teclado.nextInt();
		m.llenar(n);
		
		System.out.print("Cant. Medico(s)        ---> ");
		int x = teclado.nextInt();
		p.llenar(x);
			
    }
   
    // Metodo Mostrar Especialidad
  	public void mostrarE() {
  		//System.out.println("********************************************************************************");
  		System.out.println(toString());
  		System.out.println("\n[MultiCola (Pacientes):]");
  		m.mostrar();
  		
  		System.out.println("\n[PilaME  (Medicos):]");
  		p.mostrar();
  		
  	}	
}
