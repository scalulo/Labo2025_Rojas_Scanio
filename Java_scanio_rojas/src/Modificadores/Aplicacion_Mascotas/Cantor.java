package Modificadores.Aplicacion_Mascotas;

public class Cantor extends Pajaro{
    private String canto;

    public Cantor(){
    super();


    }
    public Cantor(String nombre, Dueño dueño, String canto, int felicidad){
        super(nombre,dueño,felicidad);
        this.canto=canto;
    }



    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }


    @Override
    void saludo(Dueño dueño) {
        if(dueño==getDueño()) {
            for (int i = 0; i < getFelicidad(); i++) {
                System.out.println(canto);

            }
        }

        else {
            for (int i = 0; i < getFelicidad(); i++) {
                System.out.println(canto.toUpperCase());
            }
        }

        if(getFelicidad()>1){
            setFelicidad(getFelicidad()-1);
        }
    }

    @Override
    void alimentar() {
        setFelicidad(getFelicidad()+1);
    }
}
