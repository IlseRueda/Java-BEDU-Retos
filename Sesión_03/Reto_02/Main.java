public class Main {
    public static void main(String[] args){

        Factura facturaRFC = new Factura(4600.00, "Servicio tecnico", "BAGG010213MFG");
        Factura facturaSin = new Factura(300,"Cotizacion", "RUHI010512HHM");

        System.out.println(facturaRFC.getResumen());
        System.out.println(facturaSin.getResumen());
    }
}
