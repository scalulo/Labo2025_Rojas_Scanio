package Repaso_Unidad7_8.EJ2;

import Repaso_Unidad7_8.EJ2.Exepciones.Fuera_de_fecha;
import Unidad1.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona {
    private int numero_socio;
    private LocalDate f_nacimiento;
    private int credito_ganado;
    private String mail;
    private HashSet<Publicacion> pub_leidas;
    private HashMap<Publicacion, Integer> pub_prestamo;

    public Usuario(int numero_socio, LocalDate f_nacimiento, int credito_ganado, String mail, HashSet<Publicacion> pub_leidas, HashMap<Publicacion, Integer> pub_prestamo) {
        this.numero_socio = numero_socio;
        this.f_nacimiento = f_nacimiento;
        this.credito_ganado = credito_ganado;
        this.mail = mail;
        this.pub_leidas = pub_leidas;
        this.pub_prestamo = pub_prestamo;
    }

    public Usuario(String nombre, int edad, String direccion, String apellido, int numero_socio, LocalDate f_nacimiento, int credito_ganado, String mail, HashSet<Publicacion> pub_leidas, HashMap<Publicacion, Integer> pub_prestamo) {
        super(nombre, edad, direccion, apellido);
        this.numero_socio = numero_socio;
        this.f_nacimiento = f_nacimiento;
        this.credito_ganado = credito_ganado;
        this.mail = mail;
        this.pub_leidas = pub_leidas;
        this.pub_prestamo = pub_prestamo;
    }

    public int getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(int numero_socio) {
        this.numero_socio = numero_socio;
    }

    public LocalDate getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(LocalDate f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getCredito_ganado() {
        return credito_ganado;
    }

    public void setCredito_ganado(int credito_ganado) {
        this.credito_ganado = credito_ganado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Publicacion> getPub_leidas() {
        return pub_leidas;
    }

    public void setPub_leidas(HashSet<Publicacion> pub_leidas) {
        this.pub_leidas = pub_leidas;
    }

    public HashMap<Publicacion, Integer> getPub_prestamo() {
        return pub_prestamo;
    }

    public void setPub_prestamo(HashMap<Publicacion, Integer> pub_prestamo) {
        this.pub_prestamo = pub_prestamo;
    }

    public int devolver_prestamo(Prestamo p ){
       try {
           if(LocalDate.now().isAfter(p.getFecha_devolucion_estimada())) {
               throw new Fuera_de_fecha("Prestamo devuelto fuera de fecha");
           }
               System.out.println("prestamo devuelto con exito");
               return 0;


       } catch (Fuera_de_fecha e) {
           credito_ganado -= p.getPub().get_multa();
           return p.getPub().get_multa();
       }


    }


}

