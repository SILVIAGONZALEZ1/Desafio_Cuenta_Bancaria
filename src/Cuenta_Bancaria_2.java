import java.util.Scanner;

// Clase Cuenta_Bancaria_2
public class Cuenta_Bancaria_2 {
    // Atributos de la clase
    private final String nombreCliente;
    private final String tipoCuenta;
    private double saldo;

    // Constructor simplificado
    public Cuenta_Bancaria_2(String nombreCliente, String tipoCuenta, double saldoInicial) {
        this.nombreCliente = nombreCliente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad + " correctamente.");
        } else {
            System.out.println("Error: No se puede depositar una cantidad negativa o cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad + " correctamente.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente para realizar el retiro.");
        } else {
            System.out.println("Error: No se puede retirar una cantidad negativa o cero.");
        }
    }

    // Método para mostrar los datos de la cuenta
    @Override
    public String toString() {
        return "=== Detalles de la Cuenta ===\n"
                + "Cliente: " + nombreCliente + "\n"
                + "Tipo de Cuenta: " + tipoCuenta + "\n"
                + "Saldo Actual: $" + saldo + "\n";
    }

    // Método main
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear una instancia de la clase Cuenta_Bancaria_2
        Cuenta_Bancaria_2 cuenta = new Cuenta_Bancaria_2("Capitán América", "Cuenta Corriente", 10000.0);

        // Operaciones
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n Seleccione una opción:");
            System.out.println("1. Mostrar detalles de la cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            System.out.print("Opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar los detalles de la cuenta
                    System.out.println(cuenta);
                    break;
                case 2:
                    // Depositar dinero
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = teclado.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    // Retirar dinero
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = teclado.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    // Salir
                    continuar = false;
                    System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        teclado.close();
    }
}