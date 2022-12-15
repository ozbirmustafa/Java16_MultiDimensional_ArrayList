package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Interview sorusu olabilir

        /*Array listler aynı data tipine sahip birden fazla datayı depolamak için kullanılır.
          Array ile ArrayList in farkı
          1) Array oluştururken Array in içine kaç tane eleman koymamız gerektiğini söylemeliyiz. Söylediğimiz kadar eleman koymalıyız.
             Arrayler eleman sayısında fixtirler.
             Arraylist leri oluştururken eleman sayısı söylemeye gerek yok çünkü ArrayList ler eleman sayısında "flexible"(esnek)dır.

          2) Array lerin içine "primitive" ve "reference" lar konabilir.
             ArrayList lerin içine sadece "non-primitive"ler konulur.

          3) Array ler super fast dir ve memory i çok az kullanır.
          Note: Eleman kesin belli olan çoklu dataları depolamak için array kullanırız ama
                eleman sayısı değişken olan çoklu datalar için array kullanma riski alınmaz.
                */

        //1. Yol
        ArrayList<Integer> age = new ArrayList<Integer>();
        //2. Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3. Yol
        List<Integer> nums = new ArrayList<>();

        //ArrayListler nasıl yazdırılır
        System.out.println(nums); //[]
        //ArrayListlere nasıl eleman eklenir
        nums.add(21);
        nums.add(18);
        nums.add(20);
        //add() methodu elemanı her zaman en sona ekler.  (insertion order)
        System.out.println(nums); //[21, 18, 20]

        nums.add(1,50);
        System.out.println(nums); // [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums); //[21, 50, 18, 20, 23, 185]

        nums.addAll(2,prices);
        System.out.println(nums); //[21, 50, 23, 185, 18, 20, 23, 185]

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //8

        //ArrayListlerde eleman seçme
        //get() methodu istenen bir indexteki elemanı verir.
        int el1 = nums.get(3);
        System.out.println(el1); //185

        //ArrayListin boş olup olmadığını nasıl anlarız?
        boolean b1 = nums.isEmpty();
        System.out.println(b1); //false

        //ArrayListte bir eleman nasıl değiştirilir.
        nums.set(3,200);
        System.out.println(nums); //[21, 50, 23, 200, 18, 20, 23, 185]

        //Ex 1 : nums ArrayListindeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız.

        for (int w: nums) {
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums); //[32, 50, 34, 200, 18, 20, 34, 196]
        //Ex 2: ArrayList ten 34 elemanının 'ilk' görünümünü siliniz.
        //remove() method unu içine tamsayi koyarsanız Java onu index olarak kabul eder.
        //Javada tüm sayılar aksi belirtilmedikçe primitive'dir, yani int dir.
        //primitive'ler ArrayList'lerin elemanı olamazlar.
        //primitive i "Wrapper Class"a çevirirseniz, "non primitive" olur ve "np" ler ArrayList lerin elemanı olur. Index olamaz.

        //nums.remove(34); Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 34 out of bounds for length 8

        Integer sayi = 34; //non primitive oldu
        nums.remove(sayi);  //non primitive leri index kabul etmez
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]






    }
}
