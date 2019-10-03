/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program mengeja nama
 */
public class PBO210118080Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        System.out.print("Masukan Nama Depan Anda Unutk Di Eja : ");
        Scanner nm= new Scanner(System.in);
        nama= nm.next();
        System.out.println("");
        System.out.println("Ejaan Untuk '"+nama+"' Adalah : ");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf Ke-"+(i+1)+" : "+nama.substring(i, (i+1)));
        }
    }
    
}
