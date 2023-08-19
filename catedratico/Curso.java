package catedratico;

public class Curso{
    private String nombre;
    private int espacioMaximo;
    private int alumnosInscritos; 

    public Curso(int espacioMaximo, String nombre) {
        this.nombre = nombre;
        this.espacioMaximo = espacioMaximo;
        this.alumnosInscritos = 0; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspacioMaximo() {
        return espacioMaximo;
    }

    public void setEspacioMaximo(int espacioMaximo) {
        this.espacioMaximo = espacioMaximo;
    }

    public boolean verificaEspacio() {
        return alumnosInscritos < espacioMaximo; 
    }
}
