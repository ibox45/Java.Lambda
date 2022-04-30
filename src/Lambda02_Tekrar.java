import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02_Tekrar {
    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));

        // Task : Functional Programming ile listin cift elemanlarinin
        // karelerini ayni satirda aralarina bosluk bırakarak print ediniz
        ciftKarePrint(sayi);
        System.out.println("\n   ***     ");
        tekKupBirFazlaPrint(sayi);
        System.out.println("\n   ***     ");
        ciftKarekokPrint(sayi);
        System.out.println("\n   ***     ");
        maxElBul(sayi);
        System.out.println("\n   ***     ");
        ciftKareMaxBul(sayi);
        System.out.println("\n   ***     ");
        elTopla(sayi);
        System.out.println("\n   ***     ");
        ciftCarp(sayi);








    }

    public static void ciftKarePrint(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t->t*t).
                forEach(Lambda01::yazdir);
    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin
    // bir fazlasini ayni satirda aralarina bosluk birakarak print edin

    public static void tekKupBirFazlaPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t%2!=0).
                map(t->(t*t*t)+1).
                forEach(Lambda01::yazdir);
    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftKarekokPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt).
                forEach(t-> System.out.print(t+" "));
    }

    // Task : list'in en buyuk elemanini yazdiriniz

    public static void maxElBul(List<Integer> sayi){

       Optional<Integer> maxSayi=  sayi.
                                          stream().
                                          reduce(Math::max);
        System.out.println(maxSayi);
        System.out.println("halukca "+sayi.stream().reduce(Math::max));


    }

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.

    public static void ciftKareMaxBul(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                reduce(Math::max));

        System.out.println("daha hızlı specific ınteger class : " + sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                reduce(Integer::max));//36 specific class daha hızlı run olur

    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...

    public static void elTopla(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                reduce(Integer::sum)); //method reference

        int toplam=sayi.
                stream().
                reduce(0,(a,b)->a+b);
        System.out.println(toplam);

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(1,Math::multiplyExact));  //identiy icin 1 yazdım ki optional olmasın.

        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(1, (a, b) -> (a * b)));
    }








}
