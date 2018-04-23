
public class Alumno {
	
	private String Nombre;
	private String Apellido;
	private Integer Nota;
	
	public Alumno(String nombre, String apellido, Integer nota) {
		super();
	
		Nombre = nombre;
		Apellido = apellido;
		Nota = nota;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Integer getNota() {
		return Nota;
	}
	public void setNota(Integer nota) {
		Nota = nota;
	}
	@Override
	public String toString() {
		return  "[Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nota=" + Nota + "]\n";
	}
	
}

