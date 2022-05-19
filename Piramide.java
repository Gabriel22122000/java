public class Piramide {
    double areabase2;
    double alturapiramide;
    public Piramide(double areabase2, double alturapiramide) {
        this.areabase2 = areabase2;
        this.alturapiramide = alturapiramide;
    }
    public double volume5() {
        double volume5 = ((areabase2 * alturapiramide) / 3);
        return volume5;
    }
}
