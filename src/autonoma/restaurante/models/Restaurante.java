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
public class Restaurante {
  /////atributos
  private String nombre;
  private String direccion;
  private String telefono;
  private Menu menu;
  private List<Venta> ventas;
  
  ///// constructor
  public Restaurante(String nombre,String direccion, String telefono){
   this.nombre="El Buen Sabor";
   this.direccion="calle 8 n° 11-73" ;
   this.telefono="8879200";
   this.menu = new Menu("Sabor menu",2020);
   this.ventas = new ArrayList<>();
   
  } 
  ////////CRUD
  public boolean agregarPlato(Plato plato){
       return this.menu.agregarPlato(plato);
    }
    public Plato buscarPlato(Plato plato){
        return this.menu.buscarPlato(plato);

    }
     public Plato buscarPlato(int id){
       return this.menu.buscarPlato(id);
    }
    
   public Plato actualizarPlato(int id,Plato plato){
       return this.menu.actualizarPlato(id,plato);
    }
     
    public Plato eliminarPlato(int id){
              return this.menu.eliminarPlato(id);
      
    }
    ////////////////
    public String mostrarMenu(){
          return this.menu.mostrarMenu();
    }
    //////////////
    public void realizarVenta(Venta venta) {
        this.ventas.add(venta);
    }
   
    /////////////////
    public void generarEstadoFinanciero() {
        double totalRecaudado = 0;
        double totalGanancias = 0;
        

        for (Venta venta :ventas) {
            totalRecaudado += venta.getValorTotal();
            totalGanancias += venta.getValorGanancia();
        }

        EstadoFinanciero estadoFinanciero = new EstadoFinanciero(new Date(), totalRecaudado, totalGanancias);
        System.out.println("Estado financiero generado: " + estadoFinanciero);
    }   
}



