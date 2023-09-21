import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner verial = new Scanner(System.in);
        double rad;
        double pi = 3.14;

        System.out.print("Yarıçap giriniz : ");
        rad = verial.nextDouble();

        double alan = (pi*(rad*rad));
        double cevre = (2*pi*rad);

        System.out.println("Dairenizin alanı : " + alan);
        System.out.println("Dairenizin çevresi : " + cevre);
    }
}