package selccionEspañola;
import java.util.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<SeleccionFutbol>integrantes= new ArrayList<SeleccionFutbol>();



		SeleccionFutbol Iniesta = new  Jugador("Andres","Iniesta",30,7777,11);
		SeleccionFutbol Casillas = new  Jugador("Iker","Casillas",32,7778,1);
		SeleccionFutbol Xavi = new  Jugador("Xavi","Hernandez",33,7779,12);
		SeleccionFutbol Xabi = new  Jugador("Xabi","Alonso",30,7780,5);
		SeleccionFutbol Capdevila = new  Jugador("Joan","Capdevilla",27,7781,2);
		SeleccionFutbol Ramos = new  Jugador("Sergio","Ramos",27,7781,4);
		SeleccionFutbol Delbosque = new  Entrenador("Vicente","delBosque",69,7779,777,"Rinoceronte");
		SeleccionFutbol Lopetegui = new  Entrenador("Julen","Lopetegui",67,7780,778,"Desmallitos");
		SeleccionFutbol Zidane = new  Entrenador("Zinedine","Zidane",80,770,779,"Frances");
		integrantes.add(Iniesta);
		integrantes.add(Casillas);
		integrantes.add(Xavi);
		integrantes.add(Xabi);
		integrantes.add(Capdevila);
		integrantes.add(Ramos);
		integrantes.add(Delbosque);
		integrantes.add(Lopetegui);
		integrantes.add(Zidane);


		mostrarEnPantalla(integrantes);


		/*Iniesta.entrenamiento();*/
		int opcion=0;
		opcion=Leer.pedirEntero("\n1 para añadir un futbolista\n2 para añadir un entrenador\n3 para borrar futbolista"
				+ "\n4 para borrar entrenador\n5 para mostrar\n6 mostrar jugadores"
				+ "\n7 listar entrenadores\n8 mostrar toda la lista ordenada por nombre y apellido");
		while (opcion != 0){
			switch (opcion) {
			case 1:
				añadirFutbolista(integrantes);
				break;
			case 2:
				añadirEntrenador(integrantes);
				break;
			case 3:
				borrarJugador(integrantes);
				break;
			case 4:
				borrarEntrenador(integrantes);
				break;
			case 5:
				mostrarEnPantalla(integrantes);
				break;
			case 6:
				listarjugadores(integrantes);
				break;
			case 7:
				listarEntrenadores(integrantes);
			case 8:
				
				listarTodo(integrantes);
				break;
			default:
				break;

			}
			

			opcion=Leer.pedirEntero("\n1 para añadir un futbolista\n2 para añadir un entrenador\n3 para borrar futbolista"
					+ "\n4 para borrar entrenador\n5 para mostrar\n6 mostrar jugadores"
					+ "\n7 listar entrenadores\n8 mostrar toda la lista ordenada por nombre y apellido");
		}

	}//end main

	private static void borrarEntrenador(ArrayList<SeleccionFutbol> integrantes) {
		Iterator<SeleccionFutbol> itr = integrantes.iterator();
		SeleccionFutbol Entrenadores;
		String nombreEntrenador=Leer.pedirCadena("dime el entrenador que quieres borrar");
		while(itr.hasNext()){
			Entrenadores=itr.next();
		
			if (Entrenadores.getNombre().equals(nombreEntrenador)){
			
				itr.remove();
				System.out.println(nombreEntrenador + "eliminado");
			}
		}
	}








	private static void borrarJugador(ArrayList<SeleccionFutbol> integrantes) {
		Iterator<SeleccionFutbol> itr = integrantes.iterator();
		SeleccionFutbol Jugadores;
		String nombreJugador=Leer.pedirCadena("dime el jugador que quieres borrar");
		while(itr.hasNext()){
			Jugadores=itr.next();
		
			if (Jugadores.getNombre().equals(nombreJugador)){
			
				itr.remove();
				System.out.println(nombreJugador + "eliminado");
			}
		}
	}


	
	



	private static void mostrarEnPantalla(ArrayList<SeleccionFutbol> integrantes) {
		for (SeleccionFutbol seleccionFutbol : integrantes) {
			System.out.println(seleccionFutbol);
		}
	}

	private static void añadirFutbolista(ArrayList<SeleccionFutbol> integrantes) {
		String nombre=Leer.pedirCadena("Introduzca nombre");
		String apellido=Leer.pedirCadena("Introduzca apellido");
		Integer edad=Leer.pedirEntero("introduzca el edad");
		Integer codigo= Leer.pedirEntero("introduzca el codigo");
		Integer dorsal= Leer.pedirEntero("introduzca el dorsal");
		SeleccionFutbol nuevo =new Jugador(nombre,apellido,edad,codigo,dorsal);
		integrantes.add(nuevo);
	}

	private static void añadirEntrenador(ArrayList<SeleccionFutbol> integrantes) {
		String nombre=Leer.pedirCadena("Introduzca nombre");
		String apellido=Leer.pedirCadena("Introduzca apellido");
		Integer edad=Leer.pedirEntero("introduzca el edad");
		Integer codigo= Leer.pedirEntero("introduzca el codigo");
		Integer licencia= Leer.pedirEntero("introduzca la licencia");
		String Alias = Leer.pedirCadena("introduzca el Alias");
		SeleccionFutbol nuevo =new Entrenador(nombre,apellido,edad,codigo,licencia,Alias);
		integrantes.add(nuevo);
	}
	private static void listarjugadores(List<SeleccionFutbol> integrantes) {
		//por estudios, curso, apellidos y nombre
		Jugador j;
		List<Jugador> arrayJugadores = new ArrayList<>();
		for (SeleccionFutbol persona : integrantes) {
			if (persona instanceof Jugador) {
				j = (Jugador) persona;
				arrayJugadores.add(j);
			}
		}
		Collections.sort(arrayJugadores, JugadorComparator);
		Leer.mostrarEnPantalla("\nLISTADO DE JUGADORES");
		Leer.mostrarEnPantalla("----------------------");
		for (Jugador jj : arrayJugadores) {
			Leer.mostrarEnPantalla(jj.getNombre() + " " + jj.getApellido());
		}
	}//listarEstudiantes

