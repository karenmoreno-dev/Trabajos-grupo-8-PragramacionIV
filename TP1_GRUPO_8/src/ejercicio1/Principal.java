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
	    
	    System.out.print("---LISTA EMPLEADOS---");
	    System.out.print(emp1.toString());
	}
	


}
