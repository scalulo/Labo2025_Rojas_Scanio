package objetos;

import java.time.LocalDate;

public abstract class Persona {
    private int documento;
    private int anios;
    private String apodo;
    private LocalDate nacimiento;

    public Persona(int documento, int anios, String apodo, LocalDate nacimiento) {
        this.documento = documento;
        this.anios = anios;
        this.apodo = apodo;
        this.nacimiento = nacimiento;
    }

    public Persona() {
        this.documento = 1991919;
        this.anios = 19;
        this.apodo = "juan";
        this.nacimiento = LocalDate.now();
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
