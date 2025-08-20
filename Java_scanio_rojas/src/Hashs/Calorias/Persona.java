package Hashs.Calorias;

import Hashs.Pago_empleados.Proyecto;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private String nombre;
    private LocalDate f_nacimiento;
    private HashMap<Plato, Integer> platos;

    public Persona(String nombre, LocalDate f_nacimiento, HashMap<Plato, Integer> platos) {
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.platos = platos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(LocalDate f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public HashMap<Plato, Integer> getPlatos() {
        return platos;
    }

    public void setPlatos(HashMap<Plato, Integer> platos) {
        this.platos = platos;
    }

    public int calorias_totales() {
        int t_calorias = 0;
        for (HashMap.Entry<Plato, Integer> entry : platos.entrySet()) {
            Plato plato = entry.getKey();
            int cantidad = entry.getValue();
            t_calorias += plato.getCalorias() * cantidad;
        }
        return t_calorias;
    }

}
