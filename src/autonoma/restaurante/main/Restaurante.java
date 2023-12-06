/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.restaurante.main;

/**
 *
 * @author dioge
 */
public class Restaurante {

}
/**
 * import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Restaurante
        Restaurante restaurante = new Restaurante("El Buen Sabor", "Calle 8 n° 11-73", "8879200");

        // Crear platos
        Plato platoNacional = new PlatosNacionales(1, "Plato Nacional", 10.0);
        Plato platoInternacional = new PlatosInternacionales(2, "Plato Internacional", 15.0, "País");

        // Agregar platos al menú del restaurante
        restaurante.agregarPlato(platoNacional);
        restaurante.agregarPlato(platoInternacional);

        // Mostrar el menú del restaurante
        System.out.println("Menú del Restaurante:");
        System.out.println(restaurante.mostrarMenu());

        // Realizar una venta
        Venta venta = new Venta(1, new Date(), List.of(platoNacional, platoInternacional));
        restaurante.realizarVenta(venta);

        // Generar un estado financiero
        restaurante.generarEstadoFinanciero();
    }
}
 */