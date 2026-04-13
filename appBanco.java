import java.time.LocalDate;
//comentario desde github :)
import Usuario.Cliente;

public class appBanco {
    public static void main(String[] args) {
        cliente c1 = new cliente("163589", "juan", LocalDate.of(2005,3,16));
        System.out.println(c1.getNombre());
        System.out.println(c1);
        cuenta cuenta1 = new cuenta("126826", "Cesar");
        System.out.println(cuenta1);
    }
}
