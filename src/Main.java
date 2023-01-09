import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double boy, kilo , kitleEndeksi ;

        System.out.print("Boyunuzu m cinsinden giriniz = ");
        boy = girdi.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz = ");
        kilo = girdi.nextDouble();

        kitleEndeksi = ((kilo)/( boy * boy));
        System.out.print( "Vucüt Kitle Endeksiniz =  " + kitleEndeksi);

        




    }
}