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
    public PlatoNacional(int id, String nombre, double costoFabricacion, String descripcion){
        super(id, nombre, costoFabricacion, descripcion);
    }

    @Override
    public double calcularGanancia() {
        return getCostoFabricacion() * 0.25;
    }
}