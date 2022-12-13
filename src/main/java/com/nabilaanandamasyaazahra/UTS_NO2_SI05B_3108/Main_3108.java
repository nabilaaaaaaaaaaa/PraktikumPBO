package com.nabilaanandamasyaazahra.UTS_NO2_SI05B_3108;
public class Main_3108 {
    public static void main(String[] args) {

        Commission_Employee_3108 c1 = new Commission_Employee_3108(400000,60000,7,"papang","2567");
        Project_Planner_3108 p1 = new Project_Planner_3108(400000,80000,5,"wahyu","8966");
        Salaried_Employee_3108 s1 = new Salaried_Employee_3108(100000,"sigit","67789");
        
        System.out.println("DATA COMMISION EMPLOYEE");
        c1.tampilData();
        c1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA PROJECT PLANNER");
        p1.tampilData();
        p1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA SALARIED EMPLOYEE");
        s1.tampilData();
        s1.hitungGaji();
        
    }

}
