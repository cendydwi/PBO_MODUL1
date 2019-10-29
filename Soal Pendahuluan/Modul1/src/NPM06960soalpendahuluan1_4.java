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
public class NPM06960soalpendahuluan1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang = ' ';
        do{
            int umur;
            System.out.print("Umur: ");umur = input.nextInt();
            if (umur <= 5) {
                System.out.println("Balita");
            }else if (umur > 5 && umur <= 17) {
                System.out.println("Anak-anak");
            }else if (umur > 17 && umur <= 50) {
                System.out.println("Dewasa");
            }else{
                System.out.println("Tua");
            }
            System.out.print("Ulangi y/n ");
            ulang = input.next().charAt(0);
        }while(ulang == 'y');
    }
}
