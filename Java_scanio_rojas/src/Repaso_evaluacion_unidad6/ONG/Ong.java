package Repaso_evaluacion_unidad6.ONG;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Ong {
    private HashSet<Rol_sueldo> empleados;

    public Ong(HashSet<Rol_sueldo> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Rol_sueldo> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Rol_sueldo> empleados) {
        this.empleados = empleados;
    }

    public void sueldo_banco(){
        HashMap<Banco, Integer> contador = new HashMap<>();

        for (Rol_sueldo emp : empleados) {
            contador.put(emp.getBanco(),contador.getOrDefault(emp.getBanco(), 0) + 1);
            }
        for (HashMap.Entry<Banco, Integer> entry : contador.entrySet()) {
            System.out.println("El banco: " + entry.getKey().name() + " tiene " + entry.getValue() + " trabajadores");
        }
        }


    public static void main(String[] args) {
        HashSet<Rol_sueldo> empleados = new HashSet<>();

        // Creo algunos administradores de ejemplo
        Administrador admin1 = new Administrador(
                "Juan", 35, "Av. Siempre Viva 123", "Pérez", 1405,
                true, 200000, 10, Banco.MACRO, LocalDate.of(2022, 3, 15),
                null, "juan123", "Pass@123"
        );

        Administrador admin2 = new Administrador(
                "Ana", 29, "Calle Falsa 456", "Gómez", 1001,
                false, 180000, 25, Banco.SANTANDER, LocalDate.of(2023, 6, 10),
                null, "ana_g", "ClaveSegura!"
        );

        Administrador admin3 = new Administrador(
                "Luis", 40, "Mitre 789", "Rodríguez", 1150,
                true, 220000, 5, Banco.MACRO, LocalDate.of(2021, 11, 20),
                null, "luisr", "Admin#2024"
        );

        Administrador admin4 = new Administrador(
                "María", 31, "San Martín 1010", "López", 1900,
                true, 210000, 15, Banco.BBVA, LocalDate.of(2024, 2, 5),
                null, "mariaL", "M@riaSecure"
        );

        // Agrego los administradores al set de empleados
        empleados.add(admin1);
        empleados.add(admin2);
        empleados.add(admin3);
        empleados.add(admin4);

        // Creo la ONG con los empleados
        Ong ong = new Ong(empleados);

        // Ejecuto el método para ver la distribución de bancos
        ong.sueldo_banco();
    }
    }

