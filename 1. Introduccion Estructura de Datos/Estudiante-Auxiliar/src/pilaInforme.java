import java.util.*;
public class pilaInforme {
    private int max=100;
    private Informe v[]=new Informe[max+1];
    private int tope;
    
    pilaInforme()
    {
        tope=0;
    }
   
    // Verifica Es Vacia
    boolean esVacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    
    // Verifica Es LLena
    boolean esLlena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    
    int nroElem ()
    {
	return (tope);
    }
    
    // Adicionar
    void adicionar (Informe elem)
    {
	if (!esLlena ())
	{
	    tope++;     //v[tope+1]=elem
	    v [tope] = elem;  //tope++
	}
	else
	    System.out.println ("Pila llena");
    }
    Informe eliminar ()
    {
	Informe elem = null;
	if (!esVacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    
    // Mostrar
    void mostrar ()
    {
	if (esVacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Informes de la Pila ");
	    pilaInforme aux = new pilaInforme ();
	    while (!esVacia ())
	    {
		Informe elem = eliminar ();
                elem.mostrarI();
		aux.adicionar (elem);
	    }
	    vaciar(aux);
	}
   }
    // Llenar
    void llenar (int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            Informe mx=new Informe();
            mx.leerI();
	    adicionar (mx);
        }
    }
    
    // Vaciar
    void vaciar (pilaInforme a)
    {
	while (!a.esVacia ())
	    adicionar (a.eliminar ());
    }
}
