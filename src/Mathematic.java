public class Mathematic {
    public static void main(String[] args){
        int taban =3 , kuvvet =4;
        long sonuc =1;
        for(;kuvvet !=0;--kuvvet)
        {
            sonuc *=taban;
        }
        System.out.println("Cevaplar=" + sonuc);

        int sayi= 100;
        int toplam= 0;
          for (int i = 1; i<= sayi; ++i)
          {
              toplam += i;
          }
System.out.println("1-1oo arasındaki sayıların toplamı =" + toplam);
    }

}
