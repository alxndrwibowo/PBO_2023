package Tugas_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tiket admin = new Tiket("admin", "123");

        System.out.print("Masukkan Username : ");
        String user = br.readLine();
        System.out.print("Masukkan Password : ");
        String pass = br.readLine();
        System.out.println();

        if (user.equalsIgnoreCase(admin.getUsername())&&pass.equalsIgnoreCase(admin.getPassword())) {
            do {
                System.out.println("-----MENU TIKET-----");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan (1-3): ");
                int pilih = Integer.parseInt(br.readLine());
                System.out.println();

                switch (pilih) {
                    case 1:
                        System.out.println("-----Input Data Transaksi-----");
                        System.out.print("Nama Hotel : ");
                        String hotel = br.readLine();
                        System.out.print("Jumlah Kamar : ");
                        int jumlahK = Integer.parseInt(br.readLine());
                        System.out.print("Harga Per Kamar : ");
                        int hargaKmr = Integer.parseInt(br.readLine());
                        System.out.print("Nama Pesawat : ");
                        String pesawat = br.readLine();
                        System.out.print("Jumlah Penumpang : ");
                        int jumlahP = Integer.parseInt(br.readLine());
                        System.out.print("Harga Tiket Pesawat : ");
                        int hargaTiket = Integer.parseInt(br.readLine());
                        System.out.print("Tujuan : ");
                        String tujuan = br.readLine();

                        admin = new Tiket(hotel, jumlahK, hargaKmr, pesawat, jumlahP, hargaTiket, tujuan);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("-------Transaksi Tiket Pesawat dan Hotel-------");
                        System.out.println("Tujuan : " + admin.getTujuan());
                        System.out.print("Nama Hotel " + admin.getHotel());
                        System.out.print(" -Jumlah Kamar " + admin.getJumlahKmr());
                        System.out.println(" -Harga Per Kamar " + admin.getHargaKmr());
                        System.out.println("Total Biaya Kamar Hotel dengan diskon 45% : " + admin.getBiaya());
                        System.out.print("Nama Pesawat " + admin.getPesawat());
                        System.out.print(" -Jumlah Penumpang " + admin.getJumlahP());
                        System.out.println(" -Harga Tiket pesawat " + admin.getHargaTiket());
                        System.out.println("Total Harga Tiket Pesawat : " + admin.getTotal() + " dengan biaya asuransi 29.000/penumpang");
                        System.out.println();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            } while (true);
        }
    }
}