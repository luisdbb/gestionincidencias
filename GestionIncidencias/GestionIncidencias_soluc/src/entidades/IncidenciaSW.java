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
public class IncidenciaSW extends Incidencia {

    private int idincidenciasw;
    private Programa programa;
    private TecnicoSW tecnico;

    public IncidenciaSW() {
        super();
    }

    public IncidenciaSW(Incidencia i, Programa prog) {
        super(i);
        this.programa = prog;
        this.tecnico = null;
    }

    public IncidenciaSW(Incidencia i, Programa prog, TecnicoSW tec) {
        super(i);
        this.programa = prog;
        this.tecnico = tec;
    }

    public int getIdincidenciasw() {
        return idincidenciasw;
    }

    public void setIdincidenciasw(int idincidenciasw) {
        this.idincidenciasw = idincidenciasw;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public TecnicoSW getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoSW tecnico) {
        this.tecnico = tecnico;
    }

}
