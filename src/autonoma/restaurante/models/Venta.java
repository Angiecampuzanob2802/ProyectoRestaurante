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
public class Venta {
    ////atributos
    private int codigo;
    private Date fecha;
    
    ////constructor
    
   public Venta(int codigo,Date fecha){
      this.codigo=codigo;
      this.fecha=fecha;
   
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
