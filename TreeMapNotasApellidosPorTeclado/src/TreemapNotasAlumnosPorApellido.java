import java.util.*;
public class TreemapNotasAlumnosPorApellido {

	public static void main(String[] args) {
		TreeMap<String,Integer> mapaAlumnos=new TreeMap<String, Integer>();
		String apellido;
		Integer nota;
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
		for (String claveApe: mapaAlumnos.keySet()){ // Recorremos el conjunto generado por keySet,
													// contendrá las claves.
			nota=mapaAlumnos.get(claveApe); //Para cada clave, accedemos a su valor
			Leer.mostrarEnPantalla(claveApe + ":  " + nota); 			
		}
		System.out.println("\n**************************************\n");
		
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
	   }
		
	}

}
