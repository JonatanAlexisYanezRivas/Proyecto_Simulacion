/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_simulacion;

/**
 *
 * @author Batman
 */
public class ComOne {
    String iteracion, distribuccion , kilolitros;

    public ComOne(String iteracion, String distribuccion, String kilolitros) {
        this.iteracion = iteracion;
        this.distribuccion = distribuccion;
        this.kilolitros = kilolitros;
    }

    public String getIteracion() {
        return iteracion;
    }

    public void setIteracion(String iteracion) {
        this.iteracion = iteracion;
    }

    public String getDistribuccion() {
        return distribuccion;
    }

    public void setDistribuccion(String distribuccion) {
        this.distribuccion = distribuccion;
    }

    public String getKilolitros() {
        return kilolitros;
    }

    public void setKilolitros(String kilolitros) {
        this.kilolitros = kilolitros;
    }
    
}
