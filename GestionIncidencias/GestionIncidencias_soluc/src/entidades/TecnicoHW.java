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
public class TecnicoHW extends Empleado {

    private int idnivelhw;
    private String expertoen;

    public TecnicoHW() {
        super();
    }

    /* Ejercicio 5 c) */
    public TecnicoHW(Empleado e, int idnivelhw, String expertoen) {
        super(e);
        this.idnivelhw = idnivelhw;
        this.expertoen = expertoen;
    }

    /* Ejercicio 5 c) */
    public TecnicoHW(int id, int idnivelhw, String nombre, String dni, String email, String telefono, String expertoen) {
        this.id = id;
        this.idnivelhw = idnivelhw;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.expertoen = expertoen;
    }

    public int getIdnivelhw() {
        return idnivelhw;
    }

    public void setIdnivelhw(int idnivelhw) {
        this.idnivelhw = idnivelhw;
    }

    public String getExpertoen() {
        return expertoen;
    }

    public void setExpertoen(String expertoen) {
        this.expertoen = expertoen;
    }
}
