public class Alumno {

	
	private String nombre="";
	private String apellido="";
	private Integer nota1;
	private Integer nota2;
	private Integer nota3;
	public Alumno(String nombre, String apellido, Integer nota1, Integer nota2, Integer nota3) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getNota1() {
		return nota1;
	}
	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}
	public Integer getNota2() {
		return nota2;
	}
	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}
	public Integer getNota3() {
		return nota3;
	}
	public void setNota3(Integer nota3) {
		this.nota3 = nota3;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + "]";
	}
	

}
