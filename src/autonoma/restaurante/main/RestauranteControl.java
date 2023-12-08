/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.main;
import autonoma.restaurante.models.Menu;
import autonoma.restaurante.models.PlatoInternacional;
import autonoma.restaurante.models.PlatoNacional;
import autonoma.restaurante.models.Restaurante;
import autonoma.restaurante.models.Venta;
import autonoma.restaurante.views.VentanaPrincipal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 
 */
public class RestauranteControl {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("El buen sabor", "Calle 8 #11-73", "8879200");

 
        VentanaPrincipal ventana =  new VentanaPrincipal();
        ventana.setVisible(true);
    }
}