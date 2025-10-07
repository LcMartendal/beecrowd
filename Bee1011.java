import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double r = s.nextDouble();
        double pi = 3.14159;
        double calc = (4.0/3) * pi * Math.pow(r, 3);
        System.out.println("VOLUME = " + df.format(calc));

        s.close();
    }
}
