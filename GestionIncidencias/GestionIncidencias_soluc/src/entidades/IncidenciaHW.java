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
public class IncidenciaHW extends Incidencia {

    private int idincidenciahw;
    private Equipo equipo;
    private TecnicoHW tecnico;

    public IncidenciaHW() {
        super();
    }

    public IncidenciaHW(Incidencia i, Equipo eq) {
        super(i);
        this.equipo = eq;
        this.tecnico = null;
    }

    public IncidenciaHW(Incidencia i, Equipo eq, TecnicoHW tec) {
        super(i);
        this.equipo = eq;
        this.tecnico = tec;
    }

    public int getIdincidenciahw() {
        return idincidenciahw;
    }

    public void setIdincidenciahw(int idincidenciahw) {
        this.idincidenciahw = idincidenciahw;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public TecnicoHW getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoHW tecnico) {
        this.tecnico = tecnico;
    }

}
