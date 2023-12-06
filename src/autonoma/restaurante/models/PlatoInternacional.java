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
public class PlatoInternacional extends Plato {
    private String paisOrigen;
    
    /**
     *
     * @param id
     * @param nombre
     * @param paisOrigen
     * @param descripcion
     * @param costoDeFabricacion
     */
    public PlatoInternacional(int id,String nombre,double costoDeFabricacion,String descripcion,String paisOrigen){
        super(id, nombre, costoDeFabricacion,descripcion);
        this.paisOrigen=paisOrigen;
    
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public double calcularGanancia() {
        return getCostoDeFabricacion() * 0.30;
    }
}
    
