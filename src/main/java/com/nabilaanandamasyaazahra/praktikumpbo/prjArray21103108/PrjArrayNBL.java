package com.nabilaanandamasyaazahra.praktikumpbo.prjArray21103108;

import java.util.Scanner;

public class PrjArrayNBL {
    public static void main(String[] args) {
        int n, jml =0;
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Jumlah Elemen Array:");
        n = inputan.nextInt();
        int bil[] = new int[5];
        System.out.println("Masukan Elemen Array:");
        for(int i=0; i < 5; i++)
        {
    bil[i] = inputan.nextInt();
    
    jml = jml + bil[i];
}
        System.out.println("jumlah :" +jml);
}
}
