public class Prisma {
    double areabase3;
    double alturaprisma;
    public Prisma (double areabase3, double alturaprisma){
        this.areabase3 = areabase3;
        this.alturaprisma = alturaprisma;
    }
    public double volume6() {
        double volume6 = ((areabase3 * alturaprisma) / 3);
        return volume6;
    }
}
