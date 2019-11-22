/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambingglobal;

/**
 *
 * @author USER
 */
public class Latihan5KambingGlobal {
    // Variable jumlahKambing menjadi variable instance
    
    int jumlahKambing = 88;
    
    // Methode untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
       Latihan5KambingGlobal kambingSusu = new Latihan5KambingGlobal();
       
       // Menampikan jumlah kambing yang ada saat program pertama x berjalan
       kambingSusu.getJumlahKambing();
       
       // Menambah satu Kambing
       kambingSusu.tambahKambing();
       
       // Menambah Satu Kambing
       kambingSusu.getJumlahKambing();
       
    }
    
}
