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
public class Programa {

    private int id;
    private String nombre;
    private int tamanio;
    private float version;

    public Programa() {
    }

    public Programa(int id, String nombre, int tamanio, float version) {
        this.id = id;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    /* Ejercicio 2 */
    @Override
    public String toString() {
        return this.nombre + " ( " + this.version + " ) ocupa " + this.tamanio + "MB.";
    }

}
