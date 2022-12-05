
import java.time.LocalDate;
import java.util.Date;
import pagame.domain.Abono;
/**
 *
 * @author Luis Najera
 */
public class AbonoTest {
    public static void main(String[] args){
        Abono abono = new Abono(1, -300,LocalDate.of(2022,10,11),1,1);
        Date hoy = new Date();
        System.out.println("Abono       id: " + abono.getId());
        System.out.println("Abono cantidad :" + abono.getCantidad());
        System.out.println("Abono fecha :" + abono.getFechas());
        System.out.println("Abono iddeudor :" + abono.getIdDeudor());
        System.out.println("Abono idcobrador :" + abono.getIdcobrador());
        // Mostrar la fecha y la hora usando toString ()
        System.out.println(hoy.toString());
    }
}
