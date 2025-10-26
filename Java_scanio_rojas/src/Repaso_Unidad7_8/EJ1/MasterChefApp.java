package Repaso_Unidad7_8.EJ1;

import Repaso_Unidad7_8.EJ1.Expeciones.ErrorCocina;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorServir;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {




                // Crear ingredientes
                HashMap<String, Integer> ingredientesPrincipal = new HashMap<>();
                ingredientesPrincipal.put("Carne", 2);
                ingredientesPrincipal.put("Papas", 3);

                HashMap<String, Integer> ingredientesEntrada = new HashMap<>();
                ingredientesEntrada.put("Lechuga", 1);
                ingredientesEntrada.put("Tomate", 2);

                // Crear platos
                Principal platoPrincipal = new Principal("Bife con papas", 40, ingredientesPrincipal);
                Entrada platoEntrada = new Entrada("Ensalada fresca", 10, ingredientesEntrada);

                // Crear participantes
                Expertos experto = new Expertos("Juan", "Pérez", LocalDate.of(1990, 5, 10), "Buenos Aires", Color.ROJO);
                Intermedio intermedio = new Intermedio("Ana", "García", LocalDate.of(1995, 3, 20), "Córdoba", Color.VERDE, ingredientesPrincipal);
                HashSet<String> prohibidos = new HashSet<>();
                prohibidos.add("Lechuga");
                Principiante principiante = new Principiante("Luis", "Martínez", LocalDate.of(2000, 12, 1), "Rosario", Color.AZUL, prohibidos);

                // Simulación
                System.out.println("=== Experto ===");
                experto.preparar_lugar();
                try {
                    experto.cocinar(platoPrincipal);
                    experto.servir(platoPrincipal);
                } catch (ErrorCocina | ErrorServir e) {
                    System.out.println("Error: " + e.getMessage());
                }



                System.out.println("\n=== Intermedio ===");
                intermedio.preparar_lugar();
                try {
                    intermedio.cocinar(platoPrincipal);
                    intermedio.servir(platoPrincipal);
                } catch (ErrorCocina | ErrorServir e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println("\n=== Principiante ===");
                principiante.preparar_lugar();
                try {
                    principiante.cocinar(platoEntrada);
                    principiante.servir(platoEntrada);
                } catch (ErrorCocina | ErrorServir e) {
                    System.out.println("Error: " + e.getMessage());
                }


            }
        }

