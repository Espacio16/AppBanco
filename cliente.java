import java.time.LocalDate;

public class cliente {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public cliente() {
    }

    public cliente(String dni) {
        this.dni = dni;
    }

    public cliente(String dni, String nombre, LocalDate fechaNacimiento) {
        this(dni);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

        @Override
    public String toString() {
        return "cliente <| dni = " + dni + ", nombre = " + nombre + " " + ", fecha = " + fechaNacimiento + " ";
    }
}
