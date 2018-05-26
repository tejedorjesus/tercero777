
import java.util.*;





public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> mapaContrasenias = new TreeMap<String, String>();



		Usuario unUsuario= null;



		Leer.mostrarEnPantalla("Desea crear un usuario???");

		int opcion =0;
		opcion=Leer.pedirEntero("opcion:\n1-crear Usuario y contraseña\n2-visualizar todos"
				+ "\n3-Borrar usuario\n4-Modificar contraseña\n5-Validar usuario introduciondo contrasenia");
		while (opcion!=0){



			switch (opcion) {
			case 1:
				String usuario;
				String contrasenia;
				usuario = Leer.pedirCadena("Crear un usuario introduzca nombre");
				while (mapaContrasenias.containsKey(usuario)){
				
					usuario = Leer.pedirCadena("el susario ya esta en el sistema introduzca otro nombre");
				}
		
				
				
			
				contrasenia = Leer.pedirCadena("Introduza la contrasenia:", "[a-zA-Z0-9]{6}");
				Leer.mostrarEnPantalla(
						"Tu contrasenia y tu usuario son:" + "\n Usuario:" + usuario + "\n Contrasenia:" + contrasenia);
				mapaContrasenias.put(usuario,contrasenia);
			
				
				
				break;
			case 2:

				System.out.println(mapaContrasenias);
				break;

			case 3:
				String nombreBorrar ="";
				nombreBorrar=Leer.pedirCadena("Introduzca el nombre que desea borrar");
				if (mapaContrasenias.containsKey(nombreBorrar)){
					System.out.println("--------borrando-----------"+nombreBorrar);
					mapaContrasenias.remove(nombreBorrar);
				}else{
					System.out.println("ese nombre no aparece en la lista");
				}

				break;

			case 4:
				//modificar
				String usuarioCambio="";
				String nuevaCont="";


				usuarioCambio=Leer.pedirCadena("Introduzca el nombre del usuario al que quiere modificar la contraseña");

				if (mapaContrasenias.containsKey(usuarioCambio)){
					nuevaCont=Leer.pedirCadena("Introduzca la nueva contrasenia");
					System.out.println("---------cambiando contraseña " + mapaContrasenias.get(usuarioCambio) + " por " + nuevaCont);
					mapaContrasenias.replace(usuarioCambio, nuevaCont);
				}else{
					System.out.println("El usuario no existe");
				}

				break;
				
			case 5:
				String usuarioValidar="";
				String claveValidar="";
				usuarioValidar=Leer.pedirCadena("Digame el usuario que quiere validar");
				
				if(mapaContrasenias.containsKey(usuarioValidar)){
					claveValidar=Leer.pedirCadena("el usuario "  + usuarioValidar + " Existe, introduzca la clave"
							+ "para verificar la autenticidad");
					if(mapaContrasenias.containsValue(claveValidar)){
						System.out.println("El usuario y la contrasenia son correctos, usuario validado gracias");
				}else{System.out.println("La clave " + claveValidar + " no existe " );
				
					
				}
				
						
					
					}else{
						System.out.println("El usuario " + usuarioValidar + " no existe " );
				
			}
					
				
				
				
				
				
				
				break;


			default:
				break;

			}//end switch 

			opcion=Leer.pedirEntero("opcion:\n1-crear Usuario y contraseña\n2-visualizar todos"
				+ "\n3-Borrar usuario\n4-Modificar contraseña\n5-Validar usuario introduciondo contrasenia");


		}//end while









	}
}



