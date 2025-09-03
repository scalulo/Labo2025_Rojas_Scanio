package Repaso_evaluacion_unidad6.ONG;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Profesor extends Rol_sueldo{
    private HashMap<String, Integer> materias_horas;
    private static HashSet<String> barrios=new HashSet<>();




    public Profesor(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int sueldo, int dia_cobro, Banco banco, LocalDate fecha_de_alta_en_empresa, HashMap<String, Integer> materias_horas) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir, sueldo, dia_cobro, banco, fecha_de_alta_en_empresa);
        this.materias_horas = materias_horas;
    }

    public Profesor(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int sueldo, int dia_cobro, Banco banco, LocalDate fecha_de_alta_en_empresa) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir, sueldo, dia_cobro, banco, fecha_de_alta_en_empresa);
    }

    public HashMap<String, Integer> getMaterias_horas() {
        return materias_horas;
    }

    public void setMaterias_horas(HashMap<String, Integer> materias_horas) {
        this.materias_horas = materias_horas;
    }

    @Override
    void accion_solidaria() {

    }
}
