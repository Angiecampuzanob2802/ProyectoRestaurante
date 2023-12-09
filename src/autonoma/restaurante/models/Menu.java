/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

import java.util.ArrayList;

/**
 * Es un documento ofrecido en los restaurantes en el que se muestra a los clientes una secuencia o lista de posibles opciones disponibles para un cliente.
 * @author Angie Campuzano Betancur
 */
public class Menu {
    ////atributos
    /**
     * El nombre representativo del menú
    */
    private String nombreRepresentativo;
    /**
     * El año de creación del menú
     */
    private int anoCreacion;
    /**
     * Lista de platos disponibles en el menú
     */
    private ArrayList<Plato>platos;
    
    ////constructor
    /**
     * Constructor para la clase menú
     * @param nombreRepresentativo El nombre representativo del menú
     * @param anoCreacion El año de creación del menú
     */
    public Menu(String nombreRepresentativo,int anoCreacion){
       this.nombreRepresentativo="Sabor Menu";
       this.anoCreacion=2020;
       this.platos = new ArrayList<>();
    
    }       
///// CRUD de platos
    /**
     * Agregar un plato al menú
     * @param plato El plato a buscar en el menú
     * @return teue si el plato se encuentra,false de lo contrario.
     */
    public boolean agregarPlato(Plato plato){
       return this.platos.add(plato);
    }
    /**
     * Buscar un plato en el menú por objeto Plato
     * @param plato El plato a buscar en el menú
     * @return teue si el plato se encuentra,false de lo contrario.
     */
    public Plato buscarPlato(Plato plato){
        for(int i=0;i<this.platos.size();i++){
          Plato p= this.platos.get(i);
          if(p.equals(plato)){
          return p;
          
            }
        }
      return null;
    }
     public Plato buscarPlato(int id){
        for(int i=0;i<this.platos.size();i++){
          Plato p= this.platos.get(i);
          if(p.getId()== id){
          return p;
          
          }
        }
      return null;
    }
    
     private int buscarIndicePlato(int id){
     for(int i=0;i<this.platos.size();i++){
          Plato p= this.platos.get(i);
          if(p.getId()== id){
          return i;   
           }
        }
        return -1;
   }
   public Plato actualizarPlato(int id,Plato plato){
        int index = this.buscarIndicePlato(id);
        if(index>=0){
            return this.platos.set(index, plato);
        }else{
          return null;
        }
   } 
    public Plato eliminarPlato(int id){
        int index = this.buscarIndicePlato(id);
        if(index>=0){
            return this.platos.remove(index);
        }else{
          return null;
    
        }
    }
    
    public String mostrarMenu(){
         
        String menu="";
        for(int i=0;i<this.platos.size();i++){
            Plato p= this.platos.get(i);
            menu +=p.toString()+"\n";
         }
         return menu;
    
    }
}    
