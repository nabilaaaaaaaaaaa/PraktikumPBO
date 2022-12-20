package com.nabilaananda.praktikumpbo.pertemuan3.challenge;
public class Main {
    
    public static void main(String[] args) {
        Challenge bibil = new Challenge("bibil", 7, 2021);
        Challenge rara = new Challenge("rara", 8, 2020);
        Challenge meta = new Challenge ("meta", 9, 2022);
        
        bibil.showProfile();
        rara.showProfile();
        meta.showProfile();
        
        System.out.println("bibil name (before) : " + bibil.getName());
        bibil.setName("butterfly");
        System.out.println("bibil name (after) : " + bibil.getName());
        
    }
}

