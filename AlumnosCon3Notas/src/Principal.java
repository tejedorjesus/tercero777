import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,ArrayList<Integer>>MapaNota1=new TreeMap <Integer,ArrayList<Integer>>();
		TreeMap<Integer,ArrayList<Integer>>MapaNota2=new TreeMap <Integer,ArrayList<Integer>>();
		TreeMap<Integer,ArrayList<Integer>>MapaNota3=new TreeMap <Integer,ArrayList<Integer>>();


		String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
		"German" };
		String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Ba�ez", "Franco",
				"Blanco", "Jimenez" };
		Random rand = new Random();
		Alumno[] unAlumno=null;

		



		int opcion;
		opcion=Leer.pedirEntero("Elijaa una opcio\n1-generar datos\n2-Mostrar datos\n3-Generar mapa de la Notas en orden ascendente\n4-Con for each");
		while (opcion!=0){

			switch (opcion) {
			case 1:
				unAlumno = new Alumno[50];
				for (int i = 0; i < unAlumno.length; i++) {
					unAlumno[i]=new Alumno (nombres[rand.nextInt(nombres.length)],apellidos[rand.nextInt(apellidos.length)],
							rand.nextInt(100), rand.nextInt(100),rand.nextInt(100));


				}

				break;

			case 2:
				if(unAlumno==null)
					System.out.println("hay que generar los datos primero");
				else{


					for (int i = 0; i < unAlumno.length; i++) {
						System.out.println(unAlumno[i]);

					}}
				break;


		

			case 3:

				int indice;
				Integer NotaMapa;
				ArrayList<Integer> ListaIndicesNombresAlumnos;
				
				for (indice=0; indice < unAlumno.length; indice++) {
					NotaMapa=unAlumno[indice].getNota1();
					if(MapaNota1.containsKey(NotaMapa)==false){
						ListaIndicesNombresAlumnos = new ArrayList<Integer>();
						ListaIndicesNombresAlumnos.add(indice);
						MapaNota1.put(NotaMapa,ListaIndicesNombresAlumnos);
					}
					else{
						MapaNota1.get(NotaMapa).add(indice);	//a esa direccion de memoria le metes el indice no 
																// pongo put porque la nota ya esta y no la voy a poner
																//dos veces
					}
				}
		
				Iterator<Integer> itr = MapaNota1.keySet().iterator();
				System.out.println("--------------------------------------PRIMER TRIMESTRE--------------------------------------");
				while(itr.hasNext()){
					NotaMapa=(int)itr.next();
					ListaIndicesNombresAlumnos=MapaNota1.get(NotaMapa);
					
					Leer.mostrarEnPantalla("\nNota : " + NotaMapa );// se muestra la nota 
					for (Integer posiciones : 	ListaIndicesNombresAlumnos) {
						Leer.mostrarEnPantalla("Posicion del Alumno en el nodo : "+(posiciones+1) + " , ");
						System.out.println(unAlumno[posiciones]);

					}
				}
				System.out.println("---------------------------------------------------------------------------------------------");
				
				int indice2;
				Integer NotaMapa2;
				ArrayList<Integer> ListaIndicesNombresAlumnos2;
				
				for (indice2=0; indice2 < unAlumno.length; indice2++) {
					NotaMapa2=unAlumno[indice2].getNota2();
					if(MapaNota2.containsKey(NotaMapa2)==false){
						ListaIndicesNombresAlumnos2 = new ArrayList<Integer>();
						ListaIndicesNombresAlumnos2.add(indice2);
						MapaNota2.put(NotaMapa2,ListaIndicesNombresAlumnos2);
					}
					else{
						MapaNota2.get(NotaMapa2).add(indice2);			
					}
				}
		
				Iterator<Integer> itr2 = MapaNota2.keySet().iterator();
				System.out.println("--------------------------------------SEGUNDO TRIMESTRE--------------------------------------");
				while(itr2.hasNext()){
					NotaMapa2=(int)itr2.next();
					ListaIndicesNombresAlumnos2=MapaNota2.get(NotaMapa2);
					
					Leer.mostrarEnPantalla("\nNota : " + NotaMapa2 );// se muestra la nota 
					for (Integer posiciones : 	ListaIndicesNombresAlumnos2) {
						Leer.mostrarEnPantalla("Posicion del Alumno en el nodo : "+(posiciones+1) + " , ");
						System.out.println(unAlumno[posiciones]);

					}
				}
				System.out.println("---------------------------------------------------------------------------------------------");
				
				
				
				
				break;
			case 4:

				int indice3;
				Integer NotaMapa3;
				ArrayList<Integer> ListaIndicesNombresAlumnos3;
				
				for (indice3=0; indice3 < unAlumno.length; indice3++) {
					NotaMapa3=unAlumno[indice3].getNota2();
					if(MapaNota3.containsKey(NotaMapa3)==false){
						ListaIndicesNombresAlumnos3 = new ArrayList<Integer>();
						ListaIndicesNombresAlumnos3.add(indice3);
						MapaNota3.put(NotaMapa3,ListaIndicesNombresAlumnos3);
					}
					else{
						MapaNota3.get(NotaMapa3).add(indice3);			
					}
				}
				
				Iterator<Integer> itr3 = MapaNota3.keySet().iterator();
				System.out.println("--------------------------------------SEGUNDO TRIMESTRE--------------------------------------");
				while(itr3.hasNext()){
					NotaMapa3=(int)itr3.next();
					ListaIndicesNombresAlumnos3=MapaNota3.get(NotaMapa3);
					
					Leer.mostrarEnPantalla("\nNota : " + NotaMapa3 );// se muestra la nota 
				
				for (Integer posiciones : 	 ListaIndicesNombresAlumnos3) {
					Leer.mostrarEnPantalla("Posicion del Alumno en el nodo : "+(posiciones+1) + " , ");
					System.out.println(unAlumno[posiciones]);

				}
				}
				
				
				
		
			
				
			
				
				
				break;
				
			default:

				break;




			}//end switch
			opcion=Leer.pedirEntero("Elijaa una opcio\n1-generar datos\n2-Mostrar datos\n3-Generar mapa de la Nota1 oreden ascendente"
					+ "\n4-Generar mapa de la Nota2 oreden ascendente\n5-Generar mapa de la Nota3 oreden ascendente");

		}//end while


















	}

}
