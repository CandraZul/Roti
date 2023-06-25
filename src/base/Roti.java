/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base;
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
        return this.biayaPerDough()/this.totalBerat*this.beratPerPcs + this.biayaVarian();
    }
    protected double biayaVarian(){
        return this.varian;
    }
    public double  hargaPerPcs(){
        return this.biayaPerPcs() + this.biayaPerPcs()*40./100 ;
    }
    
    protected double kebutuhanTepung(){
        return (this.tepungTerigu/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanGula(){
        return (this.gulaPasir/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanButter(){
        return (this.butter/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanRagi(){
        return (this.ragi/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanSusuBubuk(){
        return (this.susuBubuk/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanSusuCair(){
        return (this.susuCair/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanTelur(){
        return (this.telur/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    protected double kebutuhanEsBatu(){
        return (this.esBatu/(this.totalBerat / this.beratPerPcs))*this.jmlPesanan;
    }
    
    
    
    public void printBahan(){
        System.out.println("========== B A H A N =========");
        System.out.println("Tepung : "+this.kebutuhanTepung()+" gr");
        System.out.println("Gula : "+this.kebutuhanGula()+" gr");
        System.out.println("Butter : "+this.kebutuhanButter()+" gr");
        System.out.println("Ragi : "+this.kebutuhanRagi()+" gr");
        System.out.println("Susu bubuk : "+this.kebutuhanSusuBubuk()+" gr");
        System.out.println("Susu Cair : "+this.kebutuhanSusuCair()+" gr");
        System.out.println("Telur : "+this.kebutuhanTelur()+" gr");
        System.out.println("Es Batu : "+this.kebutuhanEsBatu()+" gr");
        System.out.println("===============================");
    }
}
    
