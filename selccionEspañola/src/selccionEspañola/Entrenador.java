package selccionEspañola;

public class Entrenador extends SeleccionFutbol{
	private int licenciaEntrenador;
	private String Alias ="";

	public Entrenador(String nombre, String apellido, Integer edad, Integer id, int licenciaEntrenador,String Alias) {
		super(nombre, apellido, edad, id);
		this.licenciaEntrenador = licenciaEntrenador;
		this.Alias=Alias;
	}

	public int getLicenciaEntrenador() {
		return licenciaEntrenador;
	}

	public void setLicenciaEntrenador(int licenciaEntrenador) {
		this.licenciaEntrenador = licenciaEntrenador;
	}

	public String getAlias() {
		return Alias;
	}

	public void setAlias(String alias) {
		Alias = alias;
	}

	@Override
	public String toString() {
		return "Entrenador" + super.toString()+ " licenciaEntrenador=" + licenciaEntrenador + ", Alias=" + Alias ;
	}

}
