package validacion;

public class Validador {

	/**
	 * Devuelve true si el argumento id es valido y false en caso contrario
	 * @param id es el valor a validar
	 * @return false si no es válido y true si sí es válido
	 */
	public static boolean validarId(int id) {
		//valor estrictamente mayor que 0
		if( id > 0 )
			return true;
		
		else 
			return false;
		
	}

	
	public static boolean validarRam(int ram) {
		if(ram > 0)
			return true;
		return false;
	}


	public static boolean validarDiscoDuro(int discoduro) {
		return (discoduro > 0);
	}


	public static boolean validarSO(String so) {
		//La longitud de la cadena de S.O. sea > 1 caracter y < 30 caracteres
		if(so.length() < 1)
			return false;
		if(so.length() >= 30)
			return false;
		//El nombre del S.O. no contenga caracteres extraños (#, @, 
	
		return true;
	}

}
