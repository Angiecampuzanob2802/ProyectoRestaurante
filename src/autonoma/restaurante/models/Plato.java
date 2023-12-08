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
public abstract class Plato {
    
    ///atributos 
    private int id;
    private String nombre;
    private double precioVenta;
    private double costoFabricacion;
    private String descripcion;
    
    /// constructor

    /**
     *
     * @param id
     * @param nombre
     * @param costoFabricacion
     * @param descripcion
     */
     public Plato(int id,String nombre,double costoFabricacion,String descripcion){
       this.id=id;
       this.nombre=nombre;
       this.costoFabricacion=costoFabricacion;
       this.precioVenta=calcularPrecioVenta();
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

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     public abstract double calcularGanancia();
    
    public double calcularPrecioVenta() {
        double ganancia = calcularGanancia();
        double precioSinIVA = costoFabricacion  + ganancia;
        return precioSinIVA * 1.19; 
    }
}    
