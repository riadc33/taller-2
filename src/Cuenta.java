
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
public abstract class Cuenta { 
     private  double saldo;
private  double saldoCheque;

    public double getSaldoCheque() {
        return saldoCheque;
    }

    public void setSaldoCheque(double saldoCheque) {
        this.saldoCheque = saldoCheque;
    }

    public double getSaldo() {
        return saldo;
    } 

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

public Cuenta(double saldoInicial){
if(saldoInicial<0){   
    JOptionPane.showMessageDialog(null,  "el saldo es inválido");
    setSaldo(0);
}else{
    setSaldo(saldoInicial);
}


}


}