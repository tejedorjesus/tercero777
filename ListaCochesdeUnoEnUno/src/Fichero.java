import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Fichero {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public Fichero(String nombre, String io){
		//fin=false;
		if (io.equals("I")){//abrir el fichero para leer
			try{
				entrada=new ObjectInputStream(new FileInputStream(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de entrada "+e.getMessage());
				System.exit(1);
			}
		}
		if (io.equals("O")){//abrir el fichero para escribir
			try{
				salida=new ObjectOutputStream(new FileOutputStream(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de salida "+e.getMessage());
				System.exit(1);
			}
		}
	}
	
	
	public Coche leer( ) {
		Coche coche = null;
		try {
			coche = (Coche) entrada.readObject();//leemos un registro
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			coche=null;
		} catch (NullPointerException e) {
			coche= null;
		} catch(IOException e){
			//Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			coche=null;
		} 
		return coche;
	}
	
	public Boolean escribir(Coche coche ){
		
		try {
			if(coche!=null){//si el objeto existe lo escribimos
				salida.writeObject(coche);
			}
		}catch(IOException e){//controlar el error de escritura
			Leer.mostrarEnPantalla("Error al escribir en el archivo "+e.getMessage());
			//System.exit(1);
		} catch (NullPointerException e) {//controlar el error de asignaci�n de fichero
	        return false;
	    }
		return true;
	}
	
	public void cerrar(String io){ 
		try{
			if(io.equals("I")){//cerrar el buffer de entrada
				entrada.close();
			}
			if(io.equals("O")){//cerrar el buffer de salida
				salida.close();
			}
		}catch(IOException e){//controlar la excepci�n
			Leer.mostrarEnPantalla("Error al cerrar el archivo "+e.getMessage());
			System.exit(1);
		}
	}
}
