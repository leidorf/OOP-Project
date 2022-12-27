/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_proje_odevi;

/**
 *
 * @author daggu
 */
public class Goruntuleme {
    public Goruntuleme(){}
    
    //Gitar Yazdirma
    public class Gitar_Yazdir{
    public Gitar_Yazdir(){}
    Gitar gitar= new Gitar();
    
    public void Gitar_Goruntuleme(char secim){
        switch (secim) {
            case 'o', 'O' -> gitar.Ozellikler();
            case 'a', 'A' -> gitar.Akor_Basma();
            case 's', 'S' -> gitar.Solo_Calma();
            default -> {
                System.out.println("Lütfen geçerli bir değer giriniz.");
            }
        }
    }
    public void Gitar_Goruntuleme(char secim1, char secim2){
            if( (secim1=='a' && secim2=='o') || (secim1=='o' && secim2 =='a') ){
                gitar.Ozellikler();
                gitar.Akor_Basma();
            }
            else if( (secim1=='o' && secim2=='s') || (secim1=='s' && secim2 =='o')){
                gitar.Ozellikler();
                gitar.Solo_Calma();
            }
            else if( (secim1=='a' && secim2=='s') || (secim1=='s' && secim2 =='a')){
                gitar.Akor_Basma();
                gitar.Solo_Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }
        }
    public void Gitar_Goruntuleme(){
        gitar.Ozellikler(); gitar.Akor_Basma(); gitar.Solo_Calma();
    }
    }
    //Baglama Yazdirma
    public class Baglama_Yazdir{
        public Baglama_Yazdir(){}
        Baglama baglama = new Baglama();
        
        public void Baglama_Goruntuleme(char secim){
            switch (secim) {
                case 'o', 'O' -> baglama.Ozellikler();
                case 'a', 'A' -> baglama.Akor_Basma();
                case 's', 'S' -> baglama.Solo_Calma();
                default -> System.out.println("Lütfen geçerli bir değer giriniz.");
                }
        }
    
    public void Baglama_Goruntuleme(char secim1, char secim2){
            if( (secim1=='a' && secim2=='o') || (secim1=='o' && secim2 =='a')){
                baglama.Ozellikler();
                baglama.Akor_Basma();
            }
            else if( (secim1=='o' && secim2=='s') || (secim1=='s' && secim2 =='o')){
                baglama.Ozellikler();
                baglama.Solo_Calma();
            }
            else if( (secim1=='a' && secim2=='s') || (secim1=='s' && secim2 =='a')){
                baglama.Akor_Basma();
                baglama.Solo_Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }
        }
    public void Baglama_Goruntuleme(){
        baglama.Ozellikler(); baglama.Akor_Basma(); baglama.Solo_Calma();
    }
    }
    //Keman Yazdirma
    public class Keman_Yazdir{
        public Keman_Yazdir(){}
        Keman keman = new Keman();
        public void Keman_Goruntuleme(char secim){
            switch (secim) {
                case 'o', 'O' -> keman.Ozellikler();
                case 'n', 'N' -> keman.Yay_Cekme();
                case 's', 'S' -> keman.Recine_Surme();
                default -> System.out.println("Lütfen geçerli bir değer giriniz.");
            }
    }
    
    public void Keman_Goruntuleme(char secim1, char secim2){
            if(  (secim1=='o' && secim2=='n') || (secim1=='n' && secim2 =='o')){
                keman.Ozellikler();
                keman.Yay_Cekme();
            }
            else if( (secim1=='o' && secim2=='s') || (secim1=='s' && secim2 =='o')){
                keman.Ozellikler();
                keman.Recine_Surme();
            }
            else if( (secim1=='s' && secim2=='n') || (secim1=='n' && secim2 =='s')){
                keman.Yay_Cekme();
                keman.Recine_Surme();
            }
        else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }
    }
    public void Keman_Goruntuleme(){
        keman.Ozellikler(); keman.Yay_Cekme(); keman.Recine_Surme();
    
        }
    }  
    //Piyano Yazdirma
    public class Piyano_Yazdir{
        public Piyano_Yazdir(){}
        Piyano piyano = new Piyano();
        
        public void Piyano_Goruntule(char secim){
             if(secim=='o' || secim =='O'){
            piyano.Ozellikler();
            }
            else if(secim=='c' || secim =='C'){
            piyano.Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }
        }
        public void Piyano_Goruntule(){
            piyano.Ozellikler(); piyano.Calma();
        }
    }
    //Akordiyon Yazdirma
    public class Akordiyon_Yazdir{
        public Akordiyon_Yazdir(){}
        Akordiyon akordiyon = new Akordiyon();
        
        public void Akordiyon_Goruntule(char secim){
            if(secim=='o' || secim =='O'){
                akordiyon.Ozellikler();
            }
            else if(secim=='c' || secim =='C'){
                akordiyon.Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }    
        }
        public void Akordiyon_Goruntule(){
            akordiyon.Ozellikler(); akordiyon.Calma();
        }
    }
    //Darbuka Yazdirma
    public class Darbuka_Yazdir{
        public Darbuka_Yazdir(){}
        Darbuka darbuka = new Darbuka();
        
        public void Darbuka_Goruntule(char secim){
             if(secim=='o' || secim =='O'){
            darbuka.Ozellikler();
            }
        else if(secim=='c' || secim =='C'){
            darbuka.Calma();
            }
         else{
            throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }    
        }
        public void Darbuka_Goruntule(){
            darbuka.Ozellikler(); darbuka.Calma();
        }
    }
    //Bateri Yazdirma
    public class Bateri_Yazdir{
        public Bateri_Yazdir(){}
         Bateri bateri = new Bateri();
        
        public void Bateri_Goruntule(char secim){
             if(secim=='o' || secim =='O'){
                bateri.Ozellikler();
            }
            else if(secim=='c' || secim =='C'){
                bateri.Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }
        }
        public void Bateri_Goruntule(){
            bateri.Ozellikler(); bateri.Calma();
        }
    }
    //Klarnet Yazdirma
    public class Klarnet_Yazdir{
        public Klarnet_Yazdir(){}
        Klarnet klarnet = new Klarnet();
        
        public void Klarnet_Goruntule(char secim){
             if(secim=='o' || secim =='O'){
                klarnet.Ozellikler();
            }
            else if(secim=='c' || secim =='C'){
                klarnet.Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }    
        }
        public void Klarnet_Goruntule(){
            klarnet.Ozellikler(); klarnet.Calma();
        }
    }
    //Ney Yazdirma
    public class Ney_Yazdir{
        public Ney_Yazdir(){}
        Ney ney = new Ney();
        
         public void Ney_Goruntule(char secim){
             if(secim=='o' || secim =='O'){
                ney.Ozellikler();
            }
            else if(secim=='c' || secim =='C'){
                ney.Calma();
            }
            else{
                throw new IllegalArgumentException("Lütfen geçerli bir değer giriniz.");
            }    
        }
        public void Ney_Goruntule(){
            ney.Ozellikler(); ney.Calma();
        }
    }
}
