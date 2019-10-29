package asistensi_modul1;

import java.util.Scanner;

public class main {
        
    public static void main(String[] args) {
        int sisi = 0, p = 0, l = 0, t = 0, jari = 0;
        double pi = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        bangun_datar call = new bangun_datar();
        
        call.menu();
        int pilih;
        System.out.print("Masukkan Pilihan ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.print("Masukkan Sisi = ");
                sisi = input.nextInt();
                call.getValue(sisi, p, l, t, jari, pi);
                call.volumeKubus();
                break;
                
            case 2:
                System.out.print("Masukkan Panjang = ");
                p = input.nextInt();
                System.out.print("Masukkan Lebar = ");
                l = input.nextInt();
                System.out.print("Masukkan Tinggi = ");
                t = input.nextInt();
                call.getValue(sisi, p, l, t, jari, pi);
                call.volumeBalok();
                break;
                
            case 3:
                System.out.print("Masukkan Jari-Jari = ");
                jari = input.nextInt();
                System.out.print("Masukkan Tinggi = ");
                t = input.nextInt();
                call.getValue(sisi, p, l, t, jari, pi);
                call.volumeTabung();
                break;
        }
        
    }
}
