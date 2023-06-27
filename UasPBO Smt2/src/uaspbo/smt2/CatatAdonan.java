/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author ACER
 */
public class CatatAdonan {
    
     //menghitung berapa takar adonan dari setiap jenis yang perlu dibuat
    
    public double Adonanmanis(){
        TampilOrder obj1 = new TampilOrder();
        obj1.order();
        double adonan;
         double adonan;
        adonan = obj1.doughT() / 2065;
        return Math.ceil(adonan);
    }
    public double AdonanPizza(){
        TampilOrder obj1 = new TampilOrder();
        obj1.order();
        double adonan;
        adonan = obj1.doughP() / 1950;
        return Math.ceil(adonan);
    }
    public double allAdonan(){
        double all;
        all = this.AdonanManis() + this.AdonanTawar() + this.AdonanPizza();
        return all;
    }
    
}
