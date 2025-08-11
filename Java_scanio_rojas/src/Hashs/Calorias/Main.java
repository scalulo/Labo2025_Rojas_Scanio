package Hashs.Calorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Crear platos
        Plato pizza = new Plato("Pizza", new HashSet<>(java.util.Arrays.asList("Harina", "Queso", "Tomate")), 800);
        Plato ensalada = new Plato("Ensalada", new HashSet<>(java.util.Arrays.asList("Lechuga", "Tomate", "Aceite")), 150);
        Plato hamburguesa = new Plato("Hamburguesa", new HashSet<>(java.util.Arrays.asList("Pan", "Carne", "Queso")), 600);

        // Crear personas con sus platos
        HashMap<Plato, Integer> platosJuan = new HashMap<>();
        platosJuan.put(pizza, pizza.getCalorias());
        platosJuan.put(hamburguesa, hamburguesa.getCalorias());

        HashMap<Plato, Integer> platosMaria = new HashMap<>();
        platosMaria.put(ensalada, ensalada.getCalorias());
        platosMaria.put(pizza, pizza.getCalorias());

        Persona juan = new Persona("Juan", LocalDate.of(1990, 5, 15), platosJuan);
        Persona maria = new Persona("Maria", LocalDate.of(1995, 8, 20), platosMaria);

        // Crear familia
        HashSet<Persona> integrantes = new HashSet<>();
        integrantes.add(juan);
        integrantes.add(maria);

        Familia familiaPerez = new Familia("Perez", integrantes);

        // Probar métodos
        System.out.println("Promedio calorías familia: " + familiaPerez.promedio_calorias());
        System.out.println("Persona que más calorías consumió: " + familiaPerez.mas_gordo().getNombre());
        System.out.println("Persona que menos calorías consumió: " + familiaPerez.mas_flaco().getNombre());
    }
}
