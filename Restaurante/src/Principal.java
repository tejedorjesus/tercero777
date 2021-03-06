import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

import javax.xml.bind.ParseConversionEvent;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plato1 = "";
		String plato2 = "";
		Random rand = new Random();
		Menu[] unMenu = null;

		TreeMap<String, Integer> MapaMenu = new TreeMap<String, Integer>();

		String[] Ingrediente1 = { "paprika", "patatas", "salchichas", "rabo de toro", "huevos", "mayonesa", "cebolla" };
		String[] Ingrediente2 = { "paprika", "patatas", "salchichas", "rabo de toro", "huevos", "mayonesa", "cebolla" };
		String[] Ingrediente3 = { "paprika", "patatas", "salchichas", "rabo de toro", "huevos", "mayonesa", "cebolla" };

		String[] NombrePlato = { "Alegria Canaria", "Tipico Aragones", "Clasico", "Mixto", "Delicia", "Manjar",
				"Ambrosia", "El de lolo", "Primavera", "Ligerito", "Multicalorico", "Todoproteinas", "Light", "Heavy" };

		unMenu = new Menu[14];
		for (int i = 0; i < unMenu.length; i++) {
			unMenu[i] = new Menu(NombrePlato[i], Ingrediente1[rand.nextInt(Ingrediente1.length)],
					Ingrediente2[rand.nextInt(Ingrediente2.length)], Ingrediente3[rand.nextInt(Ingrediente3.length)],
					rand.nextInt(6) + 5);// rellenamos los platos aleatoriamente
											// con los ingredientes

		}
		System.out.println("\nSILENCIO.... LOS CHEFFS EST�N PREPARANDO EL MENU .....\n\n");// Imprimimos
																							// los
																							// platos
																							// desordenados
																							// sin
																							// meter
																							// en
																							// el
																							// mapa
		for (int i = 0; i < unMenu.length; i++) {
			System.out.println(unMenu[i]);
		}

		int indice;
		String MapaPlato;
		// ArrayList<Integer> ListaIndicesIngredientes = null;

		for (indice = 0; indice < unMenu.length; indice++) {// creamos el mapa
															// clave--nombre del
															// plato y valor
															// lista de
															// ingredientes y
															// demas datos
			MapaPlato = unMenu[indice].getNombrePlato();
			// if(MapaMenu.containsKey(MapaPlato)==false){
			// ListaIndicesIngredientes = new ArrayList<Integer>();
			// ListaIndicesIngredientes.add(indice);
			MapaMenu.put(MapaPlato, indice);
			// }
			// else{
			// MapaMenu.get(MapaPlato);
			MapaMenu.put(MapaPlato, indice);

		}

		int i = 0;
		System.out.println("\n\n");
		System.out.println(
				"--------IMPRIMIENDO CON FOR EACH  EL MENU ORDENADO POR PLATOS PARA MOSTRAR A LOS CLIENTES...............................");
		System.out.println("\n");
		for (String platos : MapaMenu.keySet()) {// recorremos e imprimimos el
													// mapa utilizando un for
													// each
			System.out.println("NOMBRE DEL PLATO  : " + platos.toUpperCase());
			int ingre = MapaMenu.get(platos);//
			System.out.println(unMenu[ingre]);
			System.out.println("\n");

		}
		System.out.println("\n\n");
		Iterator<String> itr = MapaMenu.keySet().iterator();// recorremos e
															// imprimimmos el
															// mapa utilizando
															// iterador
		System.out.println(
				"--------IMPRIMIENDO CON ITERATOR  EL MENU ORDENADO POR PLATOS PARA MOSTRAR A LOS CLIENTES...............................");
		System.out.println("\n");
		while (itr.hasNext()) {
			MapaPlato = itr.next();

			int ing = MapaMenu.get(MapaPlato);

			Leer.mostrarEnPantalla("NOMBRE DEL PLATO:" + MapaPlato.toUpperCase());// se
																					// muestra
																					// el
																					// plato
			System.out.println(unMenu[ing]);
			System.out.println("\n");

		}

		int opcion;
		opcion = Leer.pedirEntero("Elija una opcion\n1-Elegir platos \n2-Pedir la cuenta");
		while (opcion != 0) {

			switch (opcion) {
			case 1:


				plato1 = Leer.pedirCadena("elgija un plato de los que aparecen en la lista");

				if (MapaMenu.containsKey(plato1)) {// COMO HAGO PARA PODER
													// METERLE MAYUSCULAS
					System.out
							.println("Perfecto disponemosde ese plato en el men� ahora vamos a por el segundo plato ");

					plato2 = Leer.pedirCadena("elija un plato de los que aparecen en la lista");
					if (MapaMenu.containsKey(plato2)) {
						System.out.println("Perfecto disponemos de ese plato en el men� ahora le servimos ");
						System.out.println(unMenu[MapaMenu.get(plato1)]);
						System.out.println(unMenu[MapaMenu.get(plato2)]);

					} else {
						System.out.println("lo sentimos pero ese plato no aparece en nuestro men�");
					}
				} else {
					System.out.println("lo sentimos pero ese plato no aparece en nuestro men�");
				}
			
				break;

			case 2:

				System.out.println("\n\n");

				System.out.println(unMenu[MapaMenu.get(plato1)]);
				System.out.println(unMenu[MapaMenu.get(plato2)]);

				String respuesta = "";
				respuesta = Leer.pedirCadena("Desea pedir la cuenta 'si' o 'no' ");

				if (respuesta.equals("si")) {
					System.out.println(
							"-------------------------Calculando cuenta-------------------------------------------------");
					System.out.println("\n");
					System.out.println(unMenu[MapaMenu.get(plato1)]);
					System.out.println(unMenu[MapaMenu.get(plato2)]);
					Integer precioTotal;
					precioTotal = unMenu[MapaMenu.get(plato1)].getPrecioTotal()
							+ unMenu[MapaMenu.get(plato2)].getPrecioTotal();
					System.out.println("La cantidad total a pagar es  " + unMenu[MapaMenu.get(plato1)].getPrecioTotal()
							+ " euros por el primer plato y " + unMenu[MapaMenu.get(plato2)].getPrecioTotal() 
							+ " euros por el segundo lo que hace un total de : " + precioTotal + " euros");
				} else {
					System.out.println("llamaremos a la policia");
				}

				break;

			default:

				break;

			}// end switch
			opcion = Leer.pedirEntero("Elija una opcion\n1-Elegir platos \n2-Pedir la cuenta");

		} // end while

	}// maun
	/*
	 * public static void preciocena(Menu[] unMenu){
	 * 
	 * 
	 * unMenu[numero].getPrecioTotal(); }
	 * 
	 * }//hhhh
	 */

}
// class