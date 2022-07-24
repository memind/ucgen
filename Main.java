import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int a, b, c;
        double u, cevre, alan;
      
        Scanner kenar = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = kenar.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = kenar.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        c = kenar.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        cevre = 2*u;

        System.out.println("Alan: "+alan+" Birim");
        System.out.println("Çevre: "+cevre+" Birim");
    }
}