package catedratico;



public class Catedratico {
    private static int contadorCatedratico = 1;
    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = contadorCatedratico++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public void imprimirDatos() {
        System.out.println("Codigo de catedratico: " + codigoCatedratico);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Profesion: " + profesion);
    }
}