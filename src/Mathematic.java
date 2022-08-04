public class Mathematic {


    int number;
    String name;
    public Mathematic(int num, String ad){

        this.name = ad;
        this.number = num;

    }


    public static void main(String[] args){

        Mathematic ma = new Mathematic(1, "gulhan");

        System.out.println("My name is " + ma.name);

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
