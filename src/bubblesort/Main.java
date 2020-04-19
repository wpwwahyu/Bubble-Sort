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
public class Main {

    public static void main(String[] args) {
        System.out.println("Bubble Sort Java \n");
        bubbleSortProgram bs = new bubbleSortProgram();
        String name[] = bs.input();
        System.out.println("Nama sebelum diurutkan : ");
        bs.tampil(name);
        bs.sort(name);
        System.out.println("Nama sesudah diurutkan : ");
        bs.tampil(name);
    }

}
