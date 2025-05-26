package Repaso_prueba.Ej1;

import java.util.ArrayList;

public class Video_Club {
    private String direccion;
    private int codigo_postal;
    private int comuna;
    private int cant_estanterias;
    private ArrayList<Estanteria> estanterias;

    public Video_Club(){
        this.direccion="albarellos 2324";
        this.codigo_postal=1419;
        this.cant_estanterias=20;
        this.estanterias=new ArrayList<Estanteria>();
        this.comuna=12;


    }

    public Video_Club(String direccion, int codigo_postal, int cant_estanterias, int comuna, int total){
        this.direccion=direccion;
        this.codigo_postal=codigo_postal;
        this.cant_estanterias=cant_estanterias;
        this.estanterias=new ArrayList<Estanteria>();
        this.comuna=comuna;


    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public int getCant_estanteriascant_estanterias() {
        return cant_estanterias;
    }

    public void setCant_estanterias(int estanterias) {
        this.cant_estanterias = estanterias;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }



    public void agregarEstanteria(Estanteria estanteria){
        estanterias.add(estanteria);
    }
    public String mayorDuracion(){
        Pelicula pelicula=estanterias.getFirst().getPeliculas().getFirst();
        Estanteria estanteria=estanterias.getFirst();
        for (int i=0; i<estanterias.size();i++){
            for(int k=0;k< estanterias.get(i).getPeliculas().size();k++){
                if(estanterias.get(i).getPeliculas().get(k).getDuracion()>pelicula.getDuracion()){
                    pelicula=estanterias.get(i).getPeliculas().get(k);
                    estanteria=estanterias.get(i);
                }
            }
        }
        System.out.println("estanteria de la peli con mas duracion: "+estanteria.getCodigo()) ;
        return pelicula.getNombre();
    }

    public void menor_90(){
        ArrayList<Pelicula> peliculas_menores_a_90=new ArrayList<>();
        System.out.println("pelicula/s menores a 90´: ");
        for (Estanteria e: getEstanterias()){
            for (Pelicula p: e.getPeliculas()){
                if (p.getDuracion()<90){
                    peliculas_menores_a_90.add(p);
                    System.out.println(p.getNombre());

                }
            }
        }

    }
    public int pelis_total() {
        int total = 0;

        for (Estanteria e : getEstanterias()) {

                total+=e.getPeliculas().size();



            }
        return total;
        }







    public static void main(String[] args) {
        Sistema s1= new Sistema();
        Video_Club v1= new Video_Club();
        s1.getVideoclubs().add(v1);
        Video_Club v2=new Video_Club("nazca 2432",2321,11,4,2);
        s1.getVideoclubs().add(v2);
        Pelicula p1= new Pelicula();
        Estanteria e1= new Estanteria();
        Pelicula p2= new Pelicula("Terminator", "Ciencia-Ficcion", 120, 10);

        e1.agregarPelicula(p1);
        e1.agregarPelicula(p2);
        v1.agregarEstanteria(e1);
        System.out.println("pelicula con mayor duracion: "+v1.mayorDuracion());
        System.out.println("Actores mayores de edad:");
        p1.mostrarNombre(p1.mayoresEdad());
        System.out.println("Directores en mas de una peli:");
        e1.mostrarNombre(e1.directores_mas_d_una_peli());
        s1.comunal();
        v1.menor_90();
        v1.pelis_total();
        v2.pelis_total();
        s1.comparar();
        s1.total_segun_genero("Ciencia-Ficcion");

    }
}
