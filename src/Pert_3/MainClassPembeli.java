package Pert_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassPembeli {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        1. Pendaftaran Member
        2. Transaksi pembelian barang
           - punya member/tidak
           - jika member (telp), cek no telp sama/tidak dengan yang sudah didaftarkan, dapat poin
           - jika tidak member, hanya proses transaksi biasa

         */

        Pembeli member = new Pembeli("", "", 0, "");
        Pembeli transaksi = new Pembeli("", 0, 0);

        //-const = perlu deklarasi ulang variabel
        String namaBrg, namaPembeli, alamat, noTelp="", telp;
        int usia, jml, hrg;

        try {
            do {
                System.out.println("--- MARET APRIL ---");
                System.out.println("1. Pendaftaran");
                System.out.println("2. Transaksi");
                System.out.println("3. Keluar aplikasi");
                System.out.print("Pilih menu : ");
                int menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1:
                        //1. Pendaftaran member
                        System.out.println("--- Daftar Member ---");
                        System.out.print("Nama : ");
                        namaPembeli = br.readLine();
                        System.out.print("Alamat : ");
                        alamat = br.readLine();
                        System.out.print("No.Telp : ");
                        noTelp = br.readLine();
                        System.out.print("Usia : ");
                        usia = Integer.parseInt(br.readLine());

                        member = new Pembeli(namaPembeli, alamat, usia, noTelp);
                        break;
                    case 2:
                        //2. Transaksi
                        System.out.println("--- Transaksi ---");
                        System.out.print("Nama barang : ");
                        namaBrg = br.readLine();
                        System.out.print("Harga barang : ");
                        hrg = Integer.parseInt(br.readLine());
                        System.out.print("Jumlah beli : ");
                        jml = Integer.parseInt(br.readLine());

                        //data disimpan ke dalam constructor
                        transaksi = new Pembeli(namaBrg, jml, hrg);
                        System.out.println("Total belanja : " + transaksi.getTotal());

                        System.out.print("Member? (Y/N) : ");
                        String jawab = br.readLine();
                        if (jawab.equalsIgnoreCase("y")) {
                            System.out.print("Masukkan No Telp : ");
                            telp = br.readLine();
                            //cek no telp sama dengan yang didaftarkan / tidak
                            if (telp.equals(member.getNoTelp())) {
                                System.out.println("No telp yang didaftarkan : " + member.getNoTelp());
                                System.out.println("Poin anda adalah " + transaksi.getMemberPoin());
                        } else {
                                System.out.println("Mohon maaf, no telp tidak terdaftar");
                            }
                        }
                        break;
                    default:
                        //keluar program
                        System.exit(0);
                }

            } while(true);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
