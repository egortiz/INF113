package Ejercicio2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PilaES pE = new PilaES();
		MultiColaPA m = new MultiColaPA();
		
		pE.llenar(2);
		pE.mostrar();
		
		// a) Se desea dar prioridad a los adultos mayores en la especialidad de Neumologia, para lo cual se abre un nuevo 
		// consultorio y se pide mover a los adultos mayores (edad>65) al nuevo consultorio ademas de agregar un nuevo medico a la pila
		System.out.println("\n.......................................... SOLUCION A ...............................................");
		String x = "Neumologia";
		int edad = 65;
		solA(pE, m, x, edad);
		pE.mostrar();
		System.out.println(".....................................................................................................");
	
		
		
		
		
		
		
		
		
		
	}
	
	// Cargar
	public static void cargarColasPilas(PilaES pE ) {
		/*
		Pacientes pa1 = new Pacientes("Gonzalo","Ciatica",24);
		Pacientes pa2 = new Pacientes("Juan","Asma",22);
		Pacientes pa3 = new Pacientes("Pedro","Gastritis",65);
		Pacientes pa4 = new Pacientes("Milenka","Ciatica",24);
		Pacientes pa5 = new Pacientes("Rufina","Varices",65);
		Pacientes pa6 = new Pacientes("Carlos","Resfrio",14);
		Pacientes pa7 = new Pacientes("Yazid","Tos",12);
		Pacientes pa8 = new Pacientes("Zinedine","Esguince",65);
		Pacientes pa9 = new Pacientes("Matilde","Varicela",24);
		Pacientes pa10 = new Pacientes("Javier","Covid",24);
		
		Medicamentos m1 = new Medicamentos("Paracetamol","Vita",1500);
		Medicamentos m2 = new Medicamentos("Ibuprofeno","Alcos",2500);
		Medicamentos m3 = new Medicamentos("Amoxixilina","Inti",3500);
		Medicamentos m4 = new Medicamentos("Complejo B","Inti",5500);
		Medicamentos m5 = new Medicamentos("Vitamina A","Delta",1450);
		Medicamentos m6 = new Medicamentos("Vardcetin","Vita",240);
		Medicamentos m7 = new Medicamentos("Vitamina C","Hannover",450);
		Medicamentos m8 = new Medicamentos("Aspirina","Albus",150);
		Medicamentos m9 = new Medicamentos("Aspirineta","Delta",155);
		Medicamentos m10 = new Medicamentos("Amoxilina","Albus",154);
		Medicamentos m11 = new Medicamentos("Antigripal","Albus",55);
		
		
		
		CCircularM cCM1 = new CCircularM();
		cCM1.adicionar(m1);
		cCM1.adicionar(m2);
		
		CCircularM cCM2 = new CCircularM();
		cCM2.adicionar(m3);
		cCM2.adicionar(m4);
		cCM2.adicionar(m5);
		
		CCircularM cCM3 = new CCircularM();
		cCM3.adicionar(m6);
		
		CCircularM cCM4 = new CCircularM();
		cCM4.adicionar(m7);
		cCM4.adicionar(m8);
		
		CCircularM cCM5 = new CCircularM();
		cCM5.adicionar(m9);
		
		CCircularM cCM6 = new CCircularM();
		cCM6.adicionar(m9);
		
		CCircularM cCM7 = new CCircularM();
		cCM7.adicionar(m10);
		
		CCircularM cCM8 = new CCircularM();
		cCM7.adicionar(m11);
		
		
	
		Medicos me1 = new Medicos("Jorge",45,"Alta",cCM1);
		Medicos me2 = new Medicos("Gerardo",34,"Media",cCM2);
		Medicos me3 = new Medicos("Marco",29,"Baja",cCM3);
		Medicos me4 = new Medicos("Franco",55,"Alta",cCM4);
		Medicos me5 = new Medicos("Celestino",45,"Alta",cCM4);
		Medicos me6 = new Medicos("Fabio",33,"Media",cCM4);
		Medicos me7 = new Medicos("Michel",24,"Baja",cCM4);
		Medicos me8 = new Medicos("Angela",21,"Baja",cCM4);
	
		
		PilaME pM1 = new PilaME();
		pM1.adicionar(me1);
		pM1.adicionar(me2);
		
		PilaME pM2 = new PilaME();
		pM2.adicionar(me2);
		pM2.adicionar(me3);
		
		PilaME pM3 = new PilaME();
		pM3.adicionar(me4);
		pM3.adicionar(me5);
		
		PilaME pM4 = new PilaME();
		pM4.adicionar(me6);
		pM4.adicionar(me7);
		
		
		
		MultiColaPA mu = new MultiColaPA();
		mu.setNc(4);
		
		CSimplePA csP1 = new CSimplePA();
		csP1.adicionar(pa1);
		csP1.adicionar(pa2);
		
		CSimplePA csP2 = new CSimplePA();
		csP2.adicionar(pa3);
		csP2.adicionar(pa4);
		csP2.adicionar(pa5);
	
		CSimplePA csP3 = new CSimplePA();
		csP3.adicionar(pa6);
		csP3.adicionar(pa7);
		csP3.adicionar(pa8);
		csP3.adicionar(pa9);
		
		CSimplePA csP4 = new CSimplePA();
		csP4.adicionar(pa10);
		
	
		mu.adicionar(1, csP1);
		mu.adicionar(2, csP2);
		mu.adicionar(3, csP3);
		mu.adicionar(4, csP4);
		
	
		
		PilaES piE1 = new PilaES();
		piE1.a
		PilaES piE2 = new PilaES();
		PilaES piE3 = new PilaES();
		PilaES piE4 = new PilaES();
		
		*/
	}
	// SOLUCION B
	public static void solA(PilaES PE,MultiColaPA MU, String X, int E) {
		PilaES auxPE = new PilaES();
		while (!PE.esVacia()) {
			Especialidades elemE = PE.eliminar();
			if(elemE.getEspecialidad().equalsIgnoreCase(X)) {
				int nc = MU.getNc();
				for(int i=1;i<=nc;i++) {
					
					}
					}
				
				
			}
				
			
			
			
		}
		
		
	}

}
