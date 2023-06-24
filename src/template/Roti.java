/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template;
import interfaces.*;

/**
 *
 * @author candr
 */
public abstract class Roti implements hargaBahan{
    protected int tepungTerigu;
    protected int gulaPasir;
    protected int butter;
    protected int ragi;
    protected int susuBubuk;
    protected int susuCair;
    protected int telur;
    protected int esBatu;
    protected int varian;
    protected int totalBerat;
    protected int jmlPesanan;
    protected int beratPerPcs;
    
    public double biayaPerDough(){
        return hargaBahan.TEPUNG_TERIGU * this.tepungTerigu + hargaBahan.GULA_PASIR*this.gulaPasir + hargaBahan.BUTTER*this.butter + hargaBahan.RAGI*this.ragi + hargaBahan.SUSU_BUBUK*this.susuBubuk + hargaBahan.SUSU_CAIR*this.susuCair + hargaBahan.TELUR*this.telur + hargaBahan.ES_BATU*this.esBatu;
    }
    public double biayaPerPcs(){
        return this.biayaPerDough()/(this.totalBerat/this.beratPerPcs) + this.biayaVarian();
    }
    protected double biayaVarian(){
        return this.varian;
    }
    public double  hargaPerPcs(){
        return this.biayaPerPcs() + this.biayaPerPcs()*40./100 ;
    }
}
