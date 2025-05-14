package ejercicio2;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		// Crear coches
		coche coche1 = new coche("Ferrari F8", coche.Tcoche.deportivo, coche.LicenciaN.a);
		coche coche2 = new coche("Toyota Corolla", coche.Tcoche.familiar, coche.LicenciaN.b);
		coche coche3 = new coche("Land Rover", coche.Tcoche.todoterreno, coche.LicenciaN.c);
		coche coche4 = new coche("Lamborghini Aventador", coche.Tcoche.deportivo, coche.LicenciaN.a);
		coche coche5 = new coche("Porsche 911", coche.Tcoche.deportivo, coche.LicenciaN.b);
		
		// Crear clientes
		cliente cli1 = new cliente ("Carlos", 25, cliente.Licencia.b);
		cliente cli2 = new cliente ("Laura", 30,cliente.Licencia.a);
		cliente cli3 = new cliente ("Pedro", 18,cliente.Licencia.c);
		cliente cli4 = new cliente ("Sofia",22, cliente.Licencia.b);
		cliente cli5 = new cliente ("Javier",17,cliente.Licencia.a); 
	
		cli1.infopersona();
		cli1.prueba(coche1);
		coche1.infochoche();
		
		cli2.infopersona();
		cli2.prueba(coche2);
		coche2.infochoche();
		
		cli3.infopersona();
		cli3.prueba(coche3);
		coche3.infochoche();
		
		cli4.infopersona();
		cli4.prueba(coche4);
		coche4.infochoche();
		
		cli5.infopersona();
		cli5.prueba(coche5);
		coche5.infochoche();
		
	}

}
