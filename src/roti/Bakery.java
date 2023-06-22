/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;
import interfaces.*;

/**
 *
 * @author candr
 */
public class Bakery implements hargaBahan{
    public static double profit = 40./100;
    RotiTawar rt = new RotiTawar();
    public double modalPerAdonan(){
        rt.tepungTerigu = 1000;
        rt.gulaPasir = 150;
        rt.butter = 150;
        rt.ragi = 20;
        rt.susuBubuk = 300;
        rt.susuCair = 250;
        rt.telur = 80;
        rt.esBatu = 400;
        
        return rt.biayaPerDough();     
    }
    
    public double biayaPerPcs(){
        return this.modalPerAdonan()/rt.beratPerPcs;
    }
    
    public double harga(){
        return this.biayaPerPcs() + this.biayaPerPcs()*Bakery.profit;
    }
    
    public static void main(String[] args) {
        RotiTawar r1 = new RotiTawar(5, 5);
    }
}
