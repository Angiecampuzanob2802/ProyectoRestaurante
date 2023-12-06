/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.models;

import java.util.ArrayList;

/**
 *
 * @author dioge
 */
public class Menu {
    ////atributos
    private String nombreRepresentativo;
    private int anoCreacion;
    private ArrayList<Plato>platos;
    
    ////constructor
    public Menu(String nombreRepresentativo,int anoCreacion){
       this.nombreRepresentativo=nombreRepresentativo;
       this.anoCreacion=anoCreacion;
       this.platos = new ArrayList<>();
    
    }

    Menu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNombreRepresentativo() {
        return nombreRepresentativo;
    }

    public void setNombreRepresentativo(String nombreRepresentativo) {
        this.nombreRepresentativo = nombreRepresentativo;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    
    
       
///// CRUD de platos
    public boolean agregarPlato(Plato plato){
       return this.platos.add(plato);
    }
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
