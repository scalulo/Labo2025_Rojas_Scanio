package Repaso_evaluacion_unidad6.ONG;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

public class Profesor_interno extends Rol_sueldo{
    private HashMap<String, Integer> materias_horas;
    private static Set<String> barrios=Set.of("Puerto Madero", "San Cristóbal", "Palermo", "Monte Castro", "Versalles", "Villa Santa Rita", "Colegiales");


    public Profesor_interno(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int sueldo, int dia_cobro, Banco banco, LocalDate fecha_de_alta_en_empresa, HashMap<String, Integer> materias_horas) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir, sueldo, dia_cobro, banco, fecha_de_alta_en_empresa);
        this.materias_horas = materias_horas;
    }

    public static Set<String> getBarrios() {
        return barrios;
    }

    public static void setBarrios(Set<String> barrios) {
        Profesor_interno.barrios = barrios;
    }

    public HashMap<String, Integer> getMaterias_horas() {
        return materias_horas;
    }

    public void setMaterias_horas(HashMap<String, Integer> materias_horas) {
        this.materias_horas = materias_horas;
    }

    @Override
    void accion_solidaria() {
        for (String m:materias_horas.keySet()){
            System.out.println(m);
        }
    }
}
