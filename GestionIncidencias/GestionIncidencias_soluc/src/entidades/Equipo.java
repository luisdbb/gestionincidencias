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
public class Equipo {

    private int id;
    private String so;
    private int ram;
    private int discoduro;
    
    private static int numEquipos = 0;

    public Equipo() {
    	numEquipos++;
    	this.id = numEquipos;
    }

    public Equipo(String so, int ram, int discoduro) {
    	numEquipos++;
    	this.id = numEquipos;
        this.so = so;
        this.ram = ram;
        this.discoduro = discoduro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(int discoduro) {
        this.discoduro = discoduro;
    }

}
