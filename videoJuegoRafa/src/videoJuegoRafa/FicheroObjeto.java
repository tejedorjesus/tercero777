package videoJuegoRafa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class FicheroObjeto {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public FicheroObjeto(String nombre, String io) {
		// fin=false;
		if (io.equals("I")) {// abrir el fichero para leer
			try {
				entrada = new ObjectInputStream(new FileInputStream(nombre));// asignar
																				// fichero
																				// a
																				// buffer
			} catch (IOException e) {// controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de entrada " + e.getMessage());
				System.exit(1);
			}
		}
		if (io.equals("O")) {// abrir el fichero para escribir
			try {
				salida = new ObjectOutputStream(new FileOutputStream(nombre));// asignar
																				// fichero
																				// a
																				// buffer
			} catch (IOException e) {// controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de salida " + e.getMessage());
				System.exit(1);
			}
		}
	}

	public Boolean escribir(LinkedList<Videojuego> lista) {
		try {
			if (lista != null) {// si el objeto existe lo escribimos
				salida.writeObject(lista);
			}
		} catch (IOException e) {// controlar el error de escritura
			Leer.mostrarEnPantalla("Error al leer en el archivo " + e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {// controlar el error de asignaci�n de
											// fichero
			return false;
		}
		return true;
	}

	public LinkedList<Videojuego> leer() {
		LinkedList<Videojuego> lista = new LinkedList<Videojuego>();
		try {
			lista = (LinkedList<Videojuego>) entrada.readObject();// leemos un
																	// registro
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			lista = null;
		} catch (NullPointerException e) {
			lista = null;
		} catch (IOException e) {
			// Leer.mostrarEnPantalla("Error al leer en el archivo
			// "+e.getMessage());
			lista = null;
		}
		return lista;
	}

	public Boolean escribir(List<Videojuego> juego) {
		try {
			if (juego != null) {// si el objeto existe lo escribimos
				salida.writeObject(juego);
			}
		} catch (IOException e) {
			Leer.mostrarEnPantalla("Error al leer en el archivo " + e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public void cerrar(String io) {
		try {
			if (io.equals("I")) {// cerrar el buffer de entrada
				entrada.close();
			}
			if (io.equals("O")) {// cerrar el buffer de salida
				salida.close();
			}
		} catch (IOException e) {// controlar la excepci�n
			Leer.mostrarEnPantalla("Error al cerrar el archivo " + e.getMessage());
			System.exit(1);
		}
	}
}

