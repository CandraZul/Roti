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
public class RotiManis extends Roti implements hargaBahan{
    public RotiManis(int jumlah, int varian){
        this.tepungTerigu = 1000;
        this.gulaPasir = 150;
        this.butter = 150;
        this.ragi = 20;
        this.susuBubuk = 300;
        this.susuCair = 250;
        this.telur = 80;
        this.esBatu = 400;
        this.totalBerat = 2350;
        this.beratPerPcs = 50;
        
        if (jumlah < 1){
            System.out.println("Jumlah tidak valid");
            System.exit(0);
        }else{
            this.jmlPesanan=jumlah;
        }
        
        if (varian < 1 || varian > 3){
            System.out.println("varian tidak ada");
            System.exit(0);
        } else {
            this.varian = varian;
        }
    }
    @Override
    double biayaVarian(){
        return switch (this.varian) {
            case 1 -> hargaBahan.KEJU*5 + hargaBahan.COKLAT*10;
            case 2 -> hargaBahan.SELAI_RB*10 + hargaBahan.KRIM_V*5;
            default -> hargaBahan.KEJU*10 + hargaBahan.SOSIS*10;
        };
    }
    
    double biayaKosongan(){
        return this.biayaPerDough()/(this.totalBerat/this.beratPerPcs);
    }
    
    @Override
    double biayaPerDough(){
        return hargaBahan.TEPUNG_TERIGU * this.tepungTerigu + hargaBahan.GULA_PASIR*this.gulaPasir + hargaBahan.BUTTER*this.butter + hargaBahan.RAGI*this.ragi + hargaBahan.SUSU_BUBUK*this.susuBubuk + hargaBahan.SUSU_CAIR*this.susuCair + hargaBahan.TELUR*this.telur + hargaBahan.ES_BATU*this.esBatu;
    }
}
