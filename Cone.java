public class Cone {
    double areabase;
    double altura;
    double raio;
    public Cone (double areabase, double altura, double raio) {
        this.areabase = areabase;
        this.altura = altura;
        this.raio = raio;
    }

    public double volumefinal(){
        double raio1 = raio * raio;
        double volume = 3.14 * raio1 * altura;
        double volume2 = volume * altura;
        double volumefinal = volume2;
        return volumefinal;
    }
}
