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
    public String nombre;
    private double precioVenta;
    double costoDeFabricacion;
    public String descripcion;
    
    /// constructor

    /**
     *
     * @param id
     * @param nombre
     * @param costoDeFabricacion
     * @param descripcion
     */
     public Plato(int id,String nombre,double costoDeFabricacion,String descripcion){
       this.id=id;
       this.nombre=nombre;
       this.precioVenta=calcularPrecioVenta();
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

     
    
     public abstract double calcularGanancia();
    
    public double calcularPrecioVenta() {
        double ganancia = calcularGanancia();
        double precioSinIVA = costoDeFabricacion + ganancia;
        return precioSinIVA * 1.19; 
    }
}    
