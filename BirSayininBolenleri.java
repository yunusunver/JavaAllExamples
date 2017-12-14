
import java.util.Scanner;

//Dışarıdan girilen sayının tam bölenlerini bulan program.
public class BirSayininBolenleri {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        for (int i = 2; i <= sayi; i++) {
            if (sayi%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
