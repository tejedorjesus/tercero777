import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TreeMap<Integer, ArrayList<Integer>> mapNota1 = new TreeMap<Integer, ArrayList<Integer>>();
	TreeMap<Integer, ArrayList<Integer>> mapNota2 = new TreeMap<Integer, ArrayList<Integer>>();
	TreeMap<Integer, ArrayList<Integer>> mapNota3 = new TreeMap<Integer, ArrayList<Integer>>();

		
	
	

		Random rand =new Random();
		Alumno [] unAlumno =null;
		
		unAlumno = new Alumno[2];
		int nota1=0;
		int nota2=0;
		int nota3=0;
		String nombre="";
		String apellido="";
		
		for (int i = 0; i < unAlumno.length; i++) {
			nombre=Leer.pedirCadena("nombre");
			apellido=Leer.pedirCadena("apellido");
			nota1=Leer.pedirEntero("nota1");
			nota2=Leer.pedirEntero("nota2");
			nota3=Leer.pedirEntero("nota3");
			
			
			
			unAlumno[i]=new Alumno (nombre,apellido,nota1,nota2,nota3);
		}
		for (int j = 0; j < unAlumno.length; j++) {
			System.out.println(unAlumno[j]);
		}
		
		
}

}
