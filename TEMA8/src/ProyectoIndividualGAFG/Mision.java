package ProyectoIndividualGAFG;

public class Mision {

	String nombre;
	Boolean tripulacion;
	int DuracionEnMeses;
	String destino;
	
	Mision(String nombre, Boolean tripulacion, int DuracionEnMeses, String destino) {
		this.nombre = nombre;
		this.tripulacion = tripulacion;
		this.DuracionEnMeses = DuracionEnMeses;
		this.destino = destino;
	}
	
	public String toString(){
		return nombre+";"+tripulacion+";"+DuracionEnMeses+";"+destino ;
	}
	
}
