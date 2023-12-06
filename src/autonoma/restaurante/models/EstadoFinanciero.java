/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

import java.util.Date;

/**
 *
 * @author dioge
 */
public class EstadoFinanciero {
    private Date fechaGeneracion;
    private double totalRecaudado;
    private double totalGanancias;

    public EstadoFinanciero(Date fechaGeneracion, double totalRecaudado, double totalGanancias) {
        this.fechaGeneracion = fechaGeneracion;
        this.totalRecaudado = totalRecaudado;
        this.totalGanancias = totalGanancias;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public double getTotalGanancias() {
        return totalGanancias;
    }

    public void setTotalGanancias(double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }

    void add(EstadoFinanciero estadoFinanciero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}