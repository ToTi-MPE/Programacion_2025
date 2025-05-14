package ejercicio1;
import java.util.*;
public class habitacion {

	enum TipoH{
		estandar,
		suite,
		Lujo
	}
	
	TipoH tipo;
	int identificador;
	int precio;
	boolean ReqVip;
	
	public habitacion(int identificador, TipoH tipo, int precio, boolean ReqVip) {
		this.identificador = identificador;
		this.tipo = tipo;
		this.precio = precio;
		this.ReqVip = ReqVip;
	}
	
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

	}
	// metodo para alquilar
	

}
