/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

/**
 *
 * @author candr
 */
public class Bakery{    
    public static void main(String[] args) {
        RotiManis r1 = new RotiManis(4, 1);
        System.out.println("harga adalah "+r1.hargaPerPcs());
        System.out.println("harga tanpa varian" + r1.biayaKosongan());
        System.out.println("biaya varian" + r1.biayaVarian());
        System.out.println("biaya adonan" + r1.biayaPerDough());
        r1.printBahan();
        
        Pizza p1 = new Pizza(50);
        System.out.println("Harga Pizza /pcs : "+p1.hargaPerPcs());
        System.out.println("Harga Pizza tanpa topping : "+p1.biayaRotitanpatopping());
        System.out.println("Harga topping : "+p1.biayaVarian());
        p1.printBahan();
    }
}
