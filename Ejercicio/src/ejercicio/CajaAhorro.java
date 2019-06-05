/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author CNAVARRO
 */
public class CajaAhorro extends Cuenta
{

    public CajaAhorro(int tipo, long numeroCuenta, String titular) {
        super(tipo, numeroCuenta, titular);
        this.descubiertoAcordado = 0;
    }

    @Override
    public void extraer(long monto) throws Exception 
    {
        if(monto>saldo)
        {
            throw new Exception("Saldo insuficiente.");
        }
        else
        {
            saldo-=monto;
        }
    }

}
