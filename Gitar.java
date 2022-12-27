/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_proje_odevi;

/**
 *
 * @author daggu
 */
public class Gitar extends Telli_Calgilar {
        public Gitar(){}
        @Override
        public void Ozellikler(){
            System.out.println("Özellikler:\nGitar, genellikle altı telli, ses perdeli müzik aletidir.\nÇalanın vücuduna karşı düz tutulur ve baskın el ile telleri tıngırdatarak çalarken aynı anda seçilen telleri ses perdelerine karşı elin parmaklarıyla bastırarak çalınır.\nTellere vurmak için pena veya parmak pick'leri kullanılabilir.");
        }
        public void Akor_Basma(){
            System.out.println("Akor Basma:\nAkor dendiğinde genellikle üç veya daha fazla sesin aynı anda tınlaması ifade edilir. Akor, her çalgı ile çalınamaz.\nAkor çalabilen çalgıların başında tüm çalgıların anası kabul edilen piyano ve en yaygın çalgı olarak bilinen gitar gelmektedir.\nBu iki çalgı da aynı anda üç ya da üç den fazla ses çalabilir.");
        }
        public void Solo_Calma(){
            System.out.println("Solo Çalma:\nSolo gitar, çoğunlukla gitarın ince notalarında çalınan, ritim gitara göre daha hızlı olan melodiler bütününe verilen isim.\nRock müzik, metal müzik, blues, caz, bazı pop müzik türleri ve diğer müzik türlerinde solo gitar sıklıkla kullanılır.\nArka planda ikinci bir gitar olarak ritim gitar bulunabilir.");
        }
}
