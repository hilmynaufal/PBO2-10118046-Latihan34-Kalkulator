/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : memnghasilkan hasil penambahan, pengurangan, perkalian, dan pembagian degan memasukan dua angka
 */
public class PBO210118046Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        
        DecimalFormat df = new DecimalFormat("#,##0.##", symbols);
        
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("======Aplikasi Kalkulator Bilangan======");
        System.out.print("Masukkan Angka ke-1: ");
        Scanner scanner = new Scanner(System.in);
        kalkulator.setValue1(scanner.nextDouble());
        System.out.print("Masukkan Angka ke-2: ");
        kalkulator.setValue2(scanner.nextDouble());
        
        System.out.println("\nHasil penambahan: " + kalkulator.tambahBilangan());
        System.out.println("Hasil pengurangan: " + kalkulator.kuranghBilangan());
        System.out.println("Hasil perkalian: " + kalkulator.kaliBilangan());
        System.out.println("Hasil pembagian: " +  df.format(kalkulator.bagiBilangan()));
        System.out.println("Hasil sisa: " + kalkulator.sisaBilangan());
        
    }

}
