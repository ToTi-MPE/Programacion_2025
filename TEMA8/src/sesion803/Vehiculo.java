package sesion803;
import java.io.*;
public abstract class Vehiculo implements Serializable {

	String marca;
	String modelo;


	public Vehiculo (String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	public String Descripcion() {
		return "Marca: "+marca+ " || Modelo: "+ modelo;
	}
	
}

class Coche extends Vehiculo{
	int numPuertas;
	public Coche (String marca,String modelo,int numPuertas) {
		super(marca,modelo);
		this.numPuertas=numPuertas;
	}
	
	public String Descripcion() {
		return "Coche"+ super.Descripcion()+" || numero de puertas: "+	numPuertas; 
	}	
}

class Moto extends Vehiculo{
	int cilindrada;
	public Moto (String marca,String modelo,int cilindrada) {
		super(marca,modelo);
		this.cilindrada=cilindrada;
	}
	
	public String Descripcion() {
		return "Moto"+ super.Descripcion()+" || numero de puertas: "+cilindrada; 
	}	
}