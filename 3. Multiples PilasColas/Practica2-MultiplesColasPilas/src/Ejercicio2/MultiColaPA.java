package Ejercicio2;
import java.util.Scanner;

public class MultiColaPA {
	private int nc;
	private CSimplePA v [] = new CSimplePA[100];
	
	public MultiColaPA() {
		nc = 0;
		for(int i=1;i<=(v.length-1);i++) { // for instancia Colas Vacias
			v[i] = new CSimplePA();
		}
	}
	
	// Getters y Setters
	public int getNc() {
		return nc;
	}

	public void setNc(int nc) {
		this.nc = nc;
	}
	
	
	int nroElem(int i){
		return (v[i].nroElem());
	}
	
	boolean esVacia (int i){
		return (v[i].esVacia ());
	}

	boolean esLlena (int i){
		return  (v[i].esLlena ());
	}


	void adicionar (int i, CSimplePA elem){
		if (!v[i].esLlena()) {
			Pacientes elemP = new Pacientes();
			v[i].adicionar(elemP); //cola.add(Pacientes)
		}
		else {
			System.out.print ("CSimplePA"+"("+i+")"+" --> esta llena <--");
		}
	}

	Pacientes eliminar (int i){
		Pacientes elem = new Pacientes();
		if (!v[i].esVacia ()) {
			elem = v[i].eliminar ();
		}
		else {
			System.out.print ("CSimplePA "+"("+i+")"+" --> esta vacia <--");
		}
		return elem;
	}

	// Llenar para unica Cola especifica
	void llenar(int i, int n){
		v[i].llenar(n);
	}
	
	// Llenar MultiColaPA
	void llenar (int n){
		Scanner teclado = new Scanner(System.in);
		nc = n ;
		for (int i=1;i<=nc; i++){
			System.out.print ("\nNro. elementos CSimplePA " +"("+i+")"+ " : ");
			int m = teclado.nextInt(); //Modificar Segun el tipo de dato
			v [i].llenar(m);
		}
	}

	// Mostrar unica pila especifica
	void mostrar(int i){
		System.out.print("\n\t---------- Pacientes "+i+" ----------");
		v[i].mostrar();
	}

	// Mostrar multiple Cola 
	void mostrar(){
		System.out.print("\t\t--------------------------");
		System.out.print("\t\t Pacientes de la Multiple Cola");
		System.out.print("\t\t--------------------------");
		int k=1;
		for (int i=1;i<=nc;i++){
			System.out.println ("\n\n ColaSimplesPA " +"("+k+")"+ " ");
			System.out.println("*****************************************************************************************************");
			v[i].mostrar();
			k++;
		}
	}
	
	// 
	void vaciar(int i, CSimplePA z){
		v[i].vaciar(z);
	}
	
	void vaciar (int i, int j){
		v[i].vaciar(v[j]);
	}
	
	
	/*
	// Adiccionar Getters y Setters Semestre
	void setSemestre(int i, String s) {
		v[i].setSemestre(s);
	}
	
	String getSemestre(int i) {
		return v[i].getSemestre();
	}
	*/
}


