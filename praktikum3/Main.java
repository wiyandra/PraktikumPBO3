/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Wiyandra
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Blackie", 3);
        kucing.suara();
        kucing.info();
        Hewan anjing = new Hewan("Doggy", 5);
        anjing.berlari();
        
    }
}
