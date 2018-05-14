/*Listar los números que diga el usuario en orden creciente y sin repeticiones*/

import java.util.*;

public class ListarNumerosEnOrden {

	public static void main(String[] args) {
		int num;
		String texto;
		TreeSet<Integer> conjuntoValoresDistintos = new TreeSet<Integer>();
		num=Leer.pedirEntero("¿Numero? (-9999:fin)");
		while(num!=-9999){
			conjuntoValoresDistintos.add(num);
			num=Leer.pedirEntero("¿Numero? (-9999:fin)");		
		}

		System.out.println();
		// lo recorremos con un bucle for mejorado 
		for (Integer dato:conjuntoValoresDistintos) 
		{
			System.out.print(dato + ", ");
		}
		System.out.println();

		texto=conjuntoValoresDistintos.toString();
		System.out.println(texto);
	}// main

}//class
