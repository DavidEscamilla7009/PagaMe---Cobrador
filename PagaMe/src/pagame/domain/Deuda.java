/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagame.domain;

import java.util.Date;
import java.time.LocalDate;

/*
 *
 * @author Luis Najera
 */
public class Deuda {
    private int id;
    private float Monto; 
    private LocalDate fechas;
    private int idDeudor;

    public Deuda(int id, float Monto, LocalDate fechas, int idDeudor) {
        this.id = id;
        this.Monto = Monto;
        this.fechas = fechas;
        this.idDeudor = idDeudor;
    }

    public int getId() {
        return id;
    }

    public float getMonto() {
        return Monto;
    }

    public LocalDate getFechas() {
        return fechas;
    }

    public int getIdDeudor() {
        return idDeudor;
    }

    
    
    

    
    
    
    
}
