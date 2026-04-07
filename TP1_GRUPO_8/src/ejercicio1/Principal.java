package ejercicio1;
import java.time.LocalDate;


public class Principal {
	
	public static void main(String [] args) {
		
 //Empleado 1
	    Empleado emp1 = new Empleado("47233579", "Agustin", "Gonzalez", (LocalDate.of(2006, 4, 9)),
	    				Genero.Masculino, "calle mentira 889", "1165654371", "agustingonzalez@gmail.com",
	    				"IT");
	       
	    
// Empleado 2
	    
	   Empleado emp2 = new Empleado("47233579", "Victoria", "Caseres", LocalDate.of(2005, 11, 24), 
			   			Genero.Femenino, "calle mentira 972", "1132328274", "victoriacaseres@gmail.com", 	
			   			"Administrativa");
	   
	   
// Empleado 3 
	   
	   Empleado emp3 = new Empleado("12345678", "Ludmila", "Martinez", LocalDate.of(2006, 10, 5), 
			   			Genero.Masculino, "calle 89", "1165654371", "ludmilamatinez@gmail.com",
			   			"Medico");
	    
// Empleado 4
	    
	    Empleado emp4 = new Empleado("111225566", "Martina", "Cardozo", LocalDate.of(2003, 12, 16),
	    				Genero.Femenino, "Portugal 89", "1136588562", "martina_16cardozo@hotmail.com",
	    				"Sistemas");
	    
// Empleado 5
	    
	    Empleado emp5 = new Empleado();
	    
//	    
	   
	    System.out.println("---LISTA EMPLEADOS---" + System.lineSeparator());
	    System.out.println(emp1.toString());
	    System.out.println(emp2.toString());
	    System.out.println(emp3.toString());
	    System.out.println(emp4.toString());
	    System.out.println(emp5.toString());
	    System.out.println("El proximo legajo sera el "+ Empleado.devuelveProximoLegajo());
	
	}
	



}
