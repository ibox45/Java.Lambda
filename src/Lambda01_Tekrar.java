import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01_Tekrar {

    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        printElStuructured(sayi);
        System.out.println();
        printElFunctional(sayi);
        System.out.println();
        printElFunctional1(sayi);
        System.out.println();
        printElFunctional2(sayi);
        System.out.println();
        printCiftElSturctured(sayi);
        System.out.println();
        printCiftElFunctional(sayi);
        System.out.println();
        printCiftElFunctional1(sayi);
        System.out.println();
        printCiftElFunctional1(sayi);
    }

    public static void printElStuructured(List<Integer> sayi){
        for (Integer w:sayi){
            System.out.print(w+" ");
        }
    }

    public static void printElFunctional(List<Integer> sayi){
        sayi.stream().forEach((t)->System.out.print(t+" "));

    }

    public static void printElFunctional1(List<Integer> sayi){
        sayi.stream().forEach(System.out::print);

    }
    public static void yazdir (int a){
        System.out.println(a+" ");
    }
    public static void printElFunctional2(List<Integer> sayi){
        sayi.stream().forEach(Lambda01::yazdir);


    }
    public static void printCiftElSturctured(List<Integer> sayi){
        for(Integer w:sayi){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    public static void printCiftElFunctional(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0).forEach(Lambda01::yazdir);
    }

    public static boolean ciftBul(int a)
    {
        return a%2==0;
    }

    public static void printCiftElFunctional1(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                forEach(Lambda01::yazdir);
    }

    public static boolean kucuk (int a){
        return a<34;
    }

    public static void printCiftElFunctional2(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                filter(Lambda01_Tekrar::kucuk).
                forEach(Lambda01::yazdir);
    }






}
