
public class Menu {
	private String NombrePlato="";

	private String Ingrediente1="";
	private String Ingrediente2="";
	private String Ingrediente3="";
	
	private Integer PrecioIngrediente;
	private Integer PrecioTotal;


	public Menu(String nombrePlato, String ingrediente1, String ingrediente2, String ingrediente3, Integer precioIngrediente) {
		super();
		NombrePlato = nombrePlato;
		Ingrediente1 = ingrediente1;
		Ingrediente2 = ingrediente2;
		Ingrediente3 = ingrediente3;
		PrecioIngrediente= precioIngrediente;
		asignarPrecio();
	
	
	}


	public String getNombrePlato() {
		return NombrePlato;
	}


	public void setNombrePlato(String nombrePlato) {
		NombrePlato = nombrePlato;
	}


	public String getIngrediente1() {
		return Ingrediente1;
	}


	public void setIngrediente1(String ingrediente1) {
		Ingrediente1 = ingrediente1;
	}


	public String getIngrediente2() {
		return Ingrediente2;
	}


	public void setIngrediente2(String ingrediente2) {
		Ingrediente2 = ingrediente2;
	}


	public String getIngrediente3() {
		return Ingrediente3;
	}


	public void setIngrediente3(String ingrediente3) {
		Ingrediente3 = ingrediente3;
	}


	public Integer getPrecioTotal() {

		
		return PrecioTotal;
	}


	public void setPrecioTotal(Integer precioTotal) {
		
	
		PrecioTotal = precioTotal;
		
		}
	
	public void asignarPrecio(){
		PrecioTotal = PrecioIngrediente*3;
	}

	public Integer getPrecioIngrediente() {
		
		return PrecioIngrediente;
	}





	@Override
	public String toString() {
		return "Menu [NombrePlato=" + NombrePlato + ", Ingrediente1=" + Ingrediente1 + ", Ingrediente2=" + Ingrediente2
				+ ", Ingrediente3=" + Ingrediente3 + ", PrecioIngerdiente=" + PrecioIngrediente + ", PrecioTotal="
				+ PrecioTotal + "]";
	}


	
	
		
	}

