import java.util.Scanner;
public class SimulFarm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();
        System.out.println("Precio unitario: $ ");
        double precioUnit = scanner.nextDouble();
        System.out.println("Cantidad (piezas): ");
        int piezas = scanner.nextInt();

        //Calculo del total bruto
        double totalBruto = precioUnit * piezas;

        //Total si hay descuento
        var apliDesc = totalBruto > 500;
        var desc = apliDesc ? totalBruto * 0.15 : 0;

        //Total neto
        double totalNeto = totalBruto - desc;

        //Resumen de compra
        System.out.println("Resumen de compra: ");
        System.out.println("Nombre del medicamento: " + medicamento);
        System.out.println("Cantidad (piezas): " + piezas);
        System.out.println("Precio unitario: $ " + precioUnit);
        System.out.println("Total sin descuentos: $ " + totalBruto);
        System.out.println("¿Aplica algun descuento?: " + apliDesc);
        System.out.println("Descuento: $ " + desc);
        System.out.println("Total a pagar: $ " + totalNeto);

        scanner.close();
    }
}
