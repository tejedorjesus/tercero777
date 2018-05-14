import java.util.*;
public class SetStringOrdenInverso {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>( new ComparadorDeStrings() );
		Iterator<String> itr;
		int veces, k;
		String [] vecPalabras = {"aleatorio", "zanahoria", "letra", "frio", "calor", "zapato",
								 "bajo", "dibujo", "grande", "pequeño", "montaña", "este"};
		String palabra="";
		
		veces=(int) Math.floor(Math.random()*15 + 1);
		System.out.println("Se van a generar " +  veces + " datos.");
		System.out.println("Insertando: ");
		for(k=1; k <= veces; k++){
			palabra = vecPalabras[(int)Math.floor(Math.random()*vecPalabras.length)];
			System.out.print(palabra + " * ");
			ts.add(palabra);
		}
		
		itr = ts.iterator();
		System.out.println("\n\nValores de ts (orden alfabético inverso): ");
		while (itr.hasNext()) { 
			palabra=itr.next(); 
			System.out.print(palabra + " "); 
		}
	}// main

}// class
