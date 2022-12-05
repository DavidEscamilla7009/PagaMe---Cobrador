
import pagame.domain.Deudor;
import pagame.domain.Cobrador;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class CobradorTest {
            public static void main(String[] args){
        Cobrador  cobrador = new Cobrador (1,"juan");      
        Deudor deudor1 = new Deudor(1,"juan ","calle 123",-6000.1f);
        Deudor deudor2 = new Deudor(1,"maria ","calle 3");
        
        cobrador.addDeudor(deudor1);
        
        }
      public static void print(Deudor deudor){
        System.out.println("Deudor       id: " + deudor.getId());
        System.out.println("Deudor       nombre: " + deudor.getNombre());
        System.out.println("Deudor       dierccion : " + deudor.getDireccion());
        System.out.println("Deudor       saldo: " + deudor.getSaldo());
    
    }
}
