/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.smt2;

/**
 *
 * @author Lenovo
 */
public class CatatOrder {
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
    

