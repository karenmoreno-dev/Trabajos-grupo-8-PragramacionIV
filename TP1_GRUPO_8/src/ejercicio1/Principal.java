package ejercicio1;
import java.time.LocalDate;


public class Principal {
	
	public static void main(String [] args) {
		
 //Empleado 1
	    Empleado emp1 = new Empleado();
	    
	    emp1.setDni("47233579");
	    emp1.setNombre("Agustin");
	    emp1.setApellido("Gonzalez");
	    emp1.setFechaNacimiento(LocalDate.of(2006, 4, 9));
	    emp1.setGenero(Genero.Masculino);
	    emp1.setDireccion("calle mentira 889");
	    emp1.setTelefono("1165654371");
	    emp1.setEmail("agustingonzalez@gmail.com");
	    emp1.setPuesto("IT");
	    
//    
	    
// Empleado 2
	    
	   Empleado emp2 = new Empleado("47233579", "Victoria", "Caseres", LocalDate.of(2005, 11, 24), Genero.Femenino, "calle mentira 972", "1132328274", "victoriacaseres@gmail.com", "Administrativa");
	   
//
	   
// Empleado 3 
	   
	   Empleado emp3 = new Empleado();
	    
	    emp3.setDni("12345678");
	    emp3.setApellido("Martinez");
	    emp3.setFechaNacimiento(LocalDate.of(2006, 10, 5));
	    emp3.setGenero(Genero.Masculino);
	    emp3.setNombre("Ludmila");
	    emp3.setDireccion("calle 89");
	    emp3.setTelefono("1165654371");
	    emp3.setEmail("ludmilamatinez@gmail.com");
	    emp3.setPuesto("Medico");
	    
		   
//	    
	   
	    System.out.print("---LISTA EMPLEADOS---" + System.lineSeparator());
	    System.out.print(emp1.toString());
	    System.out.print(emp2.toString());
	    System.out.print(emp3.toString());
	
	}
	



}
