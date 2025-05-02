public class Main {
    public static void main(String[] args){
        Entradas entradas1 = new Entradas("Concierto de Rauw Alejandro", 3000);
        Entradas entradas2 = new Entradas("Concierto de Katy Perry", 8000);
        entradas1.mostrarInfo();
        entradas2.mostrarInfo();

        //Adicional
        EntradaRecord entradas3 = new EntradaRecord("Latin mafia en concierto", 2000);
        entradas3.mostrarInfo();

    }
}
