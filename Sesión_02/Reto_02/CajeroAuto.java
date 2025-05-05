import java.util.Scanner;
public class CajeroAuto {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        var saldo = 1200.00;
        int op;

        do {
            //menu de opciones
            System.out.println("Cajero Automatico");
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");

            op = scanner.nextInt();

            switch (op){
                case 1 -> {
                    System.out.println("Tu saldo es: $" + saldo);
                }
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0){
                        System.out.println("El deposito debe ser mayor a 0");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Deposito realizado, saldo actual: $" + saldo);
                }
                case 3 -> {
                    System.out.println("Ingresa el monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0){
                        System.out.println("El retiro debe ser mayor a 0");
                        continue;
                    }
                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente, tu saldo es: $" + saldo);
                    }else {
                        saldo -= retiro; //Resta el monto de saldo
                        System.out.println("Retiro exitoso, tu saldo es: $" + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("Hasta luego");
                }
                default -> {
                    System.out.println("Intenta nuevamente");
                }
            }
        }while (op != 4); //Fin en la opcion 4
        scanner.close();
    }
}
