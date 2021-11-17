/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author luis
 */
public class Incidencia {

    protected int id;
    protected String descripcion;
    protected Estado estado;
    protected int prioridad;
    protected Date fechacreacion;
    protected boolean revisada;
    protected boolean aceptada;
    protected Nivel0 nivel0;
    protected Informe informe;
    protected Usuario usuario;

    public Incidencia() {
        /* Ejercicio 4 */
        this.estado.setEstado(Estado.INTRODUCIDA);
        this.prioridad = 5;
        this.fechacreacion = Date.valueOf(LocalDate.now());
        this.revisada = false;
        this.aceptada = false;
        this.nivel0 = null;
        this.informe = null;
        this.usuario = null;
    }

    public Incidencia(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        /* Ejercicio 4 */
        this.estado.setEstado(Estado.INTRODUCIDA);
        this.prioridad = 5;
        this.fechacreacion = Date.valueOf(LocalDate.now());
        this.revisada = false;
        this.aceptada = false;
        this.nivel0 = null;
        this.informe = null;
        this.usuario = null;
    }

    public Incidencia(Incidencia i) {
        this.id = i.id;
        this.descripcion = i.descripcion;
        this.estado = i.estado;
        this.prioridad = i.prioridad;
        this.fechacreacion = i.fechacreacion;
        this.revisada = i.revisada;
        this.aceptada = i.aceptada;
        this.nivel0 = i.nivel0;
        this.informe = i.informe;
        this.usuario = i.usuario;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public boolean isRevisada() {
        return revisada;
    }

    public void setRevisada(boolean revisada) {
        this.revisada = revisada;
    }

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    public Nivel0 getNivel0() {
        return nivel0;
    }

    public void setNivel0(Nivel0 nivel0) {
        this.nivel0 = nivel0;
    }

    public Informe getInforme() {
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
