package Entrega_lulo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Perecedero extends Producto{
    private LocalDate vencimiento;
    private long dias;

    public Perecedero(){
        super();
        this.vencimiento=LocalDate.now();
        this.dias=5;
    }

    public Perecedero(int codigo, String nombre, String marca, Empresa empresa, LocalDate embasado, int precio, LocalDate vencimiento, long dias) {
        super(codigo, nombre, marca, empresa, embasado, precio);
        this.vencimiento = vencimiento;
        this.dias = dias;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public long getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public boolean estoy_vencido(){
        if(vencimiento.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }

    public long cuantos_dias_faltan(){

      long dias= ChronoUnit.DAYS.between(LocalDate.now(), vencimiento);
      if(dias<0){
          return -1;
      }
      return dias;
    }

    @Override
    public long dias_vencimientos() {

        long dias= ChronoUnit.DAYS.between(LocalDate.now(), vencimiento);
        if(dias<0){
            return -1;
        }
        return dias;
    }

    @Override
    public boolean tengo_envoltorio() {
        return false;
    }
    @Override
    public boolean todavia_consumible(){
        if(estoy_vencido()==true & dias_vencimientos()*(-1)<dias){
            System.out.println("Se puede consumir");
            return true;
        }
        else{
            System.out.println("No se puede consumir");
            return false;
        }
    }
}

