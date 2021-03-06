import java.io.*;
import java.nio.channels.FileLock;
import java.util.*;
public class TreemapNotasAlumnosPorApellido {
	




	public static void main(String[] args)  {
		TreeMap<String,Integer> mapaAlumnos=new TreeMap<String, Integer>();
		String apellido;
		Integer nota;
		
	
		
	
		
		FicheroTexto fichTexto = new FicheroTexto("C:/Users/JESUS/Desktop/fichero.txt","I");//Apertura del fichero de entrada.donde leemos
		
	
		

		leeFichero(mapaAlumnos, fichTexto);
		Leer.mostrarEnPantalla(mapaAlumnos.toString());
		
	
		apellido=Leer.pedirCadena("Apellido (\"*\": fin)");
		while(!apellido.equals("*")){
			if(mapaAlumnos.containsKey(apellido)){
				Leer.mostrarEnPantalla("No se puede repetir el apellido");
			}else{
				do{
					nota=Leer.pedirEntero("Nota entre 1 y 10: ");
				}while(nota < 1 || nota > 10);
				mapaAlumnos.put(apellido, nota);
			}
			apellido=Leer.pedirCadena("Apellido (\"*\": fin)");
		}
		FicheroObjeto ficheroObjeto;
		ficheroObjeto = new FicheroObjeto("fichMapAluApe.da3.txt","O");//abrimos el fichero para escritura
		ficheroObjeto.escribir(mapaAlumnos);
		ficheroObjeto.cerrar("O");
		
		//mostramos el primer mapa
		muestraMapa(mapaAlumnos);
	
		System.out.println("muestra del mapa creado a partir de un fichero y datos introducidos con for each key set, ademas se ha creado el fichero "
				+ "fichMapAluApe.da3 con toda la informacion del primer ficheroy la adicional ");
	
		 
	//	FicheroObjeto ficheroObjeto2;//lee fichero 2
		TreeMap<String,Integer> mapaAlumnos2=new TreeMap<String, Integer>();// lee del archivo de objetos y se lleva al metodo mosstrar mapa el mapa que queremos ver
		ficheroObjeto = new FicheroObjeto("fichMapAluApe.da3.txt","I");
		mapaAlumnos2 = ficheroObjeto.leer();

		muestraMapa(mapaAlumnos2);

		System.out.println("esto es lo que lee de fichMapAluApe.da3.txt que acabamos de crear ademas hemos metodo toda la info en un nuevo treeMap");

	}// main

	private static void leeFichero(TreeMap<String,Integer> mapaAlumnos, FicheroTexto fichTexto) {
		Registro reg;
		reg = fichTexto.leer();
		while (reg != null) {
			//lista.add(reg);//lo a�adimos a la lista
			mapaAlumnos.put(reg.getApellido(), reg.getNota());			
			Leer.mostrarEnPantalla("Apellido: " + reg.getApellido());//imprimimos apellido
			Leer.mostrarEnPantalla("Nota : " + reg.getNota()+"\n");//imprimimos edad
			reg = fichTexto.leer();//leemos siguiente
		}
		fichTexto.cerrar("I");//cerrar fichero de lectura 
	}
	
	
	private static void muestraMapa(TreeMap<String,Integer> mapaAlumnos){
		int nota;
		for (String claveApe: mapaAlumnos.keySet()){ // Recorremos el conjunto generado por keySet,
			// contendr� las claves.
			nota=mapaAlumnos.get(claveApe); //Para cada clave, accedemos a su valor
			Leer.mostrarEnPantalla(claveApe + ":  " + nota); 			
		}
		System.out.println("\n**************************************\n");/*  diferentes formas de mostrar la info

		//obtenemos una lista con todos los pares clave/valor del mapa
		Set <Map.Entry< String, Integer> > unSet = mapaAlumnos.entrySet();

		//recorremos cada objeto de la lista anterior
		for(Map.Entry<String, Integer> mEntry: unSet){
			Leer.mostrarEnPantalla(mEntry.getKey() + ": " + mEntry.getValue());
		}

		System.out.println("\n**************************************\n");

		// ahora hacemos el recorrido usando un iterador
		Iterator< Map.Entry<String, Integer> > it = mapaAlumnos.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> mEntry = (Map.Entry<String, Integer>)it.next();
			Leer.mostrarEnPantalla(mEntry.getKey() + ": " + mEntry.getValue());
		}*/
	}
}
