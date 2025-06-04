package Unidad1.Enums;

public enum Color {
    ROJO("#ff0000"), AZUL("#0000ff"), ROSA("#ee82ee"), AMARILLO("#ffa500");

    private String codigoHexa;

    private Color(String codigoHexa){
        this.codigoHexa=codigoHexa;

    }

    public String getCodigoHexa() {
        return codigoHexa;
    }

    public void setCodigoHexa(String codigoHexa) {
        this.codigoHexa = codigoHexa;
    }
}
