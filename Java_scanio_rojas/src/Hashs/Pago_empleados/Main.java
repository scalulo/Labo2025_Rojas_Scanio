package Hashs.Pago_empleados;

import java.util.HashMap;

public class    Main {
    public static void main(String[] args) {
        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Rediseño de landing page");
        Proyecto proyecto2 = new Proyecto("App de reservas");
        Proyecto proyecto3 = new Proyecto("Dashboard administrativo");

        // Crear HashMap de proyectos con sus montos sin comisión
        HashMap<Proyecto, Double> proyectosLuciano = new HashMap<>();
        proyectosLuciano.put(proyecto1, 100000.0);
        proyectosLuciano.put(proyecto2, 80000.0);
        proyectosLuciano.put(proyecto3, 120000.0);

        // Crear diseñador
        Diseñador luciano = new Diseñador("Luciano", TipoDiseñador.UX, proyectosLuciano);

        // Mostrar sueldo total
        System.out.println("Sueldo total de " + luciano.getNombre() + ": $" + luciano.sueldo());
        System.out.println();

        // Mostrar cantidad de proyectos
        System.out.println("Cantidad de proyectos realizados: " + luciano.cant_proyectos());
        System.out.println();

        // Mostrar ganancia sin comisión de un proyecto específico
        System.out.println("Ganancia sin comisión del proyecto '" + proyecto2.getNombre() + "': $" + luciano.ganancia_sin_cometa(proyecto2));
        System.out.println();

        // Mostrar detalle completo del sueldo por proyecto
        luciano.detalles_proyecto();
    }
}
