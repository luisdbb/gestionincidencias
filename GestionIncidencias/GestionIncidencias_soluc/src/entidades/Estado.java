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
public class Estado {

    private int id;
    private String estado;

    public static final String INTRODUCIDA = "INTRODUCIDA";
    public static final String CLASIFICADA = "CLASIFICADA";
    public static final String DESARROLLO = "DESARROLLO";
    public static final String REVISADA = "REVISADA";
    public static final String ACEPTACION = "ACEPTACION";
    public static final String FINALIZADA = "FINALIZADA";

    public Estado() {
    }

    public Estado(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
