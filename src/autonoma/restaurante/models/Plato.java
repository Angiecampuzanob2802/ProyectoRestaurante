/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

/**
 *
 * @author dioge
 */
public class Plato {
    
    ///atributos 
    private int id;
    private String nombre;
    private double precioVenta;
    private double costoDeFabricacion;
    private String descripcion;
    
    /// constructor
     public Plato(int id,String nombre,double precioVenta,double costoDeFabricacion,String descripcion){
       this.id=id;
       this.nombre=nombre;
       this.precioVenta=precioVenta;
       this.costoDeFabricacion=costoDeFabricacion;
       this.descripcion=descripcion;
               
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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public void setCostoDeFabricacion(double costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
     
}
