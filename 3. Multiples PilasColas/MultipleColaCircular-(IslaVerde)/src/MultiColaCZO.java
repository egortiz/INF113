import java.util.Scanner;

public class MultiColaCZO {
	private int nc;
	private CCircularZO v [] = new CCircularZO[100];
	
	public MultiColaCZO() {
		nc = 0;
		for(int i=1;i<=(v.length-1);i++) { // for instancia Colas Vacias
			v[i] = new CCircularZO();
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


	void adicionar (int i, Zona elem){
		if (!v[i].esLlena()) {
			v[i].adicionar (elem); //cola.add(Zona)
		}
		else {
			System.out.print ("CCircularZO"+"("+i+")"+" --> esta llena <--");
		}
	}

	Zona eliminar (int i){
		Zona elem = new Zona();
		if (!v[i].esVacia ()) {
			elem = v[i].eliminar ();
		}
		else {
			System.out.print ("CCircularZO "+"("+i+")"+" --> esta vacia <--");
		}
		return elem;
	}

	// Llenar para unica Cola especifica
	void llenar(int i, int n){
		v[i].llenar(n);
	}
	
	// Llenar MultiColaCZO
	void llenar (int n){
		Scanner teclado = new Scanner(System.in);
		nc = n ;
		
		
		for (int i=1;i<=nc; i++){
			System.out.print ("\nNro. elementos CCircularZO " +"("+i+")"+ " : ");
			int m = teclado.nextInt(); //Modificar Segun el tipo de dato
			v [i].llenar(m);
		}
	}

	// Mostrar unica pila especifica
	void mostrar(int i){
		System.out.print("\n\t---------- Zona "+i+" ----------");
		v[i].mostrar();
	}

	// Mostrar multiple Cola 
	void mostrar(){
		System.out.print("\t\t--------------------------");
		System.out.print("\t\t Zona de la Multiple Cola");
		System.out.print("\t\t--------------------------");
		int k=1;
		for (int i=1;i<=nc;i++){
			System.out.println ("\n\nColaCircularZO " +"("+k+")"+ " ");
			System.out.println("*****************************************************************************************************");
			v[i].mostrar();
			k++;
		}
	}
	
	// 
	void vaciar(int i, CCircularZO z){
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


