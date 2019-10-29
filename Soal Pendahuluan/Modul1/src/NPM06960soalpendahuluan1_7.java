/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOTHING
 */
class lingkaran{
    double diameter;
    double pi = 3.14;
    
    public lingkaran(double dm){
        this.diameter = dm;
    }
    
    void keliling(){
        double kll = diameter*pi;
        System.out.println("keliling lingkaran adalah "+kll);
    }
    
    double luas(){
        double luas = diameter/2*pi*pi;
        return luas;
    }
}
public class NPM06960soalpendahuluan1_7 {
    public static void main(String[] args) {
        double diameter = 10;
        lingkaran bulet = new lingkaran(diameter);
        bulet.keliling();
        double LUAS = bulet.luas();
        System.out.println("luas lingkaran adalah "+LUAS);
    }
}
