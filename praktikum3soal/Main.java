/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3soal;

/**
 *
 * @author Wiyandra
 */
public class Main {
    public static void main(String[] args) {
        Mobil MobilWiyandra = new Mobil("Nissan", "Skyline R34", 2002, "Hitam");
        Mobil MobilSyaiful = new Mobil("Lamborghini", "Aventador", 2011, "Putih");
        
        MobilWiyandra.displayInfo();
        MobilWiyandra.setWarna("Biru");
        MobilWiyandra.displayInfo();
        
        MobilSyaiful.displayInfo();
        MobilSyaiful.setWarna("Abu-Abu");
        MobilWiyandra.displayInfo();
        
        MobilWiyandra.startEngine();
        MobilSyaiful.startEngine();
    }
}
