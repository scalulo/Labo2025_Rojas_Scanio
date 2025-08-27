package Repaso_evaluacion_unidad6.ONG;

public class Voluntario_miembro extends Integrante_ong {
    private int puntaje;

    public Voluntario_miembro(String nombre, int edad, String direccion, String apellido, int codigo_postal, boolean contribuir, int puntaje) {
        super(nombre, edad, direccion, apellido, codigo_postal, contribuir);
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
