package sesion803;
import java.io.Serializable;
public class instrumentos implements Serializable{

	String marca;
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public instrumentos(String marca) {
		this.marca=marca;
	}
	
	public String toString() {
		return "Marca= "+marca;
	}
	
}

class guitarra extends instrumentos{
	
	int numCuerdas;
	Boolean esElectrica;

	public guitarra(String marca, int numCuerdas, Boolean esElectrica) {
		super(marca);
		this.numCuerdas = numCuerdas;
		this.esElectrica = esElectrica;
	}
	
}

class paino extends instrumentos{
	
	int teclas;
	Boolean esdecola;
	
	public paino(String marca, int teclas, Boolean esdecola) {
		super(marca);
		this.teclas = teclas;
		this.esdecola = esdecola;
	}
	
//	
//	guarda archivo 
//	accede
}