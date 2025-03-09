
import java.util.*;

public class IntroduccionEstructuraDatos {
	public static void llenar(Stack a, int n) {
		for(int i=1;i<=n;i++) {
			a.push(Leer.dato());
		}
	}
	public static void vaciar(Stack a, Stack b) {
		while(!b.empty()) {
			a.push(b.pop());
		}
	}
	public static void main (String[]args) {
		Stack A = new Stack ();
		llenar(A,6);
		System.out.println(A);
	}
	
	

}
