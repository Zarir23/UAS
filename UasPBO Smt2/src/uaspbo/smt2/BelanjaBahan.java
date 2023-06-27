/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author 62821
 */
public class BelanjaBahan {
    /*
    1 kemasan Tepung Terigu 1000 gr = 40000
    1 kemasan Gula Pasir 1000 gr = 25000
    1 kemasan Butter 500 gr = 23000
    1 kemasan Ragi 11 gr = 5000
    1 kemasan Susu Bubuk 1000 gr = 39000
    1 kemasan Susu Cair 1000 gr = 24000
    1 kemasan Telur 1000 gr = 23000
    1 kemasan Es Batu 1000 gr = 2000
    
    1 kemasan Keju 250 gr = 31000
    1 kemasan Coklat 500 gr = 29000
    1 kemasan Krim Vanilla 500 gr = 30000
    1 kemasan Red Bean 500 gr = 25000
    1 kemasan Sosis 1000 gr = 80000
    1 kemasan Smoked Beef 1000 gr 90000
    1 kemasan Bawang Bombay 500 gr 40000
    */
    BeliBahan obj1 = new BeliBahan();
    int totalBelanja;
    
    public int bljTepung(){
        double modal = obj1.tepungTerigu() * 40000;
        int harga = (int)modal;
        return harga;
    }
    public int bljGula(){
        double modal = obj1.gulaPasir()* 25000;
        int harga = (int)modal;
        return harga;
    }
    public int bljButter(){
        double modal = obj1.butter()* 23000;
        int harga = (int)modal;
        return harga;
    }
    public int bljRagi(){
        double modal = obj1.ragi()* 5000;
        int harga = (int)modal;
        return harga;
    }
    public int bljSbuk(){
        double modal = obj1.susuBubuk()* 39000;
        int harga = (int)modal;
        return harga;
    }
    public int bljSca(){
        double modal = obj1.susuCair()* 24000;
        int harga = (int)modal;
        return harga;
    }
    public int bljTelur(){
        double modal = obj1.telur()* 23000;
        int harga = (int)modal;
        return harga;
    }
    public int bljEs(){
        double modal = obj1.esBatu()* 2000;
        int harga = (int)modal;
        return harga;
    }
    public int bljKeju(){
        double modal = obj1.keju() * 31000;
        int harga = (int)modal;
        return harga;
    }
    public int bljCoklat(){
        double modal = obj1.coklat()* 29000;
        int harga = (int)modal;
        return harga;
    }
    public int bljSosis(){
        double modal = obj1.sosis()* 80000;
        int harga = (int)modal;
        return harga;
    }
    public int bljKrim(){
        double modal = obj1.krimVanilla()* 30000;
        int harga = (int)modal;
        return harga;
    }
    public int bljRed(){
        double modal = obj1.redBean()* 25000;
        int harga = (int)modal;
        return harga;
    }
    public int bljBeef(){
        double modal = obj1.tepungTerigu() * 90000;
        int harga = (int)modal;
        return harga;
    }
    public int bljBombay(){
        double modal = obj1.tepungTerigu() * 40000;
        int harga = (int)modal;
        return harga;
    }
    
    public void totalBelanja(){
        totalBelanja = this.bljTepung() + this.bljGula() + this.bljButter() + this.bljRagi() + this.bljSbuk() + this.bljSca() + this.bljTelur() + this.bljEs() + this.bljKeju() + this.bljCoklat() + this.bljSosis() + this.bljKrim() + this.bljRed() + this.bljBeef() + this.bljBombay();
    }
}