package selccionEspañola;

public class Jugador extends SeleccionFutbol{
	
	private int dorsal;

	public Jugador(String nombre, String apellido, Integer edad, Integer id, int dorsal) {
		super(nombre, apellido, edad, id);
		this.dorsal = dorsal;
	}

	@Override
	public void entrenamiento() {
		System.out.println("el jugador esta entrenando");

	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	@Override

	public String toString() {
		
		return "Jugador" + super.toString()+ " dorsal=" + dorsal ;
	}
	
	
	

	}



