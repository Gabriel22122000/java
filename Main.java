import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        System.out.println("Digite 1,2,3,4 para saber o volume dos referentes solidos geometricos");
        System.out.println("1 para Cone");
        System.out.println("2 para Cilindro");
        System.out.println("3 para Piramide");
        System.out.println("4 para Prisma");
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Digite a area da base do Cone:");
                double areabase = leitor.nextInt();
                System.out.println("Digite a altura do Cone");
                double alturacone = leitor.nextInt();
                System.out.println("Digite o raio:");
                double raio = leitor.nextInt();
                System.out.println("");
                Cone cone = new Cone(areabase, alturacone, raio);
                System.out.println("Volume do cone: " + cone.volumefinal());
                break;

            case 2:
                System.out.println("Digite a area da base do Cilindro");
                double areabase1 = leitor.nextInt();
                System.out.println("Digite a altura do Cilindro");
                double alturacilindro = leitor.nextInt();
                System.out.println("");
                Cilindro cilindro = new Cilindro(areabase1, alturacilindro);
                System.out.println("Volume do cilindro: " + cilindro.volume1());
                break;

            case 3 :
                System.out.println("Digite a area da base do Piramide");
                double areabase2 = leitor.nextInt();
                System.out.println("Digite a altura da piramide");
                double alturapiramide = leitor.nextInt();
                System.out.println("");
                Piramide piramide = new Piramide(areabase2, alturapiramide);
                System.out.println("Volume da piramide: " + piramide.volume5());

            case 4 :
                System.out.println("Digite a area da base do Prisma:");
                double areabase3 = leitor.nextInt();
                System.out.println("Digite a altura do Prisma");
                double alturaprisma = leitor.nextInt();
                System.out.println("");
                Prisma prisma = new Prisma(areabase3, alturaprisma);
                System.out.println("Volume da piramide: " + prisma.volume6());
        }
    }
}
