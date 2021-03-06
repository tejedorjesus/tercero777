import java.util.*;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> mapaContrasenias = new TreeMap<String, String>();

		String usuarioAdministrador;
		String contraseniaAdministrador;

		usuarioAdministrador = Leer.pedirCadena("Crear un usuario administrador");
		contraseniaAdministrador = Leer.pedirCadena("Introduza la contraseña:", "[a-zA-Z0-9]{6}");
		Leer.mostrarEnPantalla("Tu contrasenia y tu usuario son:" + "\n Usuario:" + usuarioAdministrador
				+ "\n Contrasenia:" + contraseniaAdministrador);

		mapaContrasenias.put(usuarioAdministrador, codificarContrasenia(contraseniaAdministrador));

		usuarioAdministrador = Leer.pedirCadena("Introduczca el usuario administrador:");

		if (mapaContrasenias.containsKey(usuarioAdministrador)) {
			String contraseniaCorrecta;
			contraseniaCorrecta = mapaContrasenias.get(usuarioAdministrador);

			do {
				contraseniaAdministrador = Leer.pedirCadena("Introduza la contraseña:", "[a-zA-Z0-9]{6}");
			} while (!codificarContrasenia(contraseniaAdministrador).equals(contraseniaCorrecta));

			Leer.mostrarEnPantalla("Contraseña correcta");

			int opcion = menuAdministrador();// opcion de menu
			while (opcion != 0) {// menu
				switch (opcion) {// acciones menu
				case 1:
					insertarUsuarioClave(mapaContrasenias);
					break;
				case 2:
					borrar(mapaContrasenias,usuarioAdministrador);
				default:
					break;
				}
				opcion = menuAdministrador();
			} // while menu
		} // if mapaContraseñas

		else {
			Leer.mostrarEnPantalla("El usuario Introducido no existe o no corresponde con el Administrador");
		}

		int opcion = menuUsuarioNormal();// opcion de menu
		while (opcion != 0) {// menu
			switch (opcion) {// acciones menu
			case 1:
				modificarClaves(mapaContrasenias);
			default:
				break;
			}
			opcion = menuUsuarioNormal();
		} // while Usuario Normal

	}// main

	public static String codificarContrasenia(String contraseniaAdministrador) {

		int indice;
		int ASCII;
		char letra;
		String contraseniaCodificada = "";

		for (indice = 0; indice < contraseniaAdministrador.length(); indice++) {
			ASCII = contraseniaAdministrador.codePointAt(indice) + 2;
			letra = (char) ASCII;
			contraseniaCodificada = contraseniaCodificada + letra;
		} // for
		return contraseniaCodificada;
	}// codificarContraseña

	public static void insertarUsuarioClave(TreeMap<String, String> mapaContrasenias) {

		String usuario;
		String contrasenia;

		usuario = Leer.pedirCadena("Crear un usuario");
		contrasenia = Leer.pedirCadena("Introduza la contrasenia:", "[a-zA-Z0-9]{6}");
		Leer.mostrarEnPantalla(
				"Tu contrasenia y tu usuario son:" + "\n Usuario:" + usuario + "\n Contrasenia:" + contrasenia);
		mapaContrasenias.put(usuario, codificarContrasenia(contrasenia));

	}// insertarUsuarioClave

	public static void borrar(TreeMap<String, String> mapaContrasenias, String usuarioAdministrador) {

		String usuarioBorrar;
		// Muestra los usuarios
		for (Map.Entry<String, String> nodo : mapaContrasenias.entrySet()) {
			System.out.print("Usuarios:" + nodo.getKey());
			if (nodo.getKey().equals(usuarioAdministrador)) {
				System.out.print("\t(Administrador)");
			}
			System.out.println();
		}
		usuarioBorrar = Leer.pedirCadena("Introduce el nombre del usuario que quieres borrar");
		if (usuarioBorrar.equals(usuarioAdministrador)) {
			Leer.mostrarEnPantalla("Me guardo un disco duro en el armario");
		}

		else {
			if (mapaContrasenias.containsKey(usuarioBorrar)) {
				mapaContrasenias.remove(usuarioBorrar);
				System.out.println("Se ha borrado este usuario:" + usuarioBorrar);
			} // if
			
			else{
				System.out.println("Usuario a borrar no existe");
			}
		} // else
	}

	public static void modificarClaves(TreeMap<String, String> mapaContrasenias) {
		
		String usuarioModificar;
		String nuevaContrasenia;
		// Muestra los usuarios
		
		for (String nombresUsuarios : mapaContrasenias.keySet()) {
			System.out.print("Usuarios:" + nombresUsuarios);
		}//for
	
		usuarioModificar=Leer.pedirCadena("A que usuario quieres cambiar la contrasenia");
		
		if(mapaContrasenias.containsKey(usuarioModificar)){
			
			nuevaContrasenia=Leer.pedirCadena("Nueva Contrasenia");
			mapaContrasenias.put(usuarioModificar, nuevaContrasenia);

		}
		
		
	}//modificar Claves

	public static int menuAdministrador() {
		int opcion;
		Leer.mostrarEnPantalla("1.- Insertar usuario/clave");
		Leer.mostrarEnPantalla("2.- Borrar Usuarios");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion = Leer.pedirEntero("¿Que opcion deseas?");
		return opcion;
	}// menuAdministrador

	public static int menuUsuarioNormal() {
		int opcion;
		Leer.mostrarEnPantalla("1.- Modificar claves usuario");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion = Leer.pedirEntero("¿Que opcion deseas?");
		return opcion;
	}// menuUsuarioNormal

}// class
