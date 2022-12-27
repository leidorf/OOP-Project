/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_proje_odevi;

/**
 *
 * @author daggu
 */
public class Keman extends Yayli_Calgilar{
    @Override
    public void Ozellikler(){
        System.out.println("Özellikler:\nKeman (veya viyolon), viyola ve viyolonselin de bulunduğu violin ailesinin en yüksek tondan çalan, en küçük üyesidir.\nDört teli vardır. Akort sesleri pesten tize sol, re, la ve mi'dir. Keman yayına arşe denir.");
    }
    public void Yay_Cekme(){
        System.out.println("Nasıl Çalınır:\nYayı doğru bir şekilde tutmak için yayı kemanın eşiği ve tuşenin arasında bulunan bölgeye tam ortalayarak koymamız gerekir.\nİkinci adımda, eşikle tuşenin ortasına tam ortalayarak koyduğumuz yayı, dümdüz yani paralel bir şekilde çekip itmeniz gerekir.");
    }
    public void Recine_Surme(){
        System.out.println("Nasıl Ses Çıkartır:\nKeman çalmaya başlamadan önce keman yayına reçine sürülerek, keman yayının sürtünme katsayısı arttırılarak kemandan ses çıkması sağlanılır.");
    }
    
}
