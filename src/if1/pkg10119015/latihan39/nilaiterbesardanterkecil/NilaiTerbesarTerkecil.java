/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class NilaiTerbesarTerkecil {
    private static Scanner input = new Scanner(System.in);
    private static String namaPetugas;
    private static int banyaknyaNilaiMhs;
    private static int nilaiMhs[];
    private static int nilaiTerkecil = 0;
    private static int nilaiTerbesar = 0;
    
    private static String inputNamaMhs(){
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mhs=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = input.nextLine();
        return namaPetugas;
    }
    
    private static int inputNilaiMhs() {
        inputNamaMhs();
        System.out.print("Masukkan Banyaknya Jumlah Nilai Mhs : ");
        banyaknyaNilaiMhs = input.nextInt();

        nilaiMhs = new int[banyaknyaNilaiMhs];

        for (int i = 0; i < banyaknyaNilaiMhs; i++) {
            System.out.print("Masukkan Nilai Mhs Ke-" + (i + 1) + " = ");
            nilaiMhs[i] = input.nextInt();
        }
        return 0;
    }
    
    private static void cekNilaiTerbesarTerkecil() {
        inputNilaiMhs();
        System.out.println("\n=====Hasil Nilai Mhs=====");
        nilaiTerkecil = nilaiMhs[0];
        for (int i = 0; i < banyaknyaNilaiMhs; i++) {
            System.out.println("Nilai Mhs Ke-" + (i + 1) + " = " + nilaiMhs[i]);

            if (nilaiMhs[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMhs[i];
            }

            if (nilaiMhs[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMhs[i];
            }
        }
    }
    
    public static void tampilNilaiMhs() {
        cekNilaiTerbesarTerkecil();
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
    }
}
