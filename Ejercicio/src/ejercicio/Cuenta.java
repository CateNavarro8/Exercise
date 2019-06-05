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
public abstract class Cuenta 
{
    protected int tipo;
    protected long numeroCuenta;
    protected String titular;
    protected long saldo;
    protected long descubiertoAcordado;
    
    public Cuenta (int tipo, long numeroCuenta, String titular)
    {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        
        this.saldo = 0;
 
    }
    
    public void depositar(long monto)
    {
        saldo+=monto;
    }
    
    //metodo que deben implementar las clases que hereden
    public abstract void extraer(long monto) throws Exception;
            
}
