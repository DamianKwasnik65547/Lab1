import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner in=new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita ");
        int a=in.nextInt();
if(a%2==0){
    System.out.println("Liczba jest parzysta");


}else System.out.println("Liczba jest nieparzysta");
    }*/

//        Scanner in=new Scanner(System.in);
//        System.out.println("Podaj liczbe całkowita ");
//        int a=in.nextInt();
//        if(a/3==0 && a/5==0){
//            System.out.println("Liczba jest podzielna");}
//            else System.out.println("Liczba nie jest podzielna");
//        }
//        Scanner in=new Scanner(System.in);
//       System.out.println("Podaj liczbe całkowita ");
//       double a=in.nextDouble();
//        System.out.println("Liczba podniesiona do 3 potegi to "+(a*a*a));



//        Random rand=new Random();
//        // [-5,15]
//        int a=rand.nextInt(16)-5;
//        System.out.println("wylosowana liczba: "+a);
//        int a,b;

       // Random rand=new Random();
        // [-5,15]
       // int a=rand.nextInt(16)-5;
      //  System.out.println("wylosowana liczba: "+a);

        //losowanie z koncow przedziałów
        Random rand=new Random();
        int a=7,b=15;
        int wylosowana=rand.nextInt((b-a+1)+a);
        System.out.println(wylosowana);
}}
//sqrt-pierwiastek kw