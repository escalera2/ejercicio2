public class Parada {
    Integer numero;
    String direccion;
    Linea linea;
    String horario;
    public Parada(){

    }
    public Parada(int numero, String direccion, Linea linea, String horario){
        this.numero=numero;
        this.direccion=direccion;
        this.linea=linea;
        this.horario=horario;
    }
}
