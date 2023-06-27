/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author refah
 */
public class HPizza1 extends HModal implements ForTopping{
    BelanjaBahan obj1 = new BelanjaBahan();
    TampilOrder obj2 = new TampilOrder();

    @Override
    double hTepung() {
        obj2.order();
        double modal;
        modal = obj1.bljTepung() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hGula() {
        obj2.order();
        double modal;
        modal = obj1.bljGula() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hButter() {
        obj2.order();
        double modal;
        modal = obj1.bljButter() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hRagi() {
        obj2.order();
        double modal;
        modal = obj1.bljRagi() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hSusuB() {
        obj2.order();
        double modal;
        modal = obj1.bljSbuk() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hSusuC() {
        obj2.order();
        double modal;
        modal = obj1.bljSca() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hTelur() {
        obj2.order();
        double modal;
        modal = obj1.bljTelur() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    double hEsBatu() {
        obj2.order();
        double modal;
        modal = obj1.bljEs() * 1900/26900 * 10/265;
        return modal;
    }

    @Override
    public double topping() {
        obj2.order();
        double hKeju = obj1.bljKeju() * 30/2450;
        double hSosis = obj1.bljSosis() * 50/1200;
        double hBeef = obj1.bljBeef() * 50/1000;
        double hBombay = obj1.bljBombay() * 30/500;
        return hKeju + hSosis + hBeef + hBombay;
    }
     public int hitung(){
        double hitung = (this.hTepung() + this.hGula() + this.hButter() + this.hRagi() + this.hSusuB() + this.hSusuC() + this.hTelur() + this.hGula() + this.topping()) / 5;
        double laba = hitung * 40 / 100;
        hitung = hitung + laba;
        int harga = (int)hitung;
        return harga;
    }
}
