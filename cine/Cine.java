
package cine;

public class Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                char label = (char) ('A' + columna);
                asientos[fila][columna] = new Asiento(fila + 1, label);
            }
        }
    }

    public void mostrarPelicula() {
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Duracion: " + pelicula.getDuracion() + " minutos");
        System.out.println("Edad minima: " + pelicula.getEdadMinima() + " anos");
        System.out.println("Director: " + pelicula.getDirector());
    }

    public void mostrarAsientos() {
        for (int fila = asientos.length - 1; fila >= 0; fila--) {
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                Asiento asiento = asientos[fila][columna];
                char estado = asiento.isOcupado() ? 'X' : '-';
                System.out.print(" " + estado + " ");
            }
            System.out.println();
        }
    }
    public void mostrarAsientosConEtiquetas() {
        System.out.print("  "); 
        for (int columna = 0; columna < asientos[0].length; columna++) {
            char label = (char) ('A' + columna);
            System.out.print(label + " ");
        }
        System.out.println();

        for (int fila = asientos.length - 1; fila >= 0; fila--) {
            System.out.print(fila + 1 + " "); 
            for (int columna = 0; columna < asientos[fila].length; columna++) {
                Asiento asiento = asientos[fila][columna];
                char estado = asiento.isOcupado() ? 'X' : '-';
                System.out.print(estado + " ");
            }
            System.out.println();
        }
    }
    public boolean reservarAsiento(Espectador espectador, int fila, char columna) {
    int filaIndex = fila - 1;
    int columnaIndex = columna - 'A';

    if (filaIndex < 0 || filaIndex >= asientos.length || columnaIndex < 0 || columnaIndex >= asientos[0].length) {
        System.out.println("Ubicacion de asiento invalida.");
        return false;
    }

    Asiento asiento = asientos[filaIndex][columnaIndex];
    if (asiento.isOcupado()) {
        System.out.println("El asiento está ocupado.");
        return false;
    }

    if (espectador.getEdad() < pelicula.getEdadMinima()) {
        System.out.println("El espectador no cumple con la edad minima.");
        return false;
    }

    if (espectador.getDinero() < precioEntrada) {
        System.out.println("El espectador " + espectador.getNombre() + " no tiene suficiente dinero.");
        return false;
    }

    asiento.setOcupado(true);
    char labelColumna = (char) ('A' + columnaIndex);
    System.out.println("Asiento reservado para " + espectador.getNombre() + " en la fila " + (filaIndex + 1) + " y columna " + labelColumna);
    return true;
}

}