/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2.deklarasi.pengaksesan.variable;

/**
 *
 * @author USER
 */
public class Latihan2DeklarasiPengaksesanVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variable
        int nilaiInt;
        final double PHI = 3.14; //kontanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variable nilai = " + nilaiInt);
        System.out.println("Isi variable PHI" + PHI);
        System.out.println("Isi variable Logika = " + nilaiLogika);
        System.out.println("Isi variable Karakter = " + nilaiKarakter);
    }
    
}
