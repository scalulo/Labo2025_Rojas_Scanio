package Repaso_Unidad7_8.EJ1.Interfaces;

import Repaso_Unidad7_8.EJ1.Expeciones.ErrorCocina;
import Repaso_Unidad7_8.EJ1.Expeciones.ErrorServir;
import Repaso_Unidad7_8.EJ1.Principal;

public interface PlatoPrincipal {
    void cocinar(Principal p) throws ErrorCocina;
    void servir(Principal p) throws ErrorServir;

}
