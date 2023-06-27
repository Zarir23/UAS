/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author 62821
 */
public class BahanPizza {
   
    CatatAdonan obj1 = new CatatAdonan();
    
    public double tepungTerigu(){
        double tepung = obj1.AdonanPizza() * 1000;
        return tepung;
    }
    
    public double gulaPasir(){
        double gula = obj1.AdonanPizza() * 100;
        return gula;
    }
    public double butter(){
        double butter = obj1.AdonanPizza() * 100;
        return butter;
    }
    public double ragi(){
        double ragi = obj1.AdonanPizza() * 20;
        return ragi;
    }
    public double susuBubuk(){
        double susub = obj1.AdonanPizza() * 200;
        return susub;
    }
    public double susuCair(){
        double susuc = obj1.AdonanPizza() * 180;
        return susuc;
    }
    public double telur(){
        double telur = obj1.AdonanPizza() * 50;
        return telur;
    }
    public double esBatu(){
        double es = obj1.AdonanPizza() * 300;
        return es;
    }
}
