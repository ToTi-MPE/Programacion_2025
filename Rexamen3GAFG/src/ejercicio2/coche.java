package ejercicio2;
import java.util.*;
public class coche {

	enum Tcoche{
		deportivo,
		familiar,
		todoterreno
	}
	
	enum LicenciaN{
		a,
		b,
		c
	}
	
	String modelo;
	Tcoche tipo;
	LicenciaN licenciac;
	
	public coche(String modelo, Tcoche tipo, LicenciaN licencia) {
		this.modelo = modelo;
		this.tipo = tipo;
		this.licenciac = licencia;
		
	}
	
	
	
	
	//metodo de pruba
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Tcoche getTipo() {
		return tipo;
	}



	public void setTipo(Tcoche tipo) {
		this.tipo = tipo;
	}



	public LicenciaN getLicenciac() {
		return licenciac;
	}



	public void setLicenciac(LicenciaN licencia) {
		this.licenciac = licencia;
	}



	
	
	// metodo mostrar coche
	public void infochoche() {
		System.out.println("------------------------------");
		System.out.println("Modelo: "+modelo);
		System.out.println("Tipo: "+tipo);
		System.out.println("Licencia: "+licenciac);
		System.out.println("------------------------------");
	}
	
	
	
	
}
