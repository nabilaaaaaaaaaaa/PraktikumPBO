package com.nabilaanandamasyaazahra.praktikumpbo.pertemuan5;
public class Array1 {
    public static void main (String[] args ) {
        // Pembuatan Array
        String []  names = new String [5];
        
        //Cek panjang Array
        System.out.println("Panjang array: " + names.length);
        
        // Memasukkan nilai Array
        names[0] = "Rain";
        names[1]="Thunder";
        names[2]= "Storm";
        
        // Menampilkan semua nilai Array
        for(int i=0; i<names.length; i++){
            System.out.println(i +": " + names [i]); 
        }
}
}