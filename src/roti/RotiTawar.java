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
public class RotiTawar extends Roti implements hargaBahan{
    public RotiTawar(){
        this.tepungTerigu = 1000;
        this.gulaPasir = 150;
        this.butter = 150;
        this.ragi = 20;
        this.susuBubuk = 300;
        this.susuCair = 250;
        this.telur = 80;
        this.esBatu = 400;
    }
    
    public RotiTawar(int jumlah, int varian){
        this.tepungTerigu = 1000;
        this.gulaPasir = 150;
        this.butter = 150;
        this.ragi = 20;
        this.susuBubuk = 300;
        this.susuCair = 250;
        this.telur = 80;
        this.esBatu = 400;
        
        
        if (varian < 1 || varian > 3){
            System.out.println("varian tidak ada");
            System.exit(esBatu);
        } else {
        this.varian = varian;
        }
    }
    double biayaVarian(){
        switch (this.varian) {
            case 1 :
             
    }
    }
    
    double biaya(){
        return hargaBahan.GULA_PASIR * this.gulaPasir;
    }
    
    double biayaPerDough(){
        return hargaBahan.TEPUNG_TERIGU * this.tepungTerigu + hargaBahan.GULA_PASIR*this.gulaPasir + hargaBahan.BUTTER*this.butter + hargaBahan.RAGI*this.ragi + hargaBahan.SUSU_BUBUK*this.susuBubuk + hargaBahan.SUSU_CAIR*this.susuCair + hargaBahan.TELUR*this.telur + hargaBahan.ES_BATU*this.esBatu;
    }
}
