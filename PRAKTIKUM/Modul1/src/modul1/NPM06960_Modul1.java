package modul1;
import java.util.Scanner;
public class NPM06960_Modul1 {
    static void menu(){
        System.out.println("1.Volume Kubus");
        System.out.println("2.Volume Balok");
        System.out.println("3.Volume Tabung");
    }
    
    static double volumeKubus(int sisi){
        double volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus = "+volume);
        return volume;
    }
    
    static double volumeBalok(int panjang, int lebar, int tinggi){
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok = "+volume);
        return volume;
    }
    
    static double volumeTabung(double pi, int jari, int tinggi){
        double volume = pi*jari*jari*tinggi;
        System.out.println("Volume Tabung = "+volume);
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
        int pilih;
        System.out.print("Masukkan Pilihan ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                int sisi;
                System.out.print("Masukkan Sisi = ");
                sisi = input.nextInt();
                volumeKubus(sisi);
                break;
                
            case 2:
                int p, l, t;
                System.out.print("Masukkan Panjang = ");
                p = input.nextInt();
                System.out.print("Masukkan Lebar = ");
                l = input.nextInt();
                System.out.print("Masukkan Tinggi = ");
                t = input.nextInt();
                volumeBalok(p,l,t);
                break;
                
            case 3:
                double pi = 3.14;
                int jari, ttab;
                System.out.print("Masukkan Jari-Jari = ");
                jari = input.nextInt();
                System.out.print("Masukkan Tinggi = ");
                ttab = input.nextInt();
                volumeTabung(pi,jari,ttab);
                break;
        }
        
    }
    
}
