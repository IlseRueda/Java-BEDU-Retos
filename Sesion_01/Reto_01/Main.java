import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Paciente p1= new Paciente();
        System.out.println("Ingrese el nombre del paciente: ");
        p1.nombre = input.nextLine();
        System.out.println("Ingrese la edad del paciente: ");
        p1.edad = input.nextInt();
        input.nextLine(); //Bufer
        System.out.println("Ingrese el numero de expediente del paciente: ");
        p1.numExp = input.nextLine();
        input.close();//cerramos

        p1.mostrarInfo();
    }
}
