import java.time.LocalDate;

public class cuenta {
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;
    private String localidad;
    
    public cuenta(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public cuenta(String dni, String nombre, String apellidos, LocalDate fechaDeNacimiento, String localidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.localidad = localidad;
    }

    //getters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    //setters
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    //Metodos
    public void ingreso (double cantidad) {
        if (cantidad<0) {
            System.out.println("Error: la cantidad no puede ser negativa");
        }
    }

    @Override
    public String toString() {
        return "cuenta [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaDeNacimiento="
                + fechaDeNacimiento + ", localidad=" + localidad + "]";
    }

}