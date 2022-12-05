/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagame.domain;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Cobrador {
   private int id;
   private String  nombre;   
   private List<Deudor> deudorLista;  
    
    public Cobrador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;    
        Deudoreslista = new ArrayList<Deudor>();
        
    }
    
}
