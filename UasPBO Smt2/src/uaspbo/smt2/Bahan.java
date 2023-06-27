/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Muhammad Afif Firdaus
 */
public class Bahan {
    TampilOrder o = new TampilOrder();
    BahanManis m = new BahanManis();
    BahanTawar t = new BahanTawar();
    BahanPizza p = new BahanPizza();
    
    public double beliTepungTerigu(){
        double beli = m.tepungTerigu() + t.tepungTerigu() + p.tepungTerigu();
        return beli;
    }
    public double beliGulaPasir(){
        double beli = m.gulaPasir() + t.gulaPasir() + p.gulaPasir();
        return beli;
    }
    public double beliButter(){
        double beli = m.butter() + t.butter() + p.butter();
        return beli;
    }
    public double beliRagi(){
        double beli = m.ragi() + t.ragi() + p.ragi();
        return beli;
    }
    public double beliSusuB(){
        double beli = m.susuBubuk() + t.susuBubuk() + p.susuBubuk();
        return beli;
    }
    public double beliSusuC(){
        double beli = m.susuCair() + t.susuCair() + p.susuCair();
        return beli;
    }
    public double beliTelur(){
        double beli = m.telur() + t.telur() + p.telur();
        return beli;
    }
    public double beliEsBatu(){
        double beli = m.esBatu() + t.esBatu() + p.esBatu();
        return beli;
    }
    public double beliKeju(){
        o.order();
        double beli = o.keju;
        return beli;
    }
    public double beliCoklat(){
        o.order();
        double beli = o.coklat;
        return beli;
    }
    public double beliSosis(){
        o.order();
        double beli = o.sosis;
        return beli;
    }
    public double beliKrim(){
        o.order();
        double beli = o.krim;
        return beli;
    }
    public double beliRedbean(){
        o.order();
        double beli = o.redbean;
        return beli;
    }
    public double beliBeef(){
        o.order();
        double beli = o.beef;
        return beli;
    }
    public double beliBombay(){
        o.order();
        double beli = o.bombay;
        return beli;
    }
}
