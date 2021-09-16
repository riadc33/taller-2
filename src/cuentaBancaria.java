
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
public class cuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char activate;
       CuentaAhorros cuentaAhorros = new CuentaAhorros(0,0.08);
       CuentaCheques cuentaCheques = new CuentaCheques(0,8000);
        do{

           
         activate=JOptionPane.showInputDialog( "Elija una opción"+"\n"
                                      +"1. Depositar en cuenta de ahorros"+ 
                                      "\n2. Retirar de cuenta de ahorros\n" +
                                       "3. Interés a la fecha\n"
                                      +"4. Depositar en cuenta de cheques\n" +
                                       "5. Retirar de cuenta de cheques\n"+
                                       "6. Salir\n\n").charAt(0);
         
         
        switch(activate){
            case '1':
                double depositar = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a depositar:"));
                cuentaAhorros.depositar(depositar);
                JOptionPane.showMessageDialog(null,  "Depositaste "+depositar+" tu nuevo saldo es: "+cuentaAhorros.getSaldo());
                 
                break;
                
           case '2':
                double retirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a retirar:"));
                cuentaAhorros.retirar(retirar);
                if(cuentaAhorros.getSaldo()<retirar){
                    
                }else{
                JOptionPane.showMessageDialog(null,  "Retiraste "+retirar+" tu nuevo saldo es: "+cuentaAhorros.getSaldo());
                }
               break;
               
           case '3':
               if(cuentaAhorros.getSaldo()==0){
                   JOptionPane.showMessageDialog(null, "no hay intereses acumulados porque a la fecha porque su saldo es 0");
                    break;
               }
                JOptionPane.showMessageDialog(null,  "el interes acumulado hasta la fecha es: "+cuentaAhorros.calcularInteres());
                
               break;
               
          case '4':
              double depositarCheque = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a depositar en la cuenta de  cheques:"));
                cuentaCheques.depositar(depositarCheque);
                JOptionPane.showMessageDialog(null,  "Depositaste en la cuenta de cheques "+depositarCheque+" se te cobro por la operacion "+cuentaCheques.getCostoTransaccion()+" tu nuevo saldo es: "+cuentaCheques.getSaldoCheque());
             
              break;
              
         case '5':
             double retirarCheque = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a retirar en la cuenta de cheques:"));
                cuentaCheques.retirar(retirarCheque);
                if(cuentaCheques.getSaldoCheque()<retirarCheque){
                   
                }else{
                JOptionPane.showMessageDialog(null,  "Retiraste de la cuenta de cheques "+retirarCheque+" se te cobro por la operacion "+cuentaCheques.getCostoTransaccion()+" tu nuevo saldo es: "+cuentaCheques.getSaldoCheque());
                }
             
        
        case '6':
             break;
        }
       }while(activate!='6');
         
       } // TODO code application logic here
    }
    

