/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumInterface;

/**
 *
 * @author WINDOWS 10
 */
public class InterfaceSample {
    public static void main(String[] args) {
        
    InterfaceBujurSangkar objek1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+ objek1.hitungLuas());
        System.out.println("Kelilingnya                       = "+ objek1.hitungKeliling());
        System.out.println("\n");
        
    InterfaceBangunDatar objek2 = new InterfaceSegitiga(6, 8){};
        System.out.println("Luas segitiga dengan alas 6 dan tinggi 8 = "+objek2.hitungLuas());
        System.out.println("Kelilingnya                              = "+objek2.hitungKeliling());
    }
}
