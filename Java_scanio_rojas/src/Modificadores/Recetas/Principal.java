package Modificadores.Recetas;

import java.util.ArrayList;

public class Principal extends Receta {
        private int comensales;
        private String coccion;

    public Principal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int comensales, String coccion) {
        super(nombre, dificultad, pasos);
        this.comensales = comensales;
        this.coccion = coccion;
    }

    public Principal() {
        super();
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getCoccion() {
        return coccion;
    }

    public void setCoccion(String coccion) {
        this.coccion = coccion;
    }

    @Override
    void mostrar_pasos() {
        System.out.println("Este plato tarda en cocinarse:" +coccion+ "y los pasos son:");
        for(int i=0;i<getPasos().size();i++){
            System.out.println("Paso numero"+i+":"+getPasos().get(i));
        }

        /*CON UN FOR EACH
        int n=1;
        for(String p:pasos){

            System.out.println("Paso numero"+n+":"+p);
            n++;

            }
         */

    }



    @Override
    public boolean sosPrincipal() {
        return true;
    }

    @Override
    boolean esDelTipo(Receta r) {
        return r.sosPrincipal();
    }
}
