/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class nomor2 {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("Menentukan Bilangan Ganjil atau Genap");
        System.out.println ("Masukan Angka=");
        bil=input.nextInt();
        
        if(bil%2==0){
            System.out.println("Bilangan"+bil+"adalah bilangan genap");
        }else{System.out.println("Bilangan"+bil+"adalah bilagan ganjil");
    }
}
}
