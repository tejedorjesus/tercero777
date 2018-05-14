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
		File f = new File("ficheroCoches.da2");
		Fichero ficheroObjeto;
		if (f.exists()){
			ficheroObjeto = new Fichero("ficheroCoches.da2","I");//Apertura del fichero de entrada.donde leemos
			listCoches=ficheroObjeto.leerList();
			if(listCoches == null)
				Leer.mostrarEnPantalla(" *** Lista NO leida " );

			ficheroObjeto.cerrar("I");
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
		ficheroObjeto = new Fichero("ficheroCoches.da2","O");
		ficheroObjeto.escribirList(listCoches);
		ficheroObjeto.cerrar("O");
	}//main


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
