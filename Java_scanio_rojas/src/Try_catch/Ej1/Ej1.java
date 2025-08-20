package Try_catch.Ej1;

public class Ej1 {

   public static int largoclase(String p) throws PalabraNula{
       if (p.length()==0){
            throw new PalabraNula("la palabra no tiene nada (con clase)  ");
       }
       else {
           return p.length();
       }
   }

    public static int largothrows (String p) throws Exception {
        return  p.length();
    }

    public static int largo (String p) {
        return  p.length();
    }

        public static void main(String[] args) {
            String nombre = "null";
            System.out.println("El largo del nombre es:" + nombre.length());

            try {
                String nombre2=null;
                System.out.println(nombre2.length());
            }catch (NullPointerException exc){
                System.err.println("nombre nulo (try)");
            }

            //throws
            try {
                String nombre3=null;
                largothrows(nombre3);
            }catch (Exception e){
                System.err.println("nombre nulo (throws)  " +e);
            }

            //throw
            try {
                String nombre4="";
                if(largo(nombre4)==0){
                    throw new IllegalArgumentException("tu palabra no tiene nada");
                }
                largo(nombre4);
            }catch (IllegalArgumentException e){
                System.err.println(e);
            }

            //con clase
            try{
                String nombre5="";
                largoclase(nombre5);
            }catch (PalabraNula e){
                e.printStackTrace();
                e.getMessage();
            }


        }
    }

