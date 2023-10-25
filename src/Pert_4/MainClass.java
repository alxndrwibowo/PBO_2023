package Pert_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        subClass s = new subClass("","",0);

        System.out.println("--INPUT--");
        System.out.print("Masukkan nama : ");
        String nama = br.readLine();
        System.out.print("Masukkan keterangan : ");
        String ket = br.readLine();
        System.out.print("Masukkan usia : ");
        int usia = Integer.parseInt(br.readLine());
        System.out.println();

        //masukkan data ke object constructor
        s = new subClass(nama, ket, usia);

        System.out.println("Nama : " + s.getNama());
        System.out.println("Keterangan : " + s.getKeterangan());
        System.out.println("Usia : " + s.getUsia());
    }
}