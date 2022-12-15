package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        //Bir tane integer multidimensional array oluşturunuz.
        //bu arraydeki tüm sayıların toplamını veren kodu yazınız.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56,}};

        int sum = 0;

        //Array veya colection varsa for eachloop kullanmak ilk tercihiniz olsun.
        //Array veya collection var ama index kullanmak zorundasınız, o zaman for-each-loop calışmaz.

        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);

        //Bir multidimensional array i normal array e çeviren kodu yazınız.

        int brr[][] = {{2, 5, 1}, {32, 75}};
        //multidimensional deki eleman sayisini bulunuz.
        //Cunku yeni bir array oluşturmayliyiz.
        //Bu yeni arrayin uzunlugu orijinal array in eleman sayisina eşit olmalıdır.

        int top = 0;

        for (int [] w: brr) {

            top = top + w.length;

        }
        System.out.println(top);

        int idx = 0;

        int crr [] = new int[top];

        for (int [] w: brr ) {

            for (int k: w ) {
                crr[idx] = k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));










    }
}
