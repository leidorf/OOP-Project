/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop_proje_odevi;
import java.util.Scanner;
/**
 *
 * @author daggu
 */
public class OOP_Proje_Odevi {

    public static void main(String[] args) {
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
        System.out.println("Hakkında bilgi edinmek istediğiniz enstürmanı yazınız:");
        String ensturman = girdi.nextLine(); ensturman.toLowerCase();
        
        if("gitar".equals(ensturman)){
             System.out.println("Gitar ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi = girdi.nextInt();
            switch (sayi) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        gitar.Gitar_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        gitar.Gitar_Goruntuleme(secim, secim1);
                    }
                case 3 -> gitar.Gitar_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("baglama".equals(ensturman)){
             System.out.println("Bağlama ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi1 = girdi.nextInt();
            switch (sayi1) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        baglama.Baglama_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        baglama.Baglama_Goruntuleme(secim, secim1);
                    }
                case 3 -> baglama.Baglama_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("piyano".equals(ensturman)){
            System.out.println("Piyano ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi2 = girdi.nextInt();
            switch (sayi2) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
                        char secim = girdi.next().charAt(0);
                        piyano.Piyano_Goruntule(secim);
                    }
                case 2 ->                     {
                        piyano.Piyano_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("akordiyon".equals(ensturman)){
            System.out.println("Akordiyon ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi3 = girdi.nextInt();
            switch (sayi3) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
                        char secim = girdi.next().charAt(0);
                        akordiyon.Akordiyon_Goruntule(secim);
                    }
                case 2 ->                     {
                        akordiyon.Akordiyon_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("darbuka".equals(ensturman)){
            System.out.println("Darbuka ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi4 = girdi.nextInt();
            switch (sayi4) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
                        char secim = girdi.next().charAt(0);
                        darbuka.Darbuka_Goruntule(secim);
                    }
                case 2 ->                     {
                        darbuka.Darbuka_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("bateri".equals(ensturman)){
            System.out.println("Bateri ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi5 = girdi.nextInt();
            switch (sayi5) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
                        char secim = girdi.next().charAt(0);
                        bateri.Bateri_Goruntule(secim);
                    }
                case 2 ->                     {
                        bateri.Bateri_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("keman".equals(ensturman)){
             System.out.println("Keman ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '3' yazınız.):");
        int sayi6 = girdi.nextInt();
            switch (sayi6) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        keman.Keman_Goruntuleme(secim);
                    }
                case 2 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', akor basma için 'a' ya da 'A', solo için 's' ya da 'S' giriniz ");
                        char secim = girdi.next().charAt(0);
                        char secim1 = girdi.next().charAt(0);
                        keman.Keman_Goruntuleme(secim, secim1);
                    }
                case 3 -> keman.Keman_Goruntuleme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("klarnet".equals(ensturman)){
            System.out.println("Klarnet ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi7 = girdi.nextInt();
            switch (sayi7) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
                        char secim = girdi.next().charAt(0);
                        klarnet.Klarnet_Goruntule(secim);
                    }
                case 2 ->                     {
                        klarnet.Klarnet_Goruntule();
                    }
                default -> System.out.println("Lütfen geçerli bir değer giriniz");
            }
        }
        
        else if("ney".equals(ensturman)){
            System.out.println("Ney ile ilgili kaç adet bilgi öğrenmek istediğinizi giriniz (Tüm bilgileri öğrenmek için '2' yazınız.):");
        int sayi8 = girdi.nextInt();
            switch (sayi8) {
                case 1 ->                     {
                        System.out.println("Özellikler için 'o' ya da 'O', nasıl çalınacağı ile ilgi 'c' ya da 'C' giriniz ");
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