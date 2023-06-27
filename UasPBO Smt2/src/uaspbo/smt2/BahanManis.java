/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author 62821
 */
public class BahanManis {
     CatatAdonan obj1 = new CatatAdonan();
    
    
    public double tepungTerigu(){
        double tepung = obj1.AdonanManis() * 1000;
        return tepung;
    }
    public double gulaPasir(){
        double gula = obj1.AdonanManis() * 150;
        return gula;
    }
    public double butter(){
        double butter = obj1.AdonanManis() * 150;
        return butter;
    }
    public double ragi(){
        double ragi = obj1.AdonanManis() * 20;
        return ragi;
    }
    public double susuBubuk(){
        double susub = obj1.AdonanManis() * 300;
        return susub;
    }
    public double susuCair(){
        double susuc = obj1.AdonanManis() * 250;
        return susuc;
    }
    public double telur(){
        double telur = obj1.AdonanManis() * 80;
        return telur;
    }
    public double esBatu(){
        double es = obj1.AdonanManis() * 400;
        return es;
    }
}
