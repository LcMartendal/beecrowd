import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        System.out.println("X = " + (a+b));
        leitor.close();
    }
}
