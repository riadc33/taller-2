
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
public class CuentaCheques extends Cuenta implements MovimientosCuenta{
    private double costoTransaccion;

    public double getCostoTransaccion() {
        return costoTransaccion;
    }

    public void setCostoTransaccion(double costoTransaccion) {
        this.costoTransaccion = costoTransaccion;
    }
    
    public CuentaCheques(double saldoInicial,double costoTransaccion) {
        super(saldoInicial);
        setCostoTransaccion(costoTransaccion);
    }

    @Override
    public void depositar(double montoDepositar) {
        
        setSaldoCheque(getSaldoCheque()+montoDepositar);
        setSaldoCheque(getSaldoCheque()-getCostoTransaccion());
    }

    @Override
    public void retirar(double montoRetirar) {
       if(getSaldoCheque()<=montoRetirar+getCostoTransaccion()){
           JOptionPane.showMessageDialog(null,  "El monto a retirar excedió el saldo de la cuenta");
       }else{
           setSaldoCheque(getSaldoCheque()-montoRetirar);
           setSaldoCheque(getSaldoCheque()-getCostoTransaccion());
       }
    }
    
}
