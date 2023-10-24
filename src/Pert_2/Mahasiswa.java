package Pert_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mahasiswa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        contoh2 mahasiswa = new contoh2();

        System.out.print("Masukkan NIM : ");
        mahasiswa.setNim(br.readLine());
        System.out.print("Masukkan Nama : ");
        mahasiswa.setNama(br.readLine());
        System.out.print("Masukkan Mata Kuliah : ");
        mahasiswa.setMK(br.readLine());
        System.out.print("Masukkan Prodi : ");
        mahasiswa.setProdi(br.readLine());
        System.out.print("Masukkan Nilai Tugas : ");
        mahasiswa.setTugas(Double.parseDouble(br.readLine()));
        System.out.print("Masukkan Nilai UTS : ");
        mahasiswa.setUts(Double.parseDouble(br.readLine()));
        System.out.print("Masukkan Nilai UAS : ");
        mahasiswa.setUas(Double.parseDouble(br.readLine()));

        System.out.println();
        System.out.println("==============");

        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Prodi : " + mahasiswa.getProdi());
        System.out.println("MK : " + mahasiswa.getMK());
        System.out.println("NA : " + mahasiswa.getNA());
    }
}