/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roti;

/**
 *
 * @author candr
 */
public class Roti {
    int tepungTerigu;
    int gulaPasir;
    int butter;
    int ragi;
    int susuBubuk;
    int susuCair;
    int telur;
    int esBatu;
    int varian;
    private int jmlPesanan;
    
    
    int beratAdonan(){
        return this.butter + this.esBatu + this.gulaPasir + this.ragi + this.susuBubuk + this.susuCair + this.telur + this.tepungTerigu;
    }
    
    public void setJmlPesanan(int x){
        if (x < 0) {
            System.out.println("Jumlah pesanan tidak valid");
            System.exit(0);
        } else {
            jmlPesanan = x;
        }
    }
    
    public int getJmlPesanan(){
        return this.jmlPesanan;
    }
    
    
    
    
    
}
