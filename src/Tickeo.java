public class Tickeo {
    Autobus autoubus;
    Parada parada;
    String horario;
    int sube;
    int baja;
    public Tickeo(){

    }
    public Tickeo(Autobus autobus, Parada parada, String horario, int sube, int baja){
        this.autoubus=autobus;
        this.parada=parada;
        this.horario=horario;
        this.sube=sube;
        this.baja=baja;
    }
}
