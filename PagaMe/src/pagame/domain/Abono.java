/*
PagaMe proyecto desarrollado por TI-701 itess (2019-2023)
Visite el sitio https://www.pagame.com.mx
 */
package pagame.domain;
import static java.time.temporal.TemporalQueries.localDate;
import java.time.LocalDate;


/**
 *
 * @author Luis Najera
 */
public class Abono {
    private int id;
    private float cantidad;   
    private LocalDate fechas;
    private int idDeudor; 
    private int idcobrador;
    
    //Date hoy = new Date();

    public Abono(int id, float cantidad, LocalDate fechas, int idDeudor, int idcobrador) {
        this.id = id;
        this.cantidad = cantidad;
        this.fechas = fechas;
        this.idDeudor = idDeudor;
        this.idcobrador = idcobrador;
    }

    public int getId() {
        return id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public LocalDate getFechas() {
        return fechas;
    }

    public int getIdDeudor() {
        return idDeudor;
    }

    public int getIdcobrador() {
        return idcobrador;
    }
    

    

    
    
}
