    package arrays_principiante;

    import Unidad1.Cancion;

    import java.util.ArrayList;


    public class Cd {
       private ArrayList<Cancion> canciones;
        public Cd (){
            canciones= new ArrayList<>();
            canciones.add(new Cancion("duki", "nueva era") );
            canciones.add(new Cancion("lenny tavarez", "hola"));
            canciones.add(new Cancion("ciro y los persas", "antes y despues"));
            canciones.add(new Cancion("nose", "noches de pelicula"));

        }

        public ArrayList<Cancion> getCanciones() {
            return canciones;
        }

        public void setCanciones(ArrayList<Cancion> canciones) {
            this.canciones = canciones;
        }

        public int numeroCanciones(){
            return getCanciones().size();
        }

        public  Cancion nombreCancion(int pos){
        Cancion cancionelegida=getCanciones().get(pos);
        System.out.println(canciones.get(pos).getTitulo());
        return cancionelegida;
        }

        public void grabarCancion(int pos, Cancion nuevaCancion){
            canciones.set(pos, nuevaCancion);
         }

         public void añadirCancion(Cancion cancion){
            canciones.add(cancion);
         }

         public void eliminar(int pos){
            canciones.remove(pos);
         }
         public void mostrar(){
            for (Cancion cancion : canciones){
                System.out.println(cancion.getTitulo() + " de " +cancion.getAutor());
            }
         }

        public static void main(String[] args) {
            Cd Cd1= new Cd();
            System.out.println(Cd1.numeroCanciones());
            System.out.println(Cd1.nombreCancion(2));
            Cd1.grabarCancion(1,(new Cancion("david guetta", "memories")));
            Cd1.añadirCancion((new Cancion("david guetta", "I'm good")));
            Cd1.eliminar(4);
            Cd1.mostrar();
        }
    }
