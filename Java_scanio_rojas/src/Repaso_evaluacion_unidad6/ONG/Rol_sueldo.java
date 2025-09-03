package Repaso_evaluacion_unidad6.ONG;

import java.time.LocalDate;
import java.time.Year;

public abstract class Rol_sueldo extends Integrante_ong{
    private int sueldo;
    private int dia_cobro;
    private Banco banco;
    private LocalDate fecha_de_alta_en_empresa;


    public Rol_sueldo(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int sueldo, int dia_cobro, Banco banco, LocalDate fecha_de_alta_en_empresa) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir);
        this.sueldo = sueldo;
        this.dia_cobro = dia_cobro;
        this.banco = banco;
        this.fecha_de_alta_en_empresa = fecha_de_alta_en_empresa;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDia_cobro() {
        return dia_cobro;
    }

    public void setDia_cobro(int dia_cobro) {
        this.dia_cobro = dia_cobro;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public LocalDate getFecha_de_alta_en_empresa() {
        return fecha_de_alta_en_empresa;
    }

    public void setFecha_de_alta_en_empresa(LocalDate fecha_de_alta_en_empresa) {
        this.fecha_de_alta_en_empresa = fecha_de_alta_en_empresa;
    }

    public String mayor_2_años(){
        if (LocalDate.now().minusYears(2).isBefore(fecha_de_alta_en_empresa) ){
            return getNombre();
        }
        return "el empleado esta hace menos d dos años";
    }
}
