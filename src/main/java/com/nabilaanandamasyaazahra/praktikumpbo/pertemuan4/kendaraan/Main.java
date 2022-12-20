
package com.nabilaanandamasyaazahra.praktikumpbo.pertemuan4.kendaraan;
public class Main {
    public static void main(String[] args) {
        
        //class object = new class()
        Mobil mb = new Mobil ();
        Kendaraan kn = new Kendaraan ();
        
        
       // memasukkan nilai attribute
       mb.nama = "Avanza";
       mb.jmlRoda  = 4;
       mb.maxGear = 6;
       
       kn.nama = "Kendaraan misterius";
       kn.jmlRoda=3;
       
       
       // uji coba panggilan method
       mb.showInfo();
       mb.nyalakanMesin();
       mb.belok("kanan");
       mb.belok();
       
        System.out.println("");
        kn.showInfo();
        kn.nyalakanMesin();
    }
}
