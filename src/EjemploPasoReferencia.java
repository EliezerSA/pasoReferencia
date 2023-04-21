/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class EjemploPasoReferencia {
	public static void main (String[]args) {
		
		Persona persona = new Persona("Juan", 28);
		System.out.println("Antes de llamar al metodo: " + persona.getNombre());
		modificarPersona(persona);
		System.out.println("Despues de llamar al metodo: " + persona.getNombre());
		
		
	}
	
	public static void modificarPersona(Persona persona) {
		
		System.out.println("Dentro del metodo: " + persona.getNombre() + persona.getEdad());
		persona.setNombre("Pedro");
		persona.setEdad(30);
		System.out.println("Despues de modificar: " + persona.getNombre() + persona.getEdad());
		
		
	}

}
