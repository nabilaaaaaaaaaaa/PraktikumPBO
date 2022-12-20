
package com.nabilaanandamasyaazahra.praktikumpbo.polimorfisme;

public abstract class Polimorfisme {
 // Menghitung Luas Persegi Panjang
 public abstract double luas ();

 // Menghitung Keliling
 public abstract double keliling();

 public void display(){
 System.out.println("Luas : " + luas());
 System.out.println("Keliling : " + keliling());
     }
}