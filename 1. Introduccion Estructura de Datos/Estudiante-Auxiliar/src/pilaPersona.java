public class pilaPersona {
    private int max=100;
    private Persona v[]=new Persona[max+1];
    private int tope;
    
    pilaPersona()
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
    void adicionar (Persona elem)
    {
	if (!esLlena ())
	{
	    tope++;     //v[tope+1]=elem
	    v [tope] = elem;  //tope++
	}
	else
	    System.out.println ("Pila llena");
    }
    Persona eliminar ()
    {
	Persona elem = null;
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
	    System.out.println ("\n Persona de la Pila ");
	    pilaPersona aux = new pilaPersona ();
	    while (!esVacia ())
	    {
		Persona elem = eliminar ();
                elem.mostrarP();
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
            Persona mx=new Persona();
            mx.leerP();
	    adicionar (mx);
        }
    }
    
    // Vaciar
    void vaciar (pilaPersona a)
    {
	while (!a.esVacia ())
	    adicionar (a.eliminar ());
    }
}

