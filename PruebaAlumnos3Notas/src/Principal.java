import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.RandomAccess;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TreeMap<Integer, ArrayList<Integer>> mapNota2 = new TreeMap<Integer, ArrayList<Integer>>();
	TreeMap<Integer, ArrayList<Integer>> mapNota1 = new TreeMap<Integer, ArrayList<Integer>>();
	TreeMap<Integer, ArrayList<Integer>> mapNota3 = new TreeMap<Integer, ArrayList<Integer>>();


	String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
	"German" };
	String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Ba�ez", "Franco",
			"Blanco", "Jimenez" };
	
	

		Random rand =new Random();
		Alumno [] unAlumno =null;
		
	
		int nota1=0;
		int nota2=0;
		int nota3=0;
		String nombre="";
		String apellido="";
		unAlumno = new Alumno[50];
		for (int i = 0; i < unAlumno.length; i++) {

			
			unAlumno[i]=new Alumno (nombres[rand.nextInt(nombres.length)],apellidos[rand.nextInt(apellidos.length)],
					rand.nextInt(51)+50,rand.nextInt(51)+50,rand.nextInt(51)+50);
		}
		
		
		
		
		
		
		
		
		for (int j = 0; j < unAlumno.length; j++) {
			System.out.println(unAlumno[j]);
		}
		
		  
		
		int indice;
		ArrayList<Integer>ListaIndicesAlumnos;
		Integer NotaMapa;
		System.out.println("--------------------PRIMER EXAMEN------------------------------");
		
		for ( indice = 0; indice < unAlumno.length; indice++) {
			NotaMapa=unAlumno[indice].getNota1();
			if (mapNota1.containsKey(NotaMapa)==false){
				 ListaIndicesAlumnos = new ArrayList();
				 ListaIndicesAlumnos.add(indice);
				 mapNota1.put(NotaMapa, ListaIndicesAlumnos);
				 
			}else{
				 mapNota1.get(NotaMapa).add(indice);
				
			}
			
		}
		Iterator<Integer> itr = mapNota1.keySet().iterator();
		
		while(itr.hasNext()){
			NotaMapa=(int)itr.next();
			ListaIndicesAlumnos=mapNota1.get(NotaMapa);
			
			Leer.mostrarEnPantalla("\nNota : " + NotaMapa );// se muestra la nota 
			
			for(int valor : ListaIndicesAlumnos){
				System.out.println(unAlumno[valor]);
				
			
			}
		
		}
		
		
		int indice2;
		ArrayList<Integer>ListaIndicesAlumnos2;
		Integer NotaMapa2;
		System.out.println("--------------------SEGUNDO EXAMEN------------------------------");
		
		for ( indice2 = 0; indice2 < unAlumno.length; indice2++) {
			NotaMapa2=unAlumno[indice2].getNota2();
			if (mapNota2.containsKey(NotaMapa2)==false){
				 ListaIndicesAlumnos2 = new ArrayList();
				 ListaIndicesAlumnos2.add(indice2);
				 mapNota2.put(NotaMapa2, ListaIndicesAlumnos2);
				 
			}else{
				 mapNota2.get(NotaMapa2).add(indice2);
				
			}
			
		}
		Iterator<Integer> itr2 = mapNota2.keySet().iterator();
		
		while(itr2.hasNext()){
			NotaMapa2=(int)itr2.next();
			ListaIndicesAlumnos2=mapNota2.get(NotaMapa2);
			
			Leer.mostrarEnPantalla("\nNota : " + NotaMapa2 );// se muestra la nota 
			
			for(int valor : ListaIndicesAlumnos2){
				System.out.println(unAlumno[valor]);
				
			
			}
		
		}
		
		

		int indice3;
		ArrayList<Integer>ListaIndicesAlumnos3;
		Integer NotaMapa3;
		System.out.println("--------------------TERECER  EXAMEN------------------------------");
		
		for ( indice3 = 0; indice3 < unAlumno.length; indice3++) {
			NotaMapa3=unAlumno[indice3].getNota3();
			if (mapNota3.containsKey(NotaMapa3)==false){
				 ListaIndicesAlumnos3 = new ArrayList();
				 ListaIndicesAlumnos3.add(indice3);
				 mapNota3.put(NotaMapa3, ListaIndicesAlumnos3);
				 
			}else{
				 mapNota3.get(NotaMapa3).add(indice3);
				
			}
			
		}
		Iterator<Integer> itr3 = mapNota3.keySet().iterator();
		
		while(itr3.hasNext()){
			NotaMapa3=(int)itr3.next();
			ListaIndicesAlumnos3=mapNota3.get(NotaMapa3);
			
			Leer.mostrarEnPantalla("\nNota : " + NotaMapa3 );// se muestra la nota 
			
			for(int valor : ListaIndicesAlumnos3){
				System.out.println(unAlumno[valor]);
				
			
			}
		
		}
	
	
}

}