public static Comparator<Jugador> JugadorComparator = new Comparator<Jugador>() {
	
	public int compare(Jugador j1, Jugador j2) {
	
		String nombre1 = j1.getNombre().toUpperCase();
		String nombre2 = j2.getNombre().toUpperCase();
		//orden ascendente
		if(nombre1.equals(nombre2)){
			String ape1 = j1.getApellido().toUpperCase();
			String ape2 = j2.getApellido().toUpperCase();
		
			return ape1.compareTo(ape2);
		}
			else {
		return nombre1.compareTo(nombre2);
	}
	
		
	
	}

};


public static Comparator<Entrenador> EntrenadorComparator = new Comparator<Entrenador>() {
	//por categoria, apellidos y nombre
	public int compare(Entrenador e1, Entrenador e2) {
		int valor = 0;

		String nombre1 = e1.getNombre().toUpperCase();
		String nombre2 = e2.getNombre().toUpperCase();
		//orden ascendente
		if(nombre1.equals(nombre2)){
			String ape1 = e1.getApellido().toUpperCase();
			String ape2 = e2.getApellido().toUpperCase();
			if(ape1.equals(ape2)){
				String Alias1 = e1.getAlias().toUpperCase();
				String Alias2 = e2.getAlias().toUpperCase();
			return Alias1.compareTo(Alias2);
		}else {
		return ape1.compareTo(ape2);
		}
	}else{
		return nombre1.compareTo(nombre2);
	}
		
	
		}

};





public static Comparator<SeleccionFutbol> SeleccionFutbolComparator = new Comparator<SeleccionFutbol>() {
	//por categoria, apellidos y nombre
	public int compare(SeleccionFutbol s1, SeleccionFutbol s2){
		String nombre1 = s1.getNombre().toUpperCase();
		String nombre2 = s2.getNombre().toUpperCase();
		//orden ascendente
		if(nombre1.equals(nombre2)){
			String ape1 = s1.getApellido().toUpperCase();
			String ape2 = s2.getApellido().toUpperCase();
			
		return ape1.compareTo(ape2);
		}
	else{
		return nombre1.compareTo(nombre2);
	}
	
	
	
		
	
	}
};

private static void listarTodo(List<SeleccionFutbol> integrantes) {
	//por categoria, apellidos y nombre TrabajadorComparator


	Collections.sort(integrantes, SeleccionFutbolComparator);
	Leer.mostrarEnPantalla("\nLISTADO DE MIEMBROS");
	Leer.mostrarEnPantalla("-----------------------");
	for (SeleccionFutbol ee : integrantes) {
		Leer.mostrarEnPantalla( ee.getNombre() + " " + ee.getApellido() );
	}
}





private static void listarEntrenadores(List<SeleccionFutbol> integrantes) {
	//por categoria, apellidos y nombre TrabajadorComparator
	Entrenador e;
	List<Entrenador> arrayEntrenadores = new ArrayList<>();

	for (SeleccionFutbol persona : integrantes) {
		if (persona instanceof Entrenador) {
			e = (Entrenador) persona;
			arrayEntrenadores.add(e);
		}
	}

	Collections.sort(arrayEntrenadores, EntrenadorComparator);
	Leer.mostrarEnPantalla("\nLISTADO DE ENTRENADORES");
	Leer.mostrarEnPantalla("-----------------------");
	for (Entrenador ee : arrayEntrenadores) {
		Leer.mostrarEnPantalla( ee.getNombre() + " " + ee.getApellido() + " " + ee.getAlias() );
	}
}

}







