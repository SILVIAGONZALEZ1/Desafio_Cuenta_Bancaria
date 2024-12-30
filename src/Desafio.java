import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tanos";
        String cuentaBancaria = "Cuenta Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("\n" + "*******************************************");
        System.out.println("\n" +
                "El nombre del cliente es: " + nombre);
        System.out.println("El tipo de cuenta es: " + cuentaBancaria);
        System.out.println("El saldo es: " + "$ " + saldo);
        System.out.println("\n" + "*******************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("El saldo actualizado es: " + "$ " + saldo);
                System.out.println("\n" + "*******************************************");
                break;
            case 2:
                System.out.println("¿cual es el valor que desea retirar?");
                double valorARetirar = teclado.nextDouble();
                if (valorARetirar > saldo){
                    System.out.println("Tu saldo es insuficiente");
                }else{
                    saldo = saldo - valorARetirar;
                    System.out.println("El saldo actualizado es: " + "$ " + saldo);
                    System.out.println("\n" + "*******************************************");
                }
                break;
            case 3:
                System.out.println("¿Cual es el valor que desea depositar?");
                double valorADepositar = teclado.nextDouble();
                saldo += valorADepositar;
                System.out.println("El saldo actualizado es: " + "$ " + saldo);
                System.out.println("\n" + "*******************************************");
                break;
            case 9:
                System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                System.out.println("\n" + "*******************************************");
                break;
            default:
                System.out.println("Opcion no valida");
                System.out.println("\n" + "*******************************************");

        }
        }

    }

}
