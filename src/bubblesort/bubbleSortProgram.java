/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Wahyu Priyo W
 */
public class bubbleSortProgram {

    public void sort(String nama[]) {
        String temp;

        for (int i = 0; i < nama.length; i++) {

            for (int j = 0; j < nama.length - 1; j++) {
                System.out.println(nama[j].compareTo(nama[j + 1]));
                if (nama[j].compareTo(nama[j + 1]) > 0) {
                    temp = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp;

                }
            }
        }
    }

    public void tampil(String nama[]) {
        for (int i = 0; i < nama.length - 1; i++) {
            System.out.print(nama[i] + "\n");
        }
        System.out.println(nama[nama.length - 1]);
    }

    public String[] input() {
        Scanner a = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan Jumlah Nama : ");
        jumlah = a.nextInt();
        String nama[] = new String[jumlah];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama ke-" + (i + 1) + " : ");
            nama[i] = sc.nextLine();
        }
        return nama;
    }
}
