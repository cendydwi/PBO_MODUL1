/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOTHING
 */
import java.util.Scanner;
public class NPM06960soalpendahuluan1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d, t, pi = 3.14, v;
        System.out.print("Diameter: ");
        d=input.nextInt();
        System.out.print("Tinggi: ");
        t=input.nextInt();
        v = (d/2*pi*pi)*t;
        System.out.println("Output Program\nVolume tabung adalah " + v);
    }
}
