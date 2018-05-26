import java.io.Serializable;

public class Coche implements Comparable<Coche>, Serializable {
	private String matricula;
	private Integer ruedas;
	private Integer numAsientos;

	public Coche(String matricula, Integer ruedas, Integer numAsientos) {
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.numAsientos = numAsientos;
	}

	public Integer getRuedas() {
		return ruedas;
	}

	public String getMatricula() {
		return matricula;
	}
	public Integer getNumAsientos() {
		return numAsientos;
	}

	public String ponerEnMarcha() {
		return "El coche de matricula " + getMatricula() + " se ha puesto en marcha.";
	}
	public int compareTo(Coche v2){
		return this.matricula.compareTo(v2.matricula);
	}
}
