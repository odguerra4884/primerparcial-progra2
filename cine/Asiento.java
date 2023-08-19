
package cine;

public class Asiento {
    private int fila;
    private char columna;
    private boolean ocupado;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNumeroAsiento() {
        return fila + " " + columna;
    }
}
