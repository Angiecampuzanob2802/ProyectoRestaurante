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
public class PlatoInternacional {
    
    private String paisOrigen;
    
    public PlatoInternacional(String paisOrigen){
        this.paisOrigen=paisOrigen;
    
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
}
