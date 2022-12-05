/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconsole;

import java.util.Scanner;
import pagame.domain.*;


public class PagaMe {
    
    Deudor deudor[] = new Deudor [100];
    int numDeudor=0 ;
    
    public static void main(String[] args ){
        PagaMe pagame = new PagaMe();
        int opcion = pagame.menuPrincipal();
        switch (opcion){
            case 1 :
                pageme.creaDeudor();
                break;
            case 2 :
                pageme.MostrarDeudor();
                break;
                
        }
        
        
        
    }
  public  PagaMe(){
    init();    
  }
  public int menuPrincipal(){
      
      System.out.println("------------------pagaMe------------------");
      
       System.out.println("1.crear deudor");
        System.out.println("2.vendedores");
         System.out.println("0.salir");
         
          System.out.println();
          System.out.println("seleccionar obsion");
          
          
          Scanner sc = new Scanner (System.in);
          String opcion = sc.nextLine();
          
          System.out.println("tu opcion es " + opcion );
          
          
          return Integer.parseInt(opcion);
  }
  
  public int creaDeudor(){
      
      
  }
  public int mostrarDeudror(){
      
      
  }
  
  public void init(){
      
  }
}
