
public class Usuario {
	
	private String clave;
	private String nombre;
	public Usuario(String clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Usuario [clave=" + clave + ", nombre=" + nombre + "]";
	}

	

}
