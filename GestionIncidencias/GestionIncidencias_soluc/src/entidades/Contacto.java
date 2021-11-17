/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class Contacto {

    private int id;
    private String descripcion;
    private char modo;
    private Date fechahora;
    private Incidencia incidencia;

    /* Ejercicio 5 d) */
    private Usuario usuario; //faltaria inicializarlo a null
    private ArrayList<Empleado> empleados; //faltaria inicializarlo a un nuevo ArrayList<Empleado>()

    public Contacto() {
    }

    public Contacto(int id, String descripcion, char modo, Date fechahora, Incidencia i) {
        this.id = id;
        this.descripcion = descripcion;
        this.modo = modo;
        this.fechahora = fechahora;
        this.incidencia = i;
    }

    /* Ejercicio 5 d) */
    public Contacto(int id, String descripcion, char modo, Date fechahora, Incidencia incidencia, Usuario usuario, ArrayList<Empleado> empleados) {
        this.id = id;
        this.descripcion = descripcion;
        this.modo = modo;
        this.fechahora = fechahora;
        this.incidencia = incidencia;
        this.usuario = usuario;
        this.empleados = empleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getModo() {
        return modo;
    }

    public void setModo(char modo) {
        this.modo = modo;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public Incidencia getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(Incidencia incidencia) {
        this.incidencia = incidencia;
    }

    /* Ejercicio 5 d) */
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
