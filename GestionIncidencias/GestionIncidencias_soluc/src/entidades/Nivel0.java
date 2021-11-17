/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author luis
 */

/* Ejercicio 5 b) */
public class Nivel0 extends Empleado {

    private int idnivel0;

    public Nivel0() {
        super();
    }

    public Nivel0(int id, int ididnivel0, String nombre, String dni, String email, String telefono) {
        this.id = id;
        this.idnivel0 = ididnivel0;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    /* Ejercicio 5 c) */
    public Nivel0(Empleado e, int idnivel0) {
        super(e);
        this.idnivel0 = idnivel0;
    }

    /* Ejercicio 5 c) */
    public int getIdnivel0() {
        return idnivel0;
    }

    public void setIdnivel0(int idnivel0) {
        this.idnivel0 = idnivel0;
    }

}
