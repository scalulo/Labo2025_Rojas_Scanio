package Herencia.Computadoras;

import java.util.ArrayList;

class CPU   {
    private ArrayList<Componente> componentes;

    public CPU() {

        this.componentes = new ArrayList<Componente>();
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }
}
