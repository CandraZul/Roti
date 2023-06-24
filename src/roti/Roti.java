/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roti;

/**
 *
 * @author candr
 */
public abstract class Roti {
    int tepungTerigu;
    int gulaPasir;
    int butter;
    int ragi;
    int susuBubuk;
    int susuCair;
    int telur;
    int esBatu;
    int varian;
    int totalBerat;
    int jmlPesanan;
    int beratPerPcs;
    
    abstract double biayaPerDough();
    double biayaPerPcs(){
        return this.biayaPerDough()/this.beratPerPcs + this.biayaVarian();
    }
    abstract double biayaVarian();
    double hargaPerPcs(){
        return this.biayaPerPcs() + this.biayaPerPcs()*40./100 ;
    }
}
