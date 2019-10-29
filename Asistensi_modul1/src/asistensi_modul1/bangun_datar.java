package asistensi_modul1;
public class bangun_datar {
    public int sisi,panjang,lebar,tinggi,jari;
    public double pi;
        
    public void getValue(int sisi, int panjang, int lebar, int tinggi, int jari, double pi){
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.pi = pi;
        this.jari = jari;
    }
    
    public void menu(){
        System.out.println("1.Volume Kubus");
        System.out.println("2.Volume Balok");
        System.out.println("3.Volume Tabung");
    }
    
    public double volumeKubus(){
        double volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus = "+volume);
        return volume;
    }
    
    public double volumeBalok(){
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok = "+volume);
        return volume;
    }
    
    public double volumeTabung(){
        double volume = pi*jari*jari*tinggi;
        System.out.println("Volume Tabung = "+volume);
        return volume;
    }
    
}
