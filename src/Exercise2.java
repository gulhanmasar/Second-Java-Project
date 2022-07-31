import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){


    Scanner reader = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin:");
    int sayi1 = reader.nextInt();
        System.out.print("İkinci Sayiyi Girin:");
    int sayi2 = reader.nextInt();

    int toplam = sayi1 + sayi2;
        System.out.println("Sayıların Toplamı:" + toplam);
}
}
