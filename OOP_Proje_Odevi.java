package com.mycompany.oop_proje_odevi;
import java.util.Scanner;
/**
 *
 * @author daggu
 */
public class OOP_Proje_Odevi {
    public static void main(String[] args) {
        //Nesneler
        Scanner girdi = new Scanner(System.in);
        Goruntuleme goruntule = new Goruntuleme();
        Goruntuleme.Gitar_Yazdir gitar = goruntule.new Gitar_Yazdir();
        Goruntuleme.Baglama_Yazdir baglama = goruntule.new Baglama_Yazdir();
        Goruntuleme.Piyano_Yazdir piyano = goruntule.new Piyano_Yazdir();
        Goruntuleme.Akordiyon_Yazdir akordiyon = goruntule.new Akordiyon_Yazdir();
        Goruntuleme.Darbuka_Yazdir darbuka = goruntule.new Darbuka_Yazdir();
        Goruntuleme.Bateri_Yazdir bateri = goruntule.new Bateri_Yazdir();
        Goruntuleme.Keman_Yazdir keman = goruntule.new Keman_Yazdir();
        Goruntuleme.Klarnet_Yazdir klarnet = goruntule.new Klarnet_Yazdir();
        Goruntuleme.Ney_Yazdir ney = goruntule.new Ney_Yazdir();
        //Kod
        System.out.println("Enstrümalar:\n  #Telli Çalgılar:\n\t-Gitar\n\t-Bağlama\n  #Tuşlu Çalgılar:\n\t-Piyano\n\t-Akordiyon\n  #Vurmalı Çalgılar:\n\t-Darbuka\n\t-Bateri\n  #Yaylı Çalgılar:\n\t-Keman\n  #Nefesli Çalgılar:\n\t-Klarnet\n\t-Ney");
        System.out.println("Hakkında bilgi edinmek istediğiniz enstrümanı yazınız:");
        String enstruman = girdi.nextLine(); enstruman = enstruman.toLowerCase();
        //Exception
        if( ("gitar".equals(enstruman)) || ("baglama".equals(enstruman)) || ("piyano".equals(enstruman)) || ("akordiyon".equals(enstruman)) || ("darbuka".equals(enstruman)) || ("bateri".equals(enstruman)) || ("keman".equals(enstruman)) || ("klarnet".equals(enstruman)) || ("ney".equals(enstruman)) ){
            }
        else {
            throw new IllegalArgumentException("Lütfen geçerli bir enstrüman çeşidi giriniz.");
        }
        //Gitar Goruntuleme
        if("gitar".equals(enstruman)){
             System.out.println("Gitar ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi = girdi.nextInt();
            switch (sayi) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', akor basma için 'a' , solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        gitar.Gitar_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o', akor basma için 'a', solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        gitar.Gitar_Goruntuleme(secim, secim1);
                    }
                case 3 -> gitar.Gitar_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Baglama Goruntuleme
        else if("baglama".equals(enstruman)){
             System.out.println("Bağlama ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi1 = girdi.nextInt();
            switch (sayi1) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o'', akor basma için 'a', solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        baglama.Baglama_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o'', akor basma için 'a', solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        baglama.Baglama_Goruntuleme(secim, secim1);
                    }
                case 3 -> baglama.Baglama_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Piyano Goruntuleme
        else if("piyano".equals(enstruman)){
            System.out.println("Piyano ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi2 = girdi.nextInt();
            switch (sayi2) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        piyano.Piyano_Goruntule(secim);
                    }
                case 2 ->                     {
                        piyano.Piyano_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Akordiyon Goruntuleme
        else if("akordiyon".equals(enstruman)){
            System.out.println("Akordiyon ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi3 = girdi.nextInt();
            switch (sayi3) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        akordiyon.Akordiyon_Goruntule(secim);
                    }
                case 2 ->                     {
                        akordiyon.Akordiyon_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Darbuka Goruntuleme
        else if("darbuka".equals(enstruman)){
            System.out.println("Darbuka ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi4 = girdi.nextInt();
            switch (sayi4) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        darbuka.Darbuka_Goruntule(secim);
                    }
                case 2 ->                     {
                        darbuka.Darbuka_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Bateri Goruntuleme
        else if("bateri".equals(enstruman)){
            System.out.println("Bateri ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi5 = girdi.nextInt();
            switch (sayi5) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        bateri.Bateri_Goruntule(secim);
                    }
                case 2 ->                     {
                        bateri.Bateri_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Keman Goruntuleme
        else if("keman".equals(enstruman)){
             System.out.println("Keman ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi6 = girdi.nextInt();
            switch (sayi6) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', akor basma için 'a', solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        keman.Keman_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o', akor basma için 'a', solo için 's' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        keman.Keman_Goruntuleme(secim, secim1);
                    }
                case 3 -> keman.Keman_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Klarnet Goruntuleme
        else if("klarnet".equals(enstruman)){
            System.out.println("Klarnet ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi7 = girdi.nextInt();
            switch (sayi7) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        klarnet.Klarnet_Goruntule(secim);
                    }
                case 2 ->                     {
                        klarnet.Klarnet_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        //Ney Goruntuleme
        else if("ney".equals(enstruman)){
            System.out.println("Ney ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi8 = girdi.nextInt();
            switch (sayi8) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o', nasıl çalınacağı ile ilgi 'c' giriniz ");
                        char secim = girdi.next().charAt(0);
                        ney.Ney_Goruntule(secim);
                    }
                case 2 ->                     {
                        ney.Ney_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
    }
}