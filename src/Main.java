
import java.util.*;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void doluKare() {

        System.out.println("Çizilmesini istediğiniz kare boyutunu giriniz : ");

        int input = scanner.nextInt();

        String star = "*";

        for (int i = 0; i < input; i++) {
            System.out.println(star.repeat(input));
        }
    }

    public static void bosKare() {

        System.out.println("Çizilmesini istediğiniz kare boyutunu giriniz : ");

        int input = scanner.nextInt();

        String star = "*";

        for (int i = 0; i < input; i++) {
            if (i == 0 || i == input - 1) {
                System.out.println(star.repeat(input));
            } else {
                System.out.println(star + " ".repeat(input - 2) + star);
            }
        }
    }

    public static void dikUcgen() {

        System.out.println("Çizilmesini istediğiniz dik üçgen boyutunu giriniz : ");

        int input = scanner.nextInt();

        String start = "";

        for (int i = 1; i <= input; i++) {
            start = start.concat(String.valueOf(i));
            System.out.println(start);
        }
    }

    public static void carpimTablosu() {

        System.out.println("Çarpım tablosu yapılacak sayısı giriniz : ");

        int input = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = input * i;
            System.out.println(input + " X " + i + " = " + result);
        }
    }

    public static void asalSayiBul() {

        System.out.println("Girilen aralıktaki asal sayıları bulmak için başlangıç noktasını giriniz: ");

        int start = scanner.nextInt();

        System.out.println("Girilen aralıktaki asal sayıları bulmak için bitiş noktasını giriniz");

        int finish = scanner.nextInt();

        while (start < finish) {
            boolean flag = false;

            for (int i = 2; i <= start / 2; i++) {
                if (start % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(start + "");
            }

            start++;

        }
    }

    public static void terstenYazdir() {
        System.out.println("Tersten yazılmasını istediğiniz metni giriniz : ");

        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }


    public static void cumleninIlkHarfiBuyuk() {

        System.out.println("Girilen cümlenin her kelimesinin ilk harfini büyük yapan uygulama için metin giriniz : ");

        String input = scanner.nextLine().toLowerCase();
        System.out.print(input.toUpperCase().charAt(0));

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i - 1) == ' ') {
                System.out.print(input.toUpperCase().charAt(i));
            } else {
                System.out.print(input.charAt(i));
            }

        }
    }


    public static void ifadeIciRakamlar() {
        System.out.println("Rakam ve harf içeren bir kelime giriniz : ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }

    }


    public static void main(String[] args) {

        do {
        	System.out.println();
            System.out.println("------------------------JAVA 56 ODEV 1 --------------------------------");
            System.out.println("--------- MENÜDEN KULLANMAK İSTEDİĞİNİZ İLGİLİ METOTU SEÇİNİZ----------");
            System.out.println("------------------------------MENÜ ------------------------------------");
            System.out.println("1. İÇİ DOLU KARE YAZDIRMA");
            System.out.println("2. İÇİ BOŞ KARE");
            System.out.println("3. RAKAMLARLA DİK ÜÇGEN YAPIMI");
            System.out.println("4. VERİLEN SAYI İÇİN ÇARPIM TABLOSU YAZDIRMA");
            System.out.println("5. VERİLEN ARALIKTAKİ ASAL SAYILARI YAZDIRMA");
            System.out.println("6. KULLANICININ GİRDİĞİ İFADEYİ TERSİNE YAZDIRMA");
            System.out.println("7. CÜMLENİN KELİMELERİNİN İLK HARFİNİ BÜYÜK HARF YAPMA");
            System.out.println("8. İFADE İÇERİSİNDE GEÇEN RAKAMLARI YAZDIRMA");
            System.out.println("9. ÇIKIŞ");
            System.out.println();
            System.out.println();
            System.out.println("TERCİHİNİZ >>> ");
            

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    doluKare();
                    break;
                case 2:
                    bosKare();
                    break;
                case 3:
                    dikUcgen();
                    break;
                case 4:
                    carpimTablosu();
                    break;
                case 5:
                    asalSayiBul();
                    break;
                case 6:
                    terstenYazdir();
                    break;
                case 7:
                    cumleninIlkHarfiBuyuk();
                    break;
                case 8:
                    ifadeIciRakamlar();
                    break;
                case 9:
                    System.out.println("Uygulamadan çıkıldı");
                    System.exit(0);
                default:
                    System.out.println("Lütfen geçerli bir giriş yapınız.");
                    break;
            }
        } while (true);


    }

}
