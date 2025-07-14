package Entrega_lulo;

import java.time.LocalDate;

public abstract class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private Empresa empresa;
    private LocalDate embasado;
    private int precio;

    public Producto(){
        this.codigo=1;
        this.nombre="Gaseosa";
        this.marca="Coca cola";
        this.empresa=new Empresa();
        this.embasado= LocalDate.now();
        this.precio=1000;

    }

    public Producto(int codigo, String nombre, String marca, Empresa empresa, LocalDate embasado, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.empresa = empresa;
        this.embasado = embasado;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public LocalDate getEmbasado() {
        return embasado;
    }

    public void setEmbasado(LocalDate embasado) {
        this.embasado = embasado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract boolean estoy_vencido();
    public abstract long dias_vencimientos();
    public abstract boolean tengo_envoltorio();
    public abstract boolean todavia_consumible();


}
