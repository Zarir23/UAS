/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author ACER
 */
public class TampilOrder {
    double item;
    int keju;
    int coklat;
    int sosis;
    int krim;
    int redbean;
    int beef;
    int bombay;
    public double itemM;
    public double itemT;
    public double itemP;
    
    public double order(){
        CatatOrder item1 = new CatatOrder();
        item1.pcs = 50;
        item1.jenis = "manis";
        item1.setVarian(1);
        item1.catatOrder();
        
        CatatOrder item2 = new CatatOrder();
        item2.pcs = 100;
        item2.jenis = "manis";
        item2.setVarian(2);
        item2.catatOrder();
        
        CatatOrder item3 = new CatatOrder();
        item3.pcs = 70;
        item3.jenis = "manis";
        item3.setVarian(3);
        item3.catatOrder();
        
        CatatOrder item4 = new CatatOrder();
        item4.pcs = 20;
        item4.jenis = "tawar";
        item4.setVarian(1);
        item4.catatOrder();
        
        CatatOrder item5 = new CatatOrder();
        item5.pcs = 15;
        item5.jenis = "tawar";
        item5.setVarian(2);
        item5.catatOrder();
        
        CatatOrder item6 = new CatatOrder();
        item6.pcs = 10;
        item6.jenis = "pizza";
        item6.setVarian(1);
        item6.catatOrder();
        
        keju = item1.keju + item3.keju + item5.keju + item6.keju;
        coklat = item1.coklat + item4.coklat;
        sosis = item3.sosis + item6.coklat;
        krim = item2.krim;
        redbean = item2.redBean;
        beef = item6.beef;
        bombay = item6.bombay;
        itemM = item1.doughM + item2.doughM + item3.doughM;
        itemT = item4.doughT + item5.doughT;
        itemP = item6.doughP;
        item = itemM + itemT + itemP;
        return item;
    }
    public double dough(){
        return item;
    }
    public double doughM(){
        return itemM;
    }
    public double doughT(){
        return itemT;
    }
    public double doughP(){
        return itemP;
    }
    
    public void tampilOrder(){
        System.out.println("h " + item);    
    }
    
}
