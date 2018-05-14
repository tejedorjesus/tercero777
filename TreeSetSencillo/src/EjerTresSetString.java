import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class EjerTresSetString {

	public static void main(String[] args) {
		
		int veces, k;
		String [] vecPalabras = {"aleatorio", "zanahoria", "letra", "frio", "calor", "zapato",
								 "bajo", "dibujo", "grande", "pequeño", "montaña", "este"};
		String palabra="";
		
		Set<String> objHashSet = new HashSet<String>();
		Set<String> objLinkHashSet = new LinkedHashSet<String>();
		Set<String> objTreeSet = new TreeSet<String>();
		
		veces=(int) Math.floor(Math.random()*15 + 1);
		Leer.mostrarEnPantalla("Se van a generar " +  veces + " datos.");
		Leer.mostrarEnPantalla("Insertando: ");
		for(k=1; k <= veces; k++){
			palabra = vecPalabras[(int)Math.floor(Math.random()*vecPalabras.length)];
			System.out.print(palabra + " * ");
			objHashSet.add(palabra);
			objLinkHashSet.add(palabra);
			objTreeSet.add(palabra);
		}
	
		Iterator<String> itr = objHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de objHashSet (no hay orden): ");
		while (itr.hasNext()) { 
			palabra=itr.next(); 
			System.out.print(palabra + " "); 
		}
		
		itr = objLinkHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de objLinkHashSet (por orden de inserción): ");
		while (itr.hasNext()) { 
			palabra=itr.next(); 
			System.out.print(palabra + " "); 
		}
	
		itr = objTreeSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de objTreeSet (orden alfabético): ");
		while (itr.hasNext()) { 
			palabra=itr.next(); 
			System.out.print(palabra + " "); 
		}
		
		Leer.mostrarEnPantalla("\n");
		Leer.mostrarEnPantalla("Valores de objHashSet: " + objHashSet.toString());
		Leer.mostrarEnPantalla("Valores de objLinkHashSet: " + objLinkHashSet.toString());
		Leer.mostrarEnPantalla("Valores de objTreeSet: " + objTreeSet.toString());
		
	}// main

} // class
