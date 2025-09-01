package Repaso_evaluacion_unidad6.ONG;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;
import org.junit.runner.manipulation.Alphanumeric;

import java.time.LocalDate;

public class Administrador extends Rol_sueldo{
    private Alphanumeric codigo;
    private String user;
    private String contra;

    public Administrador(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int sueldo, int dia_cobro, Banco banco, LocalDate fecha_de_alta_en_empresa, Alphanumeric codigo, String user, String contra) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir, sueldo, dia_cobro, banco, fecha_de_alta_en_empresa);
        this.codigo = codigo;
        this.user = user;





        this.contra = contra;
    }



    public Alphanumeric getCodigo() {
        return codigo;
    }

    public void setCodigo(Alphanumeric codigo) {
        this.codigo = codigo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }



}
