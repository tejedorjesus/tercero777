

package selccionEspañola;
import java.io.Serializable;

public  class SeleccionFutbol  implements Comparable<SeleccionFutbol>, Serializable {
	private String nombre="";
	private String apellido="";
	private Integer edad;
	private Integer id;
	
	public SeleccionFutbol(String nombre, String apellido, Integer edad, Integer id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = id;
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public int compareTo(SeleccionFutbol otraPersona) {
		return 0;
	}
	

	public void entrenamiento(){
		System.out.println("se ha realizado un entrenamiento");
	}
	
	@Override
	public String toString() {
		return " nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id ;
	}
	
}



