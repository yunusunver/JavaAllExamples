/* 10'a kadar olan sayıların karelerinin
toplamını ve toplamlarının karesini bulan ve bunları birbirinden çıkaran program*/

/*Find the sum of the squares of the first ten natural numbers,
find the  squares of the sum of the first ten natural numbers
*/

/* 
Variables:
karelerinToplami: sum of the squares
toplamlarinKaresi: squares of the sum
adet: number
*/
public class KarelerinToplami {
    public static void main(String [] args){
        int karelerinToplami=0,toplamlarinKaresi=0,adet=10;
        
        for (int i = 1; i <= adet; i++) {
            karelerinToplami=karelerinToplami+(i*i);
            
        }
        System.out.println("Karelerin Toplamı:"+karelerinToplami);
        
        for (int i = 1; i <= adet; i++) {
            toplamlarinKaresi=toplamlarinKaresi+i;
        }
        toplamlarinKaresi=toplamlarinKaresi*toplamlarinKaresi;
        System.out.println("Toplamların karesi:"+toplamlarinKaresi);
        
        System.out.print("ToplamlarınKaresi-KarelerinToplamı :"+(toplamlarinKaresi-karelerinToplami));
    }
}
