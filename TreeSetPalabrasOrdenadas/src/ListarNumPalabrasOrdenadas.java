import java.util.Iterator;
import java.util.TreeSet;

public class ListarNumPalabrasOrdenadas {

	public static void main(String[] args) {
		int num, conta;
		String palabra;
		TreeSet<String> listaPalabras = new TreeSet<String>();
		palabra=Leer.pedirCadena("nueva palabra (\"*\": fin)");
		while(!palabra.equals("*")){
			listaPalabras.add(palabra);
			palabra=Leer.pedirCadena("nueva palabra (\"*\": fin)");
		}
		do{
			num = Leer.pedirEntero("Cuantas palabras quieres ver de la lista (maximo " + listaPalabras.size() + ")");
		}while(num<0 || num > listaPalabras.size());

		Iterator<String> itr = listaPalabras.iterator();
		Leer.mostrarEnPantalla("\n\nLista de las " + listaPalabras.size() + " palabras");
		conta=0;
		while (itr.hasNext() && conta < num) {
			conta++;
			palabra=itr.next(); 
			System.out.print(palabra + " "); 
		}
	}// main

}//class
