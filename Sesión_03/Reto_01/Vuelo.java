public class Vuelo {
    final String codVuelo;
    String destino;
    String horaSal;
    Pasajero asRes;

    public Vuelo(String codVuelo,String destino, String horaSal){
        this.codVuelo = codVuelo;
        this.destino = destino;
        this.horaSal = horaSal;
        this.asRes = null;
    }
    //parametro y valor de retorno
    public  boolean resAs(Pasajero p){
        if(asRes == null){
            asRes = p;
            return true;
        }else {
            return false;
        }
    }
    //sobrecarga
    public boolean resAs(String nombre, String passport){
        Pasajero nuevPasaj = new Pasajero(nombre, passport);
        return resAs(nuevPasaj);
    }
    //met sin retrno
    public void cancReser(){
        asRes = null;
    }
    //met con String de retorno
    public String obtInti(){
        String info = "Itinerario de vuelo: ";
        info += "Código: " + codVuelo;
        info += "Destino: " + destino;
        info += "Salida: " + horaSal;
        if(asRes != null){
            info += "Pasajero: " + asRes.nombre;
        }else {
            info += "Pasajero: Sin reserva";
        }
        return info;
    }
}
