package Repaso_Unidad7_8.EJ1.Interfaces;

import Repaso_Unidad7_8.EJ1.Entrada;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorCocina;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorServir;

public interface PlatoEntrada {
    void cocinar(Entrada p) throws ErrorCocina;
    void servir(Entrada p) throws ErrorServir;
}
