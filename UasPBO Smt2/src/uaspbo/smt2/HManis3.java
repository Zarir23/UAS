/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author ACER
 */
public class HManis3 extends HModal implements ForFilling{
    BelanjaBahan obj1 = new BelanjaBahan();
    TampilOrder obj2 = new TampilOrder();
    
    //dikali dengan perbandingan adonan manis : total adonan terus dibagi 220 (karena roti manis ada 220 pcs)

    @Override
    double hTepung() {
        obj2.order();
        double modal;
        modal = obj1.bljTepung() * 11000/26900 /220;
        return modal;
    }

    @Override
    double hGula() {
        obj2.order();
        double modal;
        modal = obj1.bljGula() * 11000/26900 /220;
        return modal;
    }

    @Override
    double hButter() {
        obj2.order();
        double modal;
        modal = obj1.bljButter() * 11000/26900 /220;
        return modal;
    }

    @Override
    double hRagi() {
        obj2.order();
        double modal;
        modal = obj1.bljRagi() * 11000/26900 /220;
        return modal;    
    }

    @Override
    double hSusuB() {
        obj2.order();
        double modal;
        modal = obj1.bljSbuk() * 11000/26900 /220;
        return modal;        
    }

    @Override
    double hSusuC() {
        obj2.order();
        double modal;
        modal = obj1.bljSca() * 11000/26900 /220;
        return modal;    
    }

    @Override
    double hTelur() {
         obj2.order();
        double modal;
        modal = obj1.bljTelur() * 11000/26900 /220;
        return modal;       
    }

    @Override
    double hEsBatu() {
        obj2.order();
        double modal;
        modal = obj1.bljEs() * 11000/26900 /220;
        return modal;      
    }

    @Override
    public double filling() {
        int hKeju = obj1.bljKeju() * 10/2450;
        int hSosis = obj1.bljSosis() * 10/1000;
        return hKeju + hSosis;       
    }
    
     public int hitung(){
        double hitung = this.hTepung() + this.hGula() + this.hButter() + this.hRagi() + this.hSusuB() + this.hSusuC() + this.hTelur() + this.hGula() + this.filling();
        double laba = hitung * 40 / 100;
        hitung = hitung + laba;
        int harga = (int)hitung;
        return harga;
    }
    
}
