/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Muhammad Afif Firdaus
 */
public class BeliBahan {
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
    Bahan obj1 = new Bahan();
    
    public double tepungTerigu(){
        double beli = obj1.beliTepungTerigu();
        //menentukan berapa kemasan bahan yang harus dibeli:
        //dari keseluruhan jumlah tepung yang dibutuhkan, bagi dengan berat satu kemasan, kemudian bulatkan keatas
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double gulaPasir(){
        double beli = obj1.beliGulaPasir();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double butter(){
        double beli = obj1.beliButter();
        beli = beli / 500;
        return Math.ceil(beli);
    }
    public double ragi(){
        double beli = obj1.beliRagi();
        beli = beli / 11;
        return Math.ceil(beli);
    }
    public double susuBubuk(){
        double beli = obj1.beliSusuB();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double susuCair(){
        double beli = obj1.beliSusuC();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double telur(){
        double beli = obj1.beliTelur();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double esBatu(){
        double beli = obj1.beliEsBatu();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double keju(){
        double beli = obj1.beliKeju();
        beli = beli / 250;
        return Math.ceil(beli);
    }
    public double coklat(){
        double beli = obj1.beliCoklat();
        beli = beli / 500;
        return Math.ceil(beli);
    }
    public double sosis(){
        double beli = obj1.beliSosis();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double krimVanilla(){
        double beli = obj1.beliKrim();
        beli = beli / 500;
        return Math.ceil(beli);
    }
    public double redBean(){
        double beli = obj1.beliRedbean();
        beli = beli / 500;
        return Math.ceil(beli);
    }
    public double smokedBeef(){
        double beli = obj1.beliBeef();
        beli = beli / 1000;
        return Math.ceil(beli);
    }
    public double bawangBombay(){
        double beli = obj1.beliBombay();
        beli = beli / 500;
        return Math.ceil(beli);
    }
}
