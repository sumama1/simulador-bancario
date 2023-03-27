/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorbancario.pkg1;

/**
 *
 * @author sg701-02
 */
public class Simuladorbancario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        informacion juan = new informacion();
        juan.informacion();
        ahorros carlos = new ahorros();
        carlos.Consignacion();
        carlos.calcularIntereses();
      carlos.Retiro();
        cdt jonathan = new cdt();
        jonathan.liquidacioncdt();
    }
    
}
