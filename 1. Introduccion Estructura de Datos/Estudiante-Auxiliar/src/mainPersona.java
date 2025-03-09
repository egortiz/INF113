import java.util.Scanner;
public class mainPersona {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		pilaPersona pp1 = new pilaPersona();
		pp1.adicionar(new Persona("Eddy",19,3469141));
		pp1.adicionar(new Persona("German",20,44691416));
		pp1.adicionar(new Persona("Juan",19,46914156));
		pp1.adicionar(new Persona("Pablo",30,846914156));
		pp1.adicionar(new Persona("Eddy",19,3469141));
		pp1.mostrar();
		
		pilaInforme pi1 = new pilaInforme();
		pi1.adicionar(new Informe(3469141,19942));
		pi1.adicionar(new Informe(44691416,20212));
		pi1.adicionar(new Informe(46914156,19993));
		pi1.adicionar(new Informe(846914156,25698));
		pi1.adicionar(new Informe(3469141,20031));
		pi1.mostrar();
	
		// Buscar Cedula de Identidad
		System.out.println("..................................................................." );
		System.out.print("Buscar Cedula Identidad: ");
		int x = teclado.nextInt();
		buscar(pi1,x);
		
		
		// Mostrar los datos del estudiante con ci x
		System.out.println("..................................................................." );
		mostrarInforme(pp1,pi1,x);
		
	
	}
	// Procedimiento mostrar Datos del estudiante
	public static void mostrarInforme(pilaPersona PP, pilaInforme PI, int x) {
		pilaPersona aux1 = new pilaPersona();
		pilaInforme aux2 = new pilaInforme();
		boolean sw = true;
		
		while(!PP.esVacia()) {
			Persona p = PP.eliminar();
			aux1.adicionar(p);
			if(p.getCi()== x) {
				System.out.println("Nombre           : "+p.getNombre()+"\n"+"Cedula Identidad : "+p.getCi()+"\n"+"Edad             : "+p.getEdad());
				while(!PI.esVacia()) {
					Informe i = PI.eliminar();
					aux2.adicionar(i);
					if(i.getCi()== x) {
						sw=false;
						System.out.println(i.getCi()+"  "+i.getNroDoc());
					}
				}
				PI.vaciar(aux2);
			}
		}
		PP.vaciar(aux1);
		if(sw) {
			System.out.println("No presento ningun informe!!!");	
			}
	}
		
	// Procedimeinto Buscar
	public static void buscar(pilaInforme PI1, int X) {
		int contador = 0;
		pilaInforme aux = new pilaInforme();
		
		while(!PI1.esVacia()) {
			Informe w = PI1.eliminar();
			aux.adicionar(w);
			if(w.getCi()== X) {
				contador ++;
			}
		}
		if(contador>0) {
			System.out.println("C.I.               : "+X+"\n"+"Cantidad Informe(s): "+contador);
		}
		else {
			System.out.println("No presento ningun informe!!!");
		}
		PI1.vaciar(aux);
	}
}

