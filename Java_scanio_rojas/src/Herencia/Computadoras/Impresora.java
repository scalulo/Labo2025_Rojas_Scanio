package Herencia.Computadoras;

public class Impresora extends Dispositivo_salida{
    private boolean inyeccion_sino_laser;

    public Impresora(String nombre,int puertos, int precio,int stock ,boolean inyeccion_sino_laser) {
        super(nombre,puertos, precio, stock);
        this.inyeccion_sino_laser = inyeccion_sino_laser;
    }

    public boolean isInyeccion_sino_laser() {
        return inyeccion_sino_laser;
    }

    public void setInyeccion_sino_laser(boolean inyeccion_sino_laser) {
        this.inyeccion_sino_laser = inyeccion_sino_laser;
    }
}
