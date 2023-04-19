import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt();
        System.out.println(a);

        int b = random.nextInt(6) + 1;
        System.out.println(b);

        double c = random.nextDouble() ;
        System.out.println(c);

        boolean d = random.nextBoolean();
        System.out.println(d);
    }
}