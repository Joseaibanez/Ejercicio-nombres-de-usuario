public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
            nombre = nombreCompleto;
            numeroMatricula = numeroMatriculaAlumno;           
            edad = edadAlumno;
            if (nombre.length() < 3) {
                System.out.println("Nombre demasiado corto");
            }
            else {}
            if (numeroMatricula.length() < 4) {
                System.out.println("Numero demasiado corto");
            }
            else {}
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
     /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
       if (nombre.length() < 3) {
           String nombreUsuario;
           nombre = "ghy";          
            }
            else {}
       if (numeroMatricula.length() < 4) {
           String numeroMatricula;
           numeroMatricula = "5689";
            }
            else {}
        return nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
    }
}
