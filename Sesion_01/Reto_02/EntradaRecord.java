public record EntradaRecord(String evento, double precio) {
    public void mostrarInfo(){
        System.out.println("ticket para el "+ evento + "/ precio: "+ precio);
    }
}
