import java.io.File;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Set <Coche> setCoches = new TreeSet <Coche>();
		
		List <Coche> listCoches = new LinkedList <Coche>();

		Coche coches[] = new Coche[3];

		coches[0] = new Coche("001", 4, 2);
		coches[1] = new Coche("004", 4, 4);
		coches[2] = new Coche("004", 4, 4);
		//////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		File f = new File("ficheroCoches.dat");
		Fichero ficheroVariosObjetos;
		if (f.exists()){
			ficheroVariosObjetos = new Fichero("ficheroCoches.dat","I");//Apertura del fichero de entrada.donde leemos
			leeFichero(listCoches, ficheroVariosObjetos);
		}else{
			Leer.mostrarEnPantalla("El fichero NO existe");
		}
		//////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for (int i=0;i<coches.length;i++){
			setCoches.add(coches[i]);
			listCoches.add(coches[i]);
		}
		
		visualizar(setCoches, listCoches);
		
		// Escribimos en el fichero de objetos
		ficheroVariosObjetos = new Fichero("ficheroCoches.dat","O");
		escribeFichero(listCoches, ficheroVariosObjetos);

	}//main

	private static void leeFichero(List<Coche> lista, Fichero fichero) {
		Coche coche;
		coche = fichero.leer();
		while (coche != null) {
			lista.add(coche);//lo añadimos a la lista
			coche = fichero.leer();//leemos siguiente
		}
		fichero.cerrar("I");//cerrar fichero de lectura 
	}
	private static void escribeFichero(List<Coche> lista, Fichero fichero) {
		for(Coche e:lista){//recorremos la lista y vamos escribiendo el contenido en el fichero
			fichero.escribir(e);
		}
		fichero.cerrar("O");//Cerramos el fichero de escritura	
	}

	public static void visualizar(Set <Coche> setCoches, List <Coche> listCoches){
		Coche coche;
				
		Leer.mostrarEnPantalla("Recorrido con SET: \n");
		
		for (Coche c : setCoches){
			//if (c instanceof Coche){
			//	c = (Coche) c;
				Leer.mostrarEnPantalla("Asientos del coche: "+c.getNumAsientos()+ ". Matrícula: "+ c.getMatricula() + ". Ruedas: " + c.getRuedas());
			//}
			Leer.mostrarEnPantalla(c.ponerEnMarcha()+"\n");
			
		}
		Leer.mostrarEnPantalla("Recorrido con LIST: \n");
		
		for (Coche otroCoche : listCoches){
			//if (vehiculo instanceof Coche){
			//otroCoche = (Coche) vehiculo;
				Leer.mostrarEnPantalla("Asientos del coche: "+otroCoche.getNumAsientos()+ ". Matrícula: "+ otroCoche.getMatricula() + ". Ruedas: " + otroCoche.getRuedas());
			//}
			Leer.mostrarEnPantalla(otroCoche.ponerEnMarcha()+"\n");
			
		}

	}
}//class
