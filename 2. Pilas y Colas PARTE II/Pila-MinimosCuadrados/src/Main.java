import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CSimpleVariables cSV = new CSimpleVariables();
		PilaVariables pV = new PilaVariables();

		cSV.llenar(pV,2 );
		cSV.mostrar();
		
		calculoVariableD2(cSV, pV);
		calculoVarDxVarI(cSV, pV);
		
	}
/*
	private static void calculoVariableD2(CSimpleVariables cSV, PilaVariables pV) {
		double contador = 0;
		CSimpleVariables auxcsV = new CSimpleVariables();	
		PilaVariables auxPV = new PilaVariables();
		while(!cSV.esVacia()) {
			PilaVariables elemP = cSV.eliminar();
			while(!elemP.esVacia()) {
				Variable elemV = elemP.eliminar();
				if(cSV.nroElem()== 1) {
					double e = elemV.getVariable();
					e=(Math.pow(e,2));
					regresionLineal(e);
					contador = contador+e;
					System.out.println(elemP.getNombre()+"    \t"+"("+elemP.getNombre()+")^2");
					System.out.println("|"+elemV.getVariable()+"|"+"   "+"|"+e+"|");
				}
				auxPV.adicionar(elemV);	
			}
			
			elemP.vaciar(auxPV);
			auxcsV.adicionar(elemP);
		}
		cSV.vaciar(auxcsV);
		System.out.println("--------------------------------------------");
		System.out.println("∑ (Sumatoria)"+"\t  "+contador);
	}*/
	
	private static double calculoVariableD2(CSimpleVariables cSV, PilaVariables pV) {
		double a = 0;
		CSimpleVariables auxcsV = new CSimpleVariables();	
		PilaVariables auxPV = new PilaVariables();
		while(!cSV.esVacia()) {
			PilaVariables elemP = cSV.eliminar();
			while(!elemP.esVacia()) {
				Variable elemV = elemP.eliminar();
				if(cSV.nroElem()== 1) {
					double e = elemV.getVariable();
					e=(Math.pow(e,2));
					a = a+e;
					System.out.println(elemP.getNombre()+"    \t"+"("+elemP.getNombre()+")^2");
					System.out.println("|"+elemV.getVariable()+"|"+"   "+"|"+e+"|");
				}
				auxPV.adicionar(elemV);	
			}
			
			elemP.vaciar(auxPV);
			auxcsV.adicionar(elemP);
		}
		cSV.vaciar(auxcsV);
		System.out.println("--------------------------------------------");
		System.out.println("∑ (Sumatoria)"+"\t  "+a);
		return a;
	}
	private static double calculoVarDxVarI(CSimpleVariables cSV, PilaVariables pV) {
		double f = 0;
		CSimpleVariables auxcsV1 = new CSimpleVariables();	
		PilaVariables auxPV1 = new PilaVariables();
		
		CSimpleVariables auxcsV2 = new CSimpleVariables();	
		PilaVariables auxPV2 = new PilaVariables();
		
		
		
		while(!cSV.esVacia()) {
			PilaVariables elemP1 = cSV.eliminar();
			while(!elemP1.esVacia()) {
				Variable elemV1 = elemP1.eliminar();
				if(cSV.nroElem()== 1) {
					
					while(!cSV.esVacia()) {
						PilaVariables elemP2 = cSV.eliminar();
						while(!elemP2.esVacia()) {
							Variable elemV2 = elemP2.eliminar();
							if(cSV.nroElem()== 2) {
								if(elemP1.nroElem() == elemP2.nroElem()) {
									f = elemV1.getVariable()*elemV2.getVariable();
								}
							}
							elemP2.adicionar(elemV2);
						}
						elemP2.vaciar(auxPV2);
						auxcsV2.adicionar(elemP2);
					}
					cSV.vaciar(auxcsV2);
				}
			}	
					
					
					
					
					
					
				}
				auxPV1.adicionar(elemV1);	
			}
			
			elemP1.vaciar(auxPV1);
			auxcsV1.adicionar(elemP1);
		}
		cSV.vaciar(auxcsV1);
		System.out.println("--------------------------------------------");
		System.out.println("∑ (Sumatoria)"+"\t  "+a);
		return b;
	}
}
	
		

	private static void regresionLineal(double e) {
		
		
	}

}
