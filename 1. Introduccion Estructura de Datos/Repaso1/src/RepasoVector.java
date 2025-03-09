
public class RepasoVector {

	public static void main(String[] args) {
		// Vectores = v[]

		int v[] = new int [10];
		int n = 5;
		for(int i=0;i<n;i++) {
			v[i]=i+10;
		}
		
		// Mostrar vectores
		//for(int i=0;i<v.lenght;i++) 
		for(int i=0;i<n;i++) {
			System.out.print(v[i]+" ");
		}
		
		// Verificar si existe el numero 12
		if (existeNum (v,n,12)) {
			System.out.println("Existe");
			}
		else {
			System.out.println("No Existe");
		}
		
		// Adicionar al principio del vector los numeros 7 y 10 respectivamente
		adicionarPrin(v,n);
		for(int i=0;i<n+2;i++) {
			System.out.print(v[i]+" ");
		}
		
		
	}
	// Procedimiento aumentar
	public static void adicionarPrin(int[] v, int n) {
		int aux[]= new int [10];
		aux[0]=7;
		aux[1]=10;
		for(int i=0;i<n+2;i++) {
			aux[i+2]= v[i];
		}
		for(int i=0;i<n+2;i++) {
			v[i]= aux[i];
		}
	}
	// Funcion verificar
	public static boolean existeNum(int[] v, int n, int x) {
		for(int i=0;i<n;i++) {
			if(v[i]== x) {
				return true;
			}
		}
		return false;
	}
	

}
