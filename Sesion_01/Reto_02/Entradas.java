public class Entradas {
    String evento;
    double precio;

    //CONSTRUCTOR
    public Entradas(String evento, double precio){
        this.evento = evento;
        this.precio = precio;
    }

    //Metodo para mostrar los datos
    public void mostrarInfo(){
        System.out.println("ticket para el "+ evento + "/ precio: "+ precio);


}

}
