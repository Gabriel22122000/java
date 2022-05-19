public class Cilindro {
    double areabase1;
    double alturacilindro;
    public Cilindro(double areabase1,double alturacilindro) {
        this.areabase1 = areabase1;
        this.alturacilindro = alturacilindro;
    }
    public double volume1() {
        double volume1 = areabase1 * alturacilindro;
        return volume1;
    }
}