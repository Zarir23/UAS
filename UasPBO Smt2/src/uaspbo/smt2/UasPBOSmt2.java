/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Muhammad Afif Firdaus
 */
public class UasPBOSmt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TampilOrder obj0 = new TampilOrder();
        obj0.order();
        
        System.out.println("Daftar berat bahan yang dibutuhkan: \n");
        Bahan obj1 = new Bahan();
        System.out.println("Tepung terigu: " + obj1.beliTepungTerigu() + " gram.");
        System.out.println("Gula pasir: " + obj1.beliGulaPasir()+ " gram.");
        System.out.println("Butter: " + obj1.beliButter()+ " gram.");
        System.out.println("Ragi: " + obj1.beliRagi()+ " gram.");
        System.out.println("Susu bubuk: " + obj1.beliSusuB() + " gram.");
        System.out.println("Susu cair: " + obj1.beliSusuC() + " gram.");
        System.out.println("Telur: " + obj1.beliTelur() + " gram.");
        System.out.println("Es batu: " + obj1.beliEsBatu()+ " gram.");
        System.out.println("Keju: " + obj1.beliKeju()+ " gram.");
        System.out.println("Coklat: " + obj1.beliCoklat()+ " gram.");
        System.out.println("Sosis: " + obj1.beliSosis()+ " gram.");
        System.out.println("Krim vanilla: " + obj1.beliKrim()+ " gram.");
        System.out.println("Selai red bean: " + obj1.beliRedbean()+ " gram.");
        System.out.println("Smoked beef: " + obj1.beliBeef()+ " gram.");
        System.out.println("Bawang bombay: " + obj1.beliBombay()+ " gram.");
        
        System.out.println("\nDaftar bahan yang dibeli: \n");
        BeliBahan obj2 = new BeliBahan();
        System.out.println("Tepung terigu: " + obj2.tepungTerigu());
        System.out.println("Gula pasir: " + obj2.gulaPasir());
        System.out.println("Butter: " + obj2.butter());
        System.out.println("Ragi: " + obj2.ragi());
        System.out.println("Susu bubuk: " + obj2.susuBubuk());
        System.out.println("Susu cair: " + obj2.susuCair());
        System.out.println("Telur: " + obj2.telur());
        System.out.println("Es batu: " + obj2.esBatu());
        System.out.println("Keju: " + obj2.keju());
        System.out.println("Coklat: " + obj2.coklat());
        System.out.println("Sosis: " + obj2.sosis());
        System.out.println("Krim vanilla: " + obj2.krimVanilla());
        System.out.println("Selai red bean: " + obj2.redBean());
        System.out.println("Smoked beef: " + obj2.smokedBeef());
        System.out.println("Bawang bombay: " + obj2.bawangBombay());
        
        //System.out.println("\nDaftar harga: \n");
        HManis1 hm1 = new HManis1();
        System.out.println("Harga 1 pcs Roti Manis varian 1: Rp" + hm1.hitung());
        HManis2 hm2 = new HManis2();
        System.out.println("Harga 1 pcs Roti Manis varian 2: Rp" + hm2.hitung());
        HManis3 hm3 = new HManis3();
        System.out.println("Harga 1 pcs Roti Manis varian 3: Rp" + hm3.hitung());
        HTawar1 ht1 = new HTawar1();
        System.out.println("Harga 1 pcs Roti Tawar varian 1: Rp" + ht1.hitung());
        HTawar2 ht2 = new HTawar2();
        System.out.println("Harga 1 pcs Roti Tawar varian 2: Rp" + ht2.hitung());
        HPizza1 hp1 = new HPizza1();
        System.out.println("Harga 1 pcs Pizza varian 1: Rp" + hp1.hitung());
        
    }
    
}
