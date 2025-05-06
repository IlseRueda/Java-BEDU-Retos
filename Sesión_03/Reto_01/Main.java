public class Main {
    public static void main(String[] args){

        Pasajero pasajero = new Pasajero("Gerardo Bautista", "P130201");
        Vuelo vuelo = new Vuelo("OAX42", "Oaxaca", "15:45");

        boolean reservado = vuelo.resAs(pasajero);
        if (reservado){
            System.out.println("Reserva realizada");
        }else {
            System.out.println("No se puede realizar la reserva");
        }

        //itenerario
        System.out.println(vuelo.obtInti());
        //cancelar
        System.out.println("Reservacion cancelada");
        vuelo.cancReser();
        //itinerario actualizado
        System.out.println(vuelo.obtInti());

        vuelo.resAs("Ilse Rueda", "P120501");
        System.out.println(vuelo.obtInti());
    }
}
