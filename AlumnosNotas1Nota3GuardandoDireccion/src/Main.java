import java.util.*;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);

		//TreeMap<Integer,List> MapaAlumnos = new TreeMap<Integer,List>();
		TreeMap<Integer,ArrayList<Alumno>> MapaNota = new TreeMap<Integer, ArrayList<Alumno>>();
		TreeMap<String,ArrayList<Alumno>> MapaNombre = new TreeMap<String, ArrayList<Alumno>>();
		

		String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
		"German" };
		String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Ba�ez", "Franco",
				"Blanco", "Jimenez" };

		
		Alumno[] vecAlumnos = null;
		vecAlumnos = new Alumno[50];
		for (int i = 0;i< 50; i++) {


			Random rand = new Random();
			vecAlumnos[i] = new Alumno(nombres[rand.nextInt(nombres.length)], apellidos[rand.nextInt(apellidos.length)],
					rand.nextInt(100));
		


		}

		int opcion=0;

		opcion=Leer.pedirEntero("Elija una opci�n:\n1.- Crear y visualizar automaticamente la base de datos de los alumnos\n2.- Mostrar los alumnos ordenados por nota "
				+ " \n0.- Salir");

		while(opcion!=0){



			switch (opcion) {
			case 1:
				for (int i = 0;i< 50; i++) {
					System.out.println(vecAlumnos[i]);

				}//end for
				


				break;
			case  2://genererando el mapa por nota
				int indice;
				Integer NotaMapa;
				ArrayList<Alumno> listaDeAlumnosDelNodo;
				for (indice = 0; indice < vecAlumnos.length; indice++) {
					NotaMapa=vecAlumnos[indice].getNota();
					if (MapaNota.containsKey(NotaMapa)==false){
						listaDeAlumnosDelNodo= new ArrayList<Alumno>();
						listaDeAlumnosDelNodo.add(vecAlumnos[indice]);
						MapaNota.put(NotaMapa,listaDeAlumnosDelNodo);
					}else{
						MapaNota.get(NotaMapa).add(vecAlumnos[indice]);
					}
				}

				Iterator<Integer> itr =  MapaNota.keySet().iterator();//los alumnos saldran ordenados por la key(nota)
				while(itr.hasNext()){
					NotaMapa=(int)itr.next();
					listaDeAlumnosDelNodo=MapaNota.get(NotaMapa);
					Leer.mostrarEnPantalla("\nNota : " + NotaMapa );// se muestra la nota 
					for (Alumno alumno : listaDeAlumnosDelNodo) {						
						System.out.println(alumno);

					}
				}
				break;
			case  3:
				int indice2;
				String nombre;
				ArrayList<Alumno> listaAlumnosConMismoNombre;
				for (indice2 = 0; indice2 < vecAlumnos.length; indice2++) {
					nombre=vecAlumnos[indice2].getNombre();
					if (MapaNombre.containsKey(nombre)==false){
						listaAlumnosConMismoNombre= new ArrayList<Alumno>();
						listaAlumnosConMismoNombre.add(vecAlumnos[indice2]);
						MapaNombre.put(nombre,listaAlumnosConMismoNombre);
					}else{
						MapaNombre.get(nombre).add(vecAlumnos[indice2]);
					}
				}
				Iterator<String> itr2 =  MapaNombre.keySet().iterator();//los alumnos saldran ordenados por la key(nombre)
				while(itr2.hasNext()){
					nombre=itr2.next();
					listaAlumnosConMismoNombre=MapaNombre.get(nombre);
					Leer.mostrarEnPantalla("\nNombre : " + nombre );// se muestra el nombre 
					for (Alumno a : listaAlumnosConMismoNombre) {						
						System.out.println(a);
					}
				}

				
				
				
				break;

			default:

				break;

			}//end switch

			opcion=Leer.pedirEntero("Elija una opci�n: \n1.- Crear y visualizar automaticamente la base de datos de los alumnos\n2.- Mostrar los alumnos ordenados por nota "
					+ " \n0.- Salir");




		}//end while




	}//end main
}
