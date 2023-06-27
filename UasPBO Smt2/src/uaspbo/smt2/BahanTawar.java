/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Lenovo
 */
public class BahanTawar {
    CatatAdonan obj1 = new CatatAdonan();
    
    
    public double tepungTerigu(){
        double tepung = obj1.AdonanTawar() * 1000;
        return tepung;
    }
    public double gulaPasir(){
        double gula = obj1.AdonanTawar() * 125;
        return gula;
    }
    public double butter(){
        double butter = obj1.AdonanTawar() * 100;
        return butter;
    }
    public double ragi(){
        double ragi = obj1.AdonanTawar() * 20;
        return ragi;
    }
    public double susuBubuk(){
        double susub = obj1.AdonanTawar() * 250;
        return susub;
    }
    public double susuCair(){
        double susuc = obj1.AdonanTawar() * 200;
        return susuc;
    }
    public double telur(){
        double telur = obj1.AdonanTawar() * 70;
        return telur;
    }
    public double esBatu(){
        double es = obj1.AdonanTawar() * 300;
        return es;
    }
}
