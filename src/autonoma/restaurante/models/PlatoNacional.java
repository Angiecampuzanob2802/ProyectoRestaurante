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
public class PlatoNacional extends Plato {
    public PlatoNacional(int id, String nombre, double costoDeFabricacion, String descripcion){
        super(id, nombre, costoDeFabricacion, descripcion);
    }

    @Override
    public double calcularGanancia() {
        return getCostoDeFabricacion() * 0.25;
    }
}