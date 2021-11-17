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
public class TecnicoSW extends Empleado {

    private int idnivelsw;
    private String expertoen;

    public TecnicoSW() {
        super();
    }

    /* Ejercicio 5 c) */
    public TecnicoSW(Empleado e, int idnivelsw, String expertoen) {
        super(e);
        this.idnivelsw = idnivelsw;
        this.expertoen = expertoen;
    }

    /* Ejercicio 5 c) */
    public TecnicoSW(int id, int idnivelsw, String nombre, String dni, String email, String telefono, String expertoen) {
        this.id = id;
        this.idnivelsw = idnivelsw;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.expertoen = expertoen;
    }

    public int getIdnivelsw() {
        return idnivelsw;
    }

    public void setIdnivelsw(int idnivelsw) {
        this.idnivelsw = idnivelsw;
    }

    public String getExpertoen() {
        return expertoen;
    }

    public void setExpertoen(String expertoen) {
        this.expertoen = expertoen;
    }

}
