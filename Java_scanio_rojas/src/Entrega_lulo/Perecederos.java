package Entrega_lulo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Perecederos extends Producto{
    private LocalDate vencimiento;
    private int dias;

    public Perecederos(){
        super();
        this.vencimiento=LocalDate.now();
        this.dias=5;
    }

    public Perecederos(int codigo, String nombre, String marca, Empresa empresa, LocalDate embasado, int precio, LocalDate vencimiento, int dias) {
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public void mostrar(){
        if(vencimiento.isBefore(LocalDate.now()))
        System.out.println("Nombre :" + getNombre());
        System.out.println("Marca: "+ getMarca());
    }

    public long cuantos_dias_faltan(){

      long dias= ChronoUnit.DAYS.between(LocalDate.now(), vencimiento);
      if(dias<0){
          return -1;
      }
      return dias;
    }
}
