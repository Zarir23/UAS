/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author refah
 */
public class CatatOrder {
    int doughM;
    int doughT;
    int doughP;
    int pcs;
    String jenis;
    private int varian;
    int keju;
    int coklat;
    int redBean;
    int krim;
    int sosis;
    int beef;
    int bombay;
    
    public void setVarian(int varian){
        if (varian > 0 && varian < 3){
            this.varian = varian;
        }
        else {
            this.varian = 1;
        }
    }
    
    private void rotiManis(){
        doughM = doughM + 50;
    }
    
    private void rotiTawar(){
        doughT = doughT + 400;
    }
    
    private void pizza(){
        doughP = doughP + 190;
    }
    
    private void varianM(){
        switch (varian){
            case 1 -> {
                keju = keju + 5;
                coklat = coklat + 10;
            }
            case 2 -> {
                redBean = redBean + 10;
                krim = krim + 5;
            }
            case 3 -> {
                keju = keju + 10;
                sosis = sosis + 10;
            }
        }
    }
    
    private void varianT(){
        switch (varian){
            case 1 -> coklat = coklat + 80;
            case 2 -> keju = keju + 80;
        }
    }
    
    private void varianP(){
        if (varian == 1){
            keju = keju + 30;
            sosis = sosis + 50;
            beef = beef + 50;
            bombay = bombay + 30;
        }
    }
    
    public void catatOrder(){
        while (pcs > 0) {
            if (jenis == "manis"){
                this.rotiManis();
                this.varianM();
            }
            else if (jenis == "tawar"){
                this.rotiTawar();
                this.varianT();
            }
            else {
                this.pizza();
                this.varianP();
            }
            pcs = pcs - 1;
            
        }
    }
}