/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Lenovo
 */
public class HTawar2 extends HModal implements ForFilling{
    BelanjaBahan obj1 = new BelanjaBahan();
    TampilOrder obj2 = new TampilOrder();

    //dikali dengan perbandingan adonan tawar : total adonan
    @Override
    double hTepung() {
        obj2.order();
        double modal;
        modal = obj1.bljTepung() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hGula() {
        obj2.order();
        double modal;
        modal = obj1.bljGula() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hButter() {
        obj2.order();
        double modal;
        modal = obj1.bljButter() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hRagi() {
        obj2.order();
        double modal;
        modal = obj1.bljRagi() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hSusuB() {
        obj2.order();
        double modal;
        modal = obj1.bljSbuk() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hSusuC() {
        obj2.order();
        double modal;
        modal = obj1.bljSca() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hTelur() {
        obj2.order();
        double modal;
        modal = obj1.bljTelur() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    double hEsBatu() {
        obj2.order();
        double modal;
        modal = obj1.bljEs() * 14000/26900 * 35/265;
        return modal;
    }

    @Override
    public double filling() {
        double hKeju;
        hKeju = obj1.bljKeju() * 80/2450;
        return hKeju;
    }
    
    public int hitung(){
        double hitung = this.hTepung() + this.hGula() + this.hButter() + this.hRagi() + this.hSusuB() + this.hSusuC() + this.hTelur() + this.hGula() + this.filling();
        double laba = hitung * 40 / 100;
        hitung = hitung + laba;
        int harga = (int)hitung;
        return harga;
    }
    
}
