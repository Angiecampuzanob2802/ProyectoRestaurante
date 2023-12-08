/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dioge
 */
public class Venta {
    ////atributos
    private static int codigoActual = 1;
    private int codigo;
    private double valorTotal;
    private double valorGanancia;
    private Date fecha;
    private List<Plato> platosVendidos;
    private ArrayList<Venta>ventas;
    
   ////constructor
    
   public Venta(double valorTotal, double valorGanancia, Date fecha, List<Plato> platosVendidos){
        this.codigo = codigoActual++;
        this.valorTotal = valorTotal;
        this.valorGanancia = valorGanancia;
        this.fecha = fecha;
        this.platosVendidos = platosVendidos;
   
    }

    public static int getCodigoActual() {
        return codigoActual;
    }

    public static void setCodigoActual(int codigoActual) {
        Venta.codigoActual = codigoActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    public void setValorGanancia(double valorGanancia) {
        this.valorGanancia = valorGanancia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Plato> getPlatosVendidos() {
        return platosVendidos;
    }

    public void setPlatosVendidos(List<Plato> platosVendidos) {
        this.platosVendidos = platosVendidos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    
   

    ///// CRUD de platos
    public boolean agregarVenta(Venta venta){
       return this.ventas.add(venta);
    }
    public Venta buscarVenta(Venta venta){
        for(int i=0;i<this.ventas.size();i++){
          Venta v= this.ventas.get(i);
          if(v.equals(venta)){
          return v;
          
            }
        }
      return null;
    }
     public Venta buscarVenta(int id){
        for(int i=0;i<this.ventas.size();i++){
          Venta v= this.ventas.get(i);
          if(v.getId()== id){
          return v;
          
          }
        }
      return null;
    }
    
     private int buscarIndiceVenta(int id){
     for(int i=0;i<this.ventas.size();i++){
          Venta v= this.ventas.get(i);
          if(v.getId()== id){
          return i;   
           }
        }
        return -1;
   }
   public Venta actualizarVenta(int id,Venta venta){
        int index = this.buscarIndiceVenta(id);
        if(index>=0){
            return this.ventas.set(index, venta);
        }else{
          return null;
        }
   } 
    public Venta eliminarVenta(int id){
        int index = this.buscarIndiceVenta(id);
        if(index>=0){
            return this.ventas.remove(index);
        }else{
          return null;
    
        }
    }
    
    public String mostrarVenta(){
         
        String menu="";
        for(int i=0;i<this.ventas.size();i++){
            Venta v= this.ventas.get(i);
            menu +=v.toString()+"\n";
         }
         return menu;
    
    }
      public int getId() {
        return 0;  
    }
}
