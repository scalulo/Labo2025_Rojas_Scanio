package Hashs.Vacunatorio;

import java.time.LocalDate;

public class Vacuna {

    private LocalDate fabricacion;
    private LocalDate aplicacion;
    private int lote;
    private int num_fabricacion;
    private String nombre;

    public Vacuna(LocalDate fabricacion, LocalDate aplicacion, int lote, int num_fabricacion, String nombre) {
        this.fabricacion = fabricacion;
        this.aplicacion = aplicacion;
        this.lote = lote;
        this.num_fabricacion = num_fabricacion;
        this.nombre = nombre;
    }
    public Vacuna(){
        this.fabricacion = LocalDate.of(2025,2,15);
        this.aplicacion = LocalDate.now();
        this.lote = 3;
        this.num_fabricacion = 5;
        this.nombre = "Farenheit";
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }

    public LocalDate getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(LocalDate aplicacion) {
        this.aplicacion = aplicacion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNum_fabricacion() {
        return num_fabricacion;
    }

    public void setNum_fabricacion(int num_fabricacion) {
        this.num_fabricacion = num_fabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

