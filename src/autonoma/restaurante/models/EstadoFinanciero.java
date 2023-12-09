/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

import java.util.Date;
import java.util.List;

/**
 *Son informes que utilizan las instituciones para dar a conocer su situación económica y financiera
 * @author Angie Campuzano Betancur
 */
public class EstadoFinanciero {
    
    /**
     * La fecha de generación del estado financiero.
     */
    private Date fechaGeneracion;
    
    /**
     * El monto total recaudado en el periodo financiero.
     */
    private double totalRecaudado;
    
    /**
     * El monto total de ganancias en el periodo financiero.
     */
    private double totalGanancias;
    
    /**
     * Lista de otros estados financieros relacionados.
     */
    private List<EstadoFinanciero> estadosFinancieros;

    /**
     * Constructor para la clase EstadoFinanciero.
     * 
     * @param fechaGeneracion La fecha de generación del estado financiero.
     * @param totalRecaudado El monto total recaudado en el periodo financiero.
     * @param totalGanancias El monto total de ganancias en el periodo financiero.
     */
    public EstadoFinanciero(Date fechaGeneracion, double totalRecaudado, double totalGanancias) {
        this.fechaGeneracion = fechaGeneracion;
        this.totalRecaudado = totalRecaudado;
        this.totalGanancias = totalGanancias;
    }

    /**
     * Obtiene la fecha de generación del estado financiero.
     * 
     * @return La fecha de generación del estado financiero.
     */
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Establece la fecha de generación del estado financiero.
     * 
     * @param fechaGeneracion La nueva fecha de generación del estado financiero.
     */
    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    /**
     * Obtiene el monto total recaudado en el periodo financiero.
     * 
     * @return El monto total recaudado.
     */
    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    /**
     * Establece el monto total recaudado en el periodo financiero.
     * 
     * @param totalRecaudado El nuevo monto total recaudado.
     */
    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    /**
     * Obtiene el monto total de ganancias en el periodo financiero.
     * 
     * @return El monto total de ganancias.
     */
    public double getTotalGanancias() {
        return totalGanancias;
    }

    /**
     * Establece el monto total de ganancias en el periodo financiero.
     * 
     * @param totalGanancias El nuevo monto total de ganancias.
     */
    public void setTotalGanancias(double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }
   
}
