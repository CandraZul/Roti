/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

import base.Roti;
import interfaces.hargaBahan;

/**
 *
 * @author Septiancesare
 */
public class Pizza extends Roti implements hargaBahan{
    public Pizza(int jumlah){
        this.tepungTerigu = 1000;
        this.gulaPasir = 100;
        this.butter = 100;
        this.ragi = 20;
        this.susuBubuk = 200;
        this.susuCair = 180;
        this.telur = 50;
        this.esBatu = 300;
        this.totalBerat = 1950;
        this.beratPerPcs = 190;
        
        if (jumlah < 1){
            System.out.println("Jumlah tidak valid");
            System.exit(0);
        }else{
            this.jmlPesanan=jumlah;
        }
        
        
    }
    
    @Override
    protected double biayaVarian(){
        return hargaBahan.KEJU*30 +hargaBahan.SOSIS*50 +hargaBahan.SMOKED_B*50 +hargaBahan.BAWANG_B*30;
    }
    
    double biayaRotitanpatopping(){
        return this.biayaPerDough()/(this.totalBerat/this.beratPerPcs);
    }
    
    protected double banyakRotiperAdonan(){
        return this.totalBerat / this.beratPerPcs;
    }
    
    protected double kebutuhanTepungg(){
        return (this.tepungTerigu/this.banyakRotiperAdonan())*this.jmlPesanan;
    }
    
    public void printBahann(){
        System.out.println("=========Bahan Pizza==============");
        System.out.println("Tepung Terigu : " + this.kebutuhanTepungg());
        System.out.println("Gula Pasir : " + (this.gulaPasir/this.banyakRotiperAdonan())*this.jmlPesanan);
    }
}
