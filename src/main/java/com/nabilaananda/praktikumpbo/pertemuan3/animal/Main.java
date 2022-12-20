package com.nabilaananda.praktikumpbo.pertemuan3.animal;
public class Main {
    
    public static void main(String[] args) {
        // Membuat object dari class Animal
        Animal cat = new Animal ("popo", 5, "grey") ;
        Animal dog = new Animal ("popi", 3, "brown" ) ;
        Animal rabbit = new Animal () ;
       
        
        //Memanggil method
        cat.showProfile();
         dog.showProfile();
          rabbit.showProfile();
          
          // Demo Getter & Setter
          System.out.println("Dog's name (before): " + dog.getName()); 
          dog.setName("popo");
          System.out.println("Dog's name (after): " + dog.getName() );
        
    }
    
}
