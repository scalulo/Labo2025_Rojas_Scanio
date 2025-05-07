package Repaso_prueba.Ej1;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Video_Club> videoclubs;

    public Sistema(){
         this.videoclubs=new ArrayList<>();

    }

    public ArrayList<Video_Club> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Video_Club> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public ArrayList<String> comunal(){
        ArrayList<String> direcciones= new ArrayList<>();
        for(int i=0;i<videoclubs.size();i++){
            if (videoclubs.get(i).getComuna()==12) {
                direcciones.add(videoclubs.get(i).getDireccion());
            }

        }
        mostrar(direcciones);
        return direcciones;
    }


public void mostrar(ArrayList<String> direcciones){
        for(int i=0;i<direcciones.size();i++){
            System.out.println("Direcciones: "+direcciones.get(i));
        }
}


public void comparar(){
    int aux=0;
    String dire="";
    for(Video_Club v : videoclubs){
        if(v.pelis_total()>=aux){
            aux= v.pelis_total();
            dire=v.getDireccion();

        }
    }
        System.out.println("Direccion del videoclub con mas pelis: "+dire);
        System.out.println("Total de pelis: "+aux);
}

    public void total_segun_genero(String genero){
            for(Video_Club v: videoclubs){
                int total=0;
                for (Estanteria e: v.getEstanterias()){
                    for (Pelicula p : e.getPeliculas()){
                        if (p.getGenero().equals(genero)){
                            total++;
                        }
                    }
                }
                System.out.println("Videoclub en: " + v.getDireccion() + " → Total de películas del género '" + genero + "': " + total);
            }
            return;
    }
}
