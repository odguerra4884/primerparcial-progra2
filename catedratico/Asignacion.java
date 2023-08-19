package catedratico;

public class Asignacion {
    private final Alumno alumno;
    private Curso[] cursos;
    private int contadorCursos;

    public Asignacion(Alumno alumno, int cantidadMaximaCursos) {
        this.alumno = alumno;
        this.cursos = new Curso[cantidadMaximaCursos];
        this.contadorCursos = 0;
    }

    public void addCurso(Curso curso) {
        if (contadorCursos < cursos.length) {
            cursos[contadorCursos] = curso;
            contadorCursos++;
        } else {
            System.out.println("No es posible agregar más cursos.");
        }
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}
