package Repaso_Unidad7_8;

import java.time.LocalDate;

public class Expertos extends Participante implements Cocinar,Servir {
    private static int tiempo=80;
    private int tiempo_actual;

    public Expertos(String nombre, String apellido, LocalDate f, String l, Color c) {
        super(nombre,apellido,f,l,c);
        this.tiempo_actual = tiempo;
    }
    public Expertos(){
        super();
        this.tiempo_actual=tiempo;
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Expertos.tiempo = tiempo;
    }

    public int getTiempo_actual() {
        return tiempo_actual;
    }

    public void setTiempo_actual(int tiempo_actual) {
        this.tiempo_actual = tiempo_actual;
    }


    public boolean debo(Plato p){
        if(p.getCoccion()>tiempo_actual){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void preparar_lugar() {
        this.tiempo_actual=-5;
        System.out.println("Perdi 5 mins preparando la mesa por lo que mi tiempo restante es: "+tiempo_actual);
    }



    @Override
    public void Cocinar(Plato p) throws ErrorCocina {
        if(debo(p)==false){
            throw new ErrorCocina("El plato toma mucho tiempo");
        }

        else{
            System.out.println("Plato cocinado");

            this.tiempo_actual=-p.getCoccion();
        }
    }

    @Override
    public void servir(Plato p) throws ErrorServir {

            System.out.println("Plato servido");

    }
}
