import java.time.LocalDate;

import Usuario.Cliente;

public class appBanco {
    public static void main(String[] args) {
        cliente c1 = new cliente("163589", "juan", LocalDate.now());
        System.out.println(c1.getNombre());
        System.out.println(c1);
        cuenta cuenta1 = new cuenta("126826", "Cesar");
        System.out.println(cuenta1);
    }
}
