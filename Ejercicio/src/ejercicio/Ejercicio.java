/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import static java.time.Clock.system;

/**
 *
 * @author CNAVARRO
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        Cuenta cuentaDeCamila = new CuentaCorriente(0,45,"maria",22);
        System.out.println(cuentaDeCamila.saldo);
        cuentaDeCamila.depositar(5);
        cuentaDeCamila.depositar(10000);
        System.out.println(cuentaDeCamila.saldo);
        System.out.println(cuentaDeCamila.descubiertoAcordado);
        Cuenta cuentaDeMario = new CajaAhorro(1,10,"Mario");
        System.out.println(cuentaDeMario.descubiertoAcordado);
        cuentaDeCamila.extraer(50000);
        
    }
    
}
