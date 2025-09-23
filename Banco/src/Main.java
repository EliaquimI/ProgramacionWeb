import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        int opc;

        do {
            System.out.println("\nIngrese la opción que quiera realizar:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Salir");
            opc = read.nextInt();
//ds
            switch (opc) {
                case 1:
                    System.out.println("El saldo es: $" + cuenta.getSaldo());
                    break;

                case 2:
                    System.out.println("---- RETIRAR ----");
                    System.out.print("¿Cuánto dinero quieres retirar?: ");
                    double retirar = read.nextDouble();
                    if (retirar > cuenta.getSaldo()) {
                        System.out.println("No tienes suficiente saldo para retirar");
                    } else {
                        cuenta.setRetirar(retirar);
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                    }
                    break;

                case 3:
                    System.out.println("---- DEPOSITAR ----");
                    System.out.print("¿Cuánto dinero quieres depositar?: ");
                    double depositar = read.nextDouble();
                    cuenta.setDepositar(depositar);
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                    break;

                case 4:
                    System.out.println("Saliste del banco.");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opc != 4);
    }
}
