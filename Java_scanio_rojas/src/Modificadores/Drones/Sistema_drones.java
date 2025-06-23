package Modificadores.Drones;

import javax.swing.text.ViewFactory;
import java.time.LocalDate;

public class Sistema_drones {


    public static void main(String[] args) {
        Vigilancia dron_v=new Vigilancia("DIJ", LocalDate.of(2024,2,4),100,3,Estado.EN_OPERATIVA,168);
        dron_v.chequear_mision(-35.603738,-58.381570);

        Carga dron= new Carga("DJI", LocalDate.of(2024,2,4),40,1,Estado.EN_OPERATIVA,100);
        dron.chequear_mision(-84.603738,-58.381570);
    }

}