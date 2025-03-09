import java.util.*;
public class PilaE {
	private int max=100;
    private Estudiante v[]=new Estudiante[max+1];
    private int tope;
	
    PilaE(){
    	tope=0;
    }
    
    boolean esvacia (){
    	if (tope == 0) {
    		return (true);
    	}
        return (false);
    }
    
    boolean esllena (){
    	if (tope == max) {
            return (true);
    	}
        return (false);
    }
    
    int nroelem (){
        return (tope);
    }
    
    void adicionar (Estudiante elem){
    	if (!esllena ()){
    		tope++;
            v [tope] = elem;
        }
        else {
            System.out.println ("Pila llena");
        }
    }
    
    Estudiante eliminar (){
        Estudiante elem = null;
        if (!esvacia ()){
            elem = v [tope];
            tope--;
        }
        else {
        	System.out.println ("Pila vacia");
        	}
        return (elem);
        }
    
    void mostrar (){
        Estudiante elem;
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaE aux = new PilaE ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrarE();;
            }
            while (!aux.esvacia ())
            {
                elem = aux.eliminar ();

                adicionar (elem);
            }
        }
    }
}
