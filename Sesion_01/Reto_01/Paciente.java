public class Paciente {
    String nombre;
    int edad;
    String numExp;

    public void mostrarInfo(){
        System.out.println("Informacion del/la paciente: ");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Expediente: " + numExp);
    }
}
