/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unver
 */
public class katsayibulma {
    public static void main(String[] args){
        //Türkçe açıklama : 1000'e kadar 3 veya 5'in katı olan sayıların toplamını veren program.
        //İngilizce Açıklama: The sum of all the multiples of 3 or 5 below 1000.
        int toplam=0;
        
        for(int i=0;i<1000;i++){
            if(i%3==0 || i%5==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}
