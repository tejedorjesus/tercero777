import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);

		//TreeMap<Integer,List> MapaAlumnos = new TreeMap<Integer,List>();
		TreeMap<Integer,ArrayList<Integer>> MapaNota = new TreeMap<Integer, ArrayList<Integer>>();
		TreeMap<String,ArrayList<Integer>> MapaNombre = new TreeMap<String, ArrayList<Integer>>();
		

		String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
		"German" };
		String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Bañez", "Franco",
				"Blanco", "Jimenez" };

		int[] Nota =new int[50];
		for (int i = 0; i < Nota.length; i++) {
			Nota[i]= (int) (Math.random() * (100 - 0) + 0);

		}
		Alumno[] unAlumno = null;
		unAlumno = new Alumno[50];
		for (int i = 0;i< 50; i++) {


			Random rand = new Random();
			unAlumno[i] = new Alumno(nombres[rand.nextInt(nombres.length)], apellidos[rand.nextInt(apellidos.length)],
					rand.nextInt(100));
		


		}

		String codigo="";
		float precio=0;
		int opcion=0;

		opcion=Leer.pedirEntero("Elija una opción:\n1.- Crear y visualizar automaticamente la base de datos de los alumnos\n2.- Mostrar los alumnos ordenados por nota "
				+ " \n0.- Salir");

		while(opcion!=0){



			switch (opcion) {
			case 1:
				for (int i = 0;i< 50; i++) {
					System.out.println(unAlumno[i]);

				}//end for
				


				break;
			case  2://genererando el mapa
				int indice;
				Integer NotaMapa;
				ArrayList<Integer> listaIndicesAlumnosDelNodo;
				for (indice = 0; indice < unAlumno.length; indice++) {
					NotaMapa=unAlumno[indice].getNota();
					if (MapaNota.containsKey(NotaMapa)==false){
						listaIndicesAlumnosDelNodo= new ArrayList<Integer>();
						listaIndicesAlumnosDelNodo.add(indice);
						MapaNota.put(NotaMapa,listaIndicesAlumnosDelNodo);
					}else{
						MapaNota.get(NotaMapa).add(indice);
					}
				}

				Iterator<Integer> itr =  MapaNota.keySet().iterator();//los alumnos saldran ordenados por la key(nota)
				while(itr.hasNext()){
					NotaMapa=(int)itr.next();
					listaIndicesAlumnosDelNodo=MapaNota.get(NotaMapa);
					Leer.mostrarEnPantalla("\nNota : " + NotaMapa );// se muestra la nota 
					for (Integer posiciones : listaIndicesAlumnosDelNodo) {
						Leer.mostrarEnPantalla("Posicion del Alumno en el nodo : "+(posiciones+1) + " , ");
						System.out.println(unAlumno[posiciones]);

					}
				}
				
			

				
				
				break;
			case  3:
				int indice2;
				String nombre;
				ArrayList<Integer> listaIndicesNombresDelNodo;
				for (indice2 = 0; indice2 < unAlumno.length; indice2++) {
					nombre=unAlumno[indice2].getNombre();
					if (MapaNombre.containsKey(nombre)==false){
						listaIndicesNombresDelNodo= new ArrayList<Integer>();
						listaIndicesNombresDelNodo.add(indice2);
						MapaNombre.put(nombre,listaIndicesNombresDelNodo);
					}else{
						MapaNombre.get(nombre).add(indice2);
					}
				}
				Iterator<String> itr2 =  MapaNombre.keySet().iterator();//los alumnos saldran ordenados por la key(nombre)
				while(itr2.hasNext()){
					nombre=itr2.next();
					listaIndicesNombresDelNodo=MapaNombre.get(nombre);
					Leer.mostrarEnPantalla("\nNombre : " + nombre );// se muestra el nombre 
					for (Integer posiciones : listaIndicesNombresDelNodo) {
						Leer.mostrarEnPantalla("Posicion del Alumno en el nodo : "+(posiciones+1) + " , ");
						System.out.println(unAlumno[posiciones]);
					}
				}
				
				List<Alumno> lista = new ArrayList<>();//Lista para guardar las personas
				// el fichero contiene varios objetos de clase Persona que leeremos
				// de uno en uno y los iremos añadiendo al objeto de clase List<Persona>
				File objetoFile = new File("fichero.dat");
				Fichero fichero;
				if (objetoFile.exists()){
					fichero = new Fichero("fichero.dat","I");//Apertura del fichero de entrada.donde leemos
					leeFichero(lista, fichero);
				}
				anadePersonas(lista);
				fichero = new Fichero("fichero.dat","O");//abrimos el fichero para escritura
				escribeFichero(lista, fichero);
			}

			private static void anadePersonas(List<Alumno> lista) {
				Alumno reg;
				String nombre;
				String apellido;
				int edad;
				nombre=Leer.pedirCadena("Nombre de la persona (* para finalizar) ");//leemos de teclado el nombre o el final
				while (!nombre.equals("*")) {
					apellido=Leer.pedirCadena("Apellido de la persona ");//leemos de teclado el apellido
					edad=Leer.pedirEntero("Edad de la persona ", "[0-9]{1,3}");//leemos de teclado la edad
					reg = new Alumno(nombre, apellido, edad);//se crea un objeto
					lista.add(reg);//se añade a la lista
					nombre=Leer.pedirCadena("Nombre de la persona (* para finalizar) ");//leemos de teclado el nombre o el final
				}
			}

			private static void escribeFichero(List<Alumno> lista, Fichero fichero) {
				for(Persona e:lista){//recorremos la lista y vamos escribiendo el contenido en el fichero
					fichero.escribir(e);
				}
				fichero.cerrar("O");//Cerramos el fichero de escritura	
			}

			private static void leeFichero(List<Persona> lista, Fichero fichero) {
				Persona reg;
				reg = fichero.leer();
				while (reg != null) {
					lista.add(reg);//lo añadimos a la lista
					Leer.mostrarEnPantalla("Nombre  : " + reg.getNombre());//imprimimos nombre
					Leer.mostrarEnPantalla("Apellido: " + reg.getApellido());//imprimimos apellido
					Leer.mostrarEnPantalla("Edad : " + reg.getEdad()+"\n");//imprimimos edad
					reg = fichero.leer();//leemos siguiente
				}
				fichero.cerrar("I");//cerrar fichero de lectura 
			}
				        

				
				
				
				break;

			default:

				break;

			}//end switch

			opcion=Leer.pedirEntero("Elija una opción: \n1.- Crear y visualizar automaticamente la base de datos de los alumnos\n2.- Mostrar los alumnos ordenados por nota "
					+ " \n0.- Salir");




		}//end while




	}//end main
}
