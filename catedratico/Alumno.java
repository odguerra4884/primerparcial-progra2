
package catedratico;
public class Alumno {
    private static int contadorCarnet = 1;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;

    public Alumno(String nombre, String direccion, String telefono) {
        this.carnet = contadorCarnet++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }

    public static int getContadorCarnet() {
        return contadorCarnet;
    }

    public static void setContadorCarnet(int contadorCarnet) {
        Alumno.contadorCarnet = contadorCarnet;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
