package Repaso_Unidad7_8.EJ2.Interfaces;

import Repaso_Unidad7_8.EJ2.Prestamo;
import Repaso_Unidad7_8.EJ2.Publicacion;
import Repaso_Unidad7_8.EJ2.Usuario;

public interface Prestar {
     Prestamo prestar(Usuario user);
     int get_multa();
}
