package RepasoDesayunoPrueba;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.Normalizer;


public class CorrectorDesayuno {

    private static String normalizar(String s) {
        if (s == null) return "";
        return Normalizer.normalize(s, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .toLowerCase();
    }

    private static boolean contieneAlguno(String texto, String... patrones) {
        for (String p : patrones) {
            if (texto.contains(p.toLowerCase())) return true;
        }
        return false;
    }

    private static boolean contieneTodos(String texto, String... patrones) {
        for (String p : patrones) {
            if (!texto.contains(p.toLowerCase())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Capturamos salida del main del alumno
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        try {
            DesayunoApp.main(new String[]{});
        } catch (Throwable t) {
            System.out.flush();
            System.setOut(old);
            System.out.println("❌ Error al ejecutar DesayunoApp.main(): " +
                    t.getClass().getSimpleName() + " - " + t.getMessage());
            return;
        }

        System.out.flush();
        System.setOut(old);

        String salida = normalizar(baos.toString());

        System.out.println("=== Salida del alumno (normalizada) ===");
        System.out.println(salida + "\n");

        int puntos = 0;
        int total = 10;

        boolean recetaBizcochuelo = contieneAlguno(salida, "bizcochuelo arranca con");
        boolean recetaCookies = contieneAlguno(salida, "empeza partiendo el chocolate", "empeza partiendo");
        boolean recetaBrownie = contieneAlguno(salida, "derreti la manteca", "derreti la mantequilla");

        if (recetaBizcochuelo && recetaCookies && recetaBrownie) {
            System.out.println("✅ Conocer receta detectado para las tres preparaciones");
            puntos += 2;
        } else {
            System.out.println("❌ No se detectaron correctamente los mensajes de receta");
        }

        boolean stockOk = contieneAlguno(salida, "stock suficiente");
        boolean exStock = contieneAlguno(salida, "no hay stock suficiente");
        if (stockOk) {
            System.out.println("✅ Caso stock suficiente detectado");
            puntos++;
        } else {
            System.out.println("❌ No se detectó mensaje de stock suficiente");
        }

        if (exStock) {
            System.out.println("✅ Excepción por falta de stock detectada");
            puntos++;
        } else {
            System.out.println("❌ No se detectó excepción por falta de stock");
        }

        boolean descCookies = contieneAlguno(salida, "animate a probar las mejores cookies");
        boolean descBrownies = contieneAlguno(salida, "brownies bien humedos", "brownies bien húmedos");

        if (descCookies && descBrownies) {
            System.out.println("✅ Descripciones de venta detectadas");
            puntos++;
        } else {
            System.out.println("❌ Faltan descripciones de venta");
        }

        boolean ventaExitosa = contieneAlguno(salida, "venta cargada con exito", "venta cargada con éxito");
        boolean hayNumero = salida.matches(".*\\d+.*");

        if (hayNumero) {
            System.out.println("✅ Se detectó un valor numérico en la salida (cálculo de precio o monto)");
            puntos++;
        } else {
            System.out.println("❌ No se detectó ningún valor numérico en la salida (faltaría cálculo de precio)");
        }

        if (ventaExitosa) {
            System.out.println("✅ Venta cargada con éxito detectada");
            puntos++;
        } else {
            System.out.println("❌ No se detectó mensaje de venta cargada");
        }

        boolean prepOk = contieneAlguno(salida, "se ha agregado correctamente la preparacion");
        boolean exIngrediente = contieneAlguno(salida, "ingrediente con cantidades invalidas");

        if (prepOk) {
            System.out.println("✅ Nueva preparación agregada correctamente");
            puntos++;
        } else {
            System.out.println("❌ No se detectó mensaje de nueva preparación exitosa");
        }

        if (exIngrediente) {
            System.out.println("✅ Excepción por ingrediente inválido detectada");
            puntos++;
        } else {
            System.out.println("❌ No se detectó excepción por ingrediente inválido");
        }

        boolean reponer = contieneAlguno(salida, "el stock nuevo es de", "stock nuevo es");
        if (reponer) {
            System.out.println("✅ Reposición de producto detectada");
            puntos++;
        } else {
            System.out.println("❌ No se detectó reposición de producto");
        }


        boolean cantVendibles = contieneAlguno(salida, "la cantidad de productos que estan a la venta son",
                "la cantidad de productos que están a la venta son", "productos a la venta");
        if (cantVendibles) {
            System.out.println("✅ Conteo de productos vendibles detectado");
            puntos++;
        } else {
            System.out.println("❌ No se detectó conteo de productos vendibles");
        }


        System.out.println("\nPuntaje final Dulces Desayunos: " + puntos + "/" + total);
    }
}
