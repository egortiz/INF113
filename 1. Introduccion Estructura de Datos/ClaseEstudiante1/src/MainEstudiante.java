import java.util.*;
public class MainEstudiante {

	public static void main(String[] args) {
		Stack<Integer> A = new Stack <Integer>();
		A.add(1);
		A.addElement(2);
		A.push(3);
		System.out.println(A);
		
		Vector <Estudiante> v = new Vector<Estudiante>();
		Estudiante e1 = new Estudiante ("Pepito",3469141,"98");
		Estudiante e2 = new Estudiante ("Pepita",5469141,"99");
		Estudiante e3 = new Estudiante ("Pepo",7469141,"100");
		Estudiante e4 = new Estudiante ("Pepi",8969141,"65");
		Estudiante e5 = new Estudiante ("Po",13469141,"45");
		
		// Adicionar elementos
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		v.add(e5);
		
		// Mostrar Elementos
		System.out.println(v);
		
		// Verificar si existe el Estudiante Po
		verificarEst(v,"Po");
		
		if(v.contains(e5)) {
			System.out.println("Existe !!!");	
		}
		else {
			System.out.println("No Existe !!!");
		}
		
	}
	// Procedimiento Verificar estudiante
	public static void verificarEst(Vector<Estudiante> v, String x) {
		boolean sw = false;
		for(int i=0;i<v.size();i++) {
			Estudiante e = new Estudiante();
			e = v.get(i);
			if(e.getNombre().equalsIgnoreCase(x)) {
				sw = true;
			}
		}
		if(sw) {
			System.out.println("Existe !!!");
		}
		else {
			System.out.println("No Existe !!!");
		}
		
	}

}
