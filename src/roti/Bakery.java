/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;
import java.util.Scanner;

/**
 *
 * @author candr
 */
public class Bakery{    
    public static void main(String[] args) {
        RotiManis r1 = new RotiManis(1, 1);
        System.out.println("harga adalah "+r1.hargaPerPcs());
        System.out.println("harga tanpa varian" + r1.biayaKosongan());
        System.out.println("biaya varian" + r1.biayaVarian());
    }
}
