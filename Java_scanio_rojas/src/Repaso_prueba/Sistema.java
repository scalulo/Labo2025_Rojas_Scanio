package Repaso_prueba;

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

}
