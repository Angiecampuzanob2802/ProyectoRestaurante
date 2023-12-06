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
   this.nombre=nombre;
   this.direccion=direccion;
   this.telefono=telefono;
   this.menu = new Menu();
   this.ventas = new ArrayList<>();
   
  }
   ///// metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
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
        estadoFinanciero.add(estadoFinanciero);

     
        System.out.println("Estado financiero generado: " + estadoFinanciero);
    }

       
}



