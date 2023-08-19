package cine;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Pelicula pelicula = new Pelicula("Shrek 2", 105, 10, " Joe Stillman, Roger S. H. Schulman ");
        
        Cine cine = new Cine(pelicula, 25, 8, 9);
        cine.mostrarPelicula();
        cine.mostrarAsientos();
        
        
        System.out.println("Ingrese los datos de los espectadores:");

        System.out.println("Ingrese los datos del espectador 1:");
        System.out.print("Nombre: ");
        scanner.nextLine(); 
        String nombreEspectador1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEspectador1 = scanner.nextInt();
        System.out.print("Valor de pelucula Q 25 o: ");
        double dineroEspectador1 = scanner.nextDouble();

        Espectador espectador1 = new Espectador(nombreEspectador1, edadEspectador1, dineroEspectador1);
    System.out.println("");
        System.out.println("Ingrese los datos del espectador 2:");
        System.out.print("Nombre: ");
        scanner.nextLine(); 
        String nombreEspectador2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEspectador2 = scanner.nextInt();
        System.out.print("Valor de pelucula Q 25: ");
        double dineroEspectador2 = scanner.nextDouble();

        Espectador espectador2 = new Espectador(nombreEspectador2, edadEspectador2, dineroEspectador2);
        System.out.println("");

        
        cine.mostrarPelicula();

        
        cine.mostrarAsientosConEtiquetas();

        
        System.out.println("");
       System.out.println("Ingrese la fila y columna del asiento para el espectador 1 (por ejemplo, 1 A):");
    int fila1, columna1;
    do {
        System.out.println("Ingrese la fila");
        fila1 = scanner.nextInt();
        System.out.println("Ingrese la columna");
        char columnaChar1 = scanner.next().charAt(0);
        columna1 = Character.toLowerCase(columnaChar1) - 'a'; // Convertir la letra a un índice de columna válido
        System.out.println("");
        if (!cine.reservarAsiento(espectador1, fila1, (char) ('A' + columna1))) {
            System.out.println("Vuelva a intentar la reserva.");
        }
    } while (fila1 < 1 || fila1 > 8 || columna1 < 0 || columna1 >= 9);
    System.out.println("");
    System.out.println("Ingrese la fila y columna del asiento para el espectador 2 (por ejemplo, 2 B):");
    int fila2, columna2;
    do {
        System.out.println("Ingrese la fila");
        fila2 = scanner.nextInt();
        System.out.println("Ingrese la columna");
        char columnaChar2 = scanner.next().charAt(0);
        columna2 = Character.toLowerCase(columnaChar2) - 'a'; 
        System.out.println("");
        if (!cine.reservarAsiento(espectador2, fila2, (char) ('A' + columna2))) {
            System.out.println("Vuelva a intentar la reserva.");
        }
    } while (fila2 < 1 || fila2 > 8 || columna2 < 0 || columna2 >= 9);
        
        cine.mostrarAsientosConEtiquetas();
        
        scanner.close();
    }
}


