package ejercicio1;
import java.util.*;
public class main {

	public static void main(String[] args) {

		// Creacion de habitaciones
		habitacion h1 = new habitacion (1,habitacion.TipoH.Lujo,500, true );
		habitacion h2 = new habitacion (2,habitacion.TipoH.suite,250,true );
		habitacion h3 = new habitacion (3,habitacion.TipoH.estandar,100,false);
		
		// Creacion de huespedes
		
		huesped p1 = new huesped ("juanmi",12345678,25,true);
		huesped p2 = new huesped ("marco",12345178,15,true);
		huesped p3 = new huesped ("jesus",12365678,35,false);
		huesped p4 = new huesped ("carlos",12845678,14,false);
		huesped p0 = null;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dime que personaje quieres ser: "
				+ "\n [juanmi] - [marco] - [jesus] - [carlos]");
		String opcion = scan.nextLine();
		switch (opcion) {
		
		case "juanmi":
			p0 = p1;
			break;
		case "marco":
			p0 = p2;
			break;
		case "jesus":
			p0 = p3;
			break;
		case "carlos":
			p0 = p4;
			break;
		default:
			System.out.println("opcion no validad");
		}
		p0.alquilar();
		
		
		
		
	}

	
}
