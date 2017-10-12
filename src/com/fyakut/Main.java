package com.fyakut;

/**Primity veri tipleri ilkel tipler(byte,int,long,short,boolean,double,float,char)
 * java uygulamalarında veriler arasında uyumsuzluk olabilir.
 * bu durumlarda veri tiplerini dönüştürme işlemi yapılabilir.
 * Küçük olan veri tipi büyük olan veri tipine otomatik cevirimi yapılabilir.
 * Bir yüzük kutusunda ayakkabı saklanamaz ama bir ayakkabı kutusunda yüzük saklanabilir mantığı uygulanabilir.
 */
public class Main {

    public static void main(String[] args) {

        int say = 5 / 3;
        double say2 = 5 / 3d;
        float say3 = 5 / 3f;
        System.out.println("say1 int:" + say);
        System.out.println("say1 double:" + say2);
        System.out.println("say1 float:" + say3);

        /**aynı sayı farklı veritiplerinde farklı sdeğerlere sahip olur.Dönüştürme yapılmalı
         * say1 int:1
         say1 double:1.6666666666666667
         say1 float:1.6666666
         */

        int t1 = 10;
        float t2 = 5.23f;
        double t3 = 15.15d;
        /**
         * a de&#x11f;erine b degerine atamak istedigımıde yani a=b  hata alacakt&#x131;r bu durumda
         *///casting  işlemi
        t1 = (int) t2;
        System.out.println("t1:"+t1);//t1=5 oldu. noktadan sonraki sayılar gitti.

        t2 = (float) t1;
        System.out.println("t2:"+t2);//t2=5.0 oldu.

        /**
         * kelime1-2-3 de aynı tiplerdir. "" içinde yazılanlar metin olup rakam değerinde değildir.
         */
        String kelime1="fatma yakut";
        String kelime2="12";
        String kelime3="20";
        System.out.println(kelime2+kelime3); //çıktısı 32 olmayıp yan yana 1220 olacaktır.
        /**
        //string den integere donusturme

         */
        int a1=Integer.valueOf(kelime2);
        int a2=Integer.parseInt(kelime3);
        System.out.println(a1+a2);//cıktısı 32 olacaktır


int c1=5;
int c2=7;
        System.out.println(c1+c2);//cıktısı=5+7=12 olacaktır
        /**
         * integer den stringe donusturme
         */
        String c3=String.valueOf(c1);
        String c4=String.valueOf(c2);
        System.out.println(c3+c4);// çıktısı yan yana 57 olacaktır
    }
}
