/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan36.targetsaldotabungan;

import java.util.Locale;

/**
 *
 * @author Neyza-T
 */
public class PBO210119066Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetSaldoTabungan saldo = new TargetSaldoTabungan();
        
        //proses input
        double saldoAwal = saldo.getSaldo_awal();
        double bungaBulanan = saldo.getBunga();
        double saldoTarget = saldo.getSaldo_target();
        
        //proses perhitungan
        double i = 0;
        do {
            i += 1;
            saldoAwal += Math.floor(saldoAwal * bungaBulanan);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldoAwal);
        }while (saldoAwal<saldotarget);
        
    }
    
}
