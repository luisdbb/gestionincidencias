/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionincidencias;

import entidades.*;
import validacion.Validador;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class GestionIncidencias {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/* Ejercicio 3 */
		Usuario usu1 = new Usuario();
		usu1.setId(1);
		usu1.setNombre("Patricio Prieto");
		usu1.setDni("56231178K");
		usu1.setEmail("patricio.perez@mail.es");
		usu1.setTelefono("698220153");
		Usuario usu2 = new Usuario(2, "Rebeca Ruiz", "43221798L", "reruiz1977@mail.es ", "942421344");
		Usuario usu3 = new Usuario(usu2);
		usu3.setId(3);
		usu3.setNombre("Luis Lago");
		usu3.setDni("72140822P");
		usu3.setEmail("luislago@mail.es ");
		usu3.setTelefono("910331718");

	} // final main

	/* Ejercicio 1 */
	public Equipo nuevoEquipo() {
		Equipo ret = new Equipo();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca los datos para el nuevo Equipo:");

		boolean idvalido = false;
		int id = -1;
		do {
			System.out.println("Introduzca el identificador del equipo:");
			id = in.nextInt();
			idvalido = Validador.validarId(id);
		} while (!idvalido);
		ret.setId(id);

		int ram = -1;
		boolean ramvalida = false;
		do {
			System.out.println("Introduzca la capacidad de RAM del equipo:");
			ram = in.nextInt();
			ramvalida = Validador.validarRam(ram);
		} while (!ramvalida);
		ret.setRam(ram);

		int discoduro = -1;
		boolean discovalido = false;
		do {
			System.out.println("Introduzca la capacidad del disco duro del equipo:");
			discoduro = in.nextInt();
			discovalido = Validador.validarDiscoDuro(discoduro);
		} while (!discovalido);
		ret.setDiscoduro(discoduro);

		String so = null;
		boolean sovalido = false;
		do {
			System.out.println("Introduzca el S.O. del equipo:");
			so = in.nextLine();
			sovalido = Validador.validarSO(so);
		} while (!sovalido);
		ret.setSo(so);

		return ret;
	}

}
