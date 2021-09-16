
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riadcure
 */
public class CuentaAhorros extends Cuenta implements MovimientosCuenta{
    
    private double porcentaje;

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    public CuentaAhorros(double saldoInicial,double porcentaje) {
        super(saldoInicial);
        setPorcentaje(porcentaje);
    }

    public double calcularInteres(){
        double interFin=getPorcentaje()*getSaldo();
        return interFin;
    }
    
    @Override
    public void depositar(double montoDepositar) {
        setSaldo(getSaldo()+montoDepositar);
    }

    @Override
    public void retirar(double montoRetirar) {
        if(montoRetirar>=getSaldo()){
            JOptionPane.showMessageDialog(null,  "El monto a retirar excedió el saldo de la cuenta");
        }else{
            setSaldo(getSaldo()-montoRetirar);
        }
       
    }
    
}
