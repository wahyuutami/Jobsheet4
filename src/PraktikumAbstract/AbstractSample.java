/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumAbstract;

/**
 *
 * @author WINDOWS 10
 */
public class AbstractSample {
    public static void main(String[] args) {
        
        BangunDatar objek1 = new BujurSangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+ objek1.hitungLuas());
        System.out.println("Kelilingnya                       = "+ objek1.hitungKeliling());
        System.out.println("\n");
        
        BangunDatar objek2 = new Lingkaran(7);
        
        System.out.println("Luas lingkaran dengan jari - jari 7 = "+objek2.hitungLuas());
        System.out.println("Kelilingnya                         = "+objek2.hashCode());
    }
}
