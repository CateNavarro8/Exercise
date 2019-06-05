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
public class CuentaCorriente extends Cuenta
{

    public CuentaCorriente(int tipo, long numeroCuenta, String titular, long descubiertoAcordado) {
        super(tipo, numeroCuenta, titular);
        this.descubiertoAcordado = descubiertoAcordado;
    }
    
    //No uso throws runtimeException porque 
    @Override
    public void extraer(long monto) throws Exception
    {
        if (monto+descubiertoAcordado>saldo)
        {
            throw new Exception("Saldo insuficiente.");
        }
        else
        {
            saldo-=monto;
        }
        
    }
}
