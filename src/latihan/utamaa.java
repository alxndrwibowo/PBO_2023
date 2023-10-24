package latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class utamaa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        login user1 = new login();
        login user2 = new login("","");

        while(true) {
            System.out.println("--- MENU LOGIN ---");
            System.out.println("1. Login admin");
            System.out.println("2. buat user");
            System.out.println("3. Ubah password");
            System.out.println("4, Lihat data user");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan (1-5) : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan username : ");
                    String user = br.readLine();
                    System.out.print("Masukkan password : ");
                    String pass = br.readLine();
                    System.out.println();
                    if (user.equalsIgnoreCase(user1.getUsername())&&pass.equalsIgnoreCase(user1.getPassword())) {
                        System.out.println("login berhasil");
                    } else {
                        System.out.println("login gagal");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan username : ");
                    String newUser = br.readLine();
                    System.out.print("Masukkan password : ");
                    String newPass = br.readLine();

                    user2 = new login(newUser, newPass);
                    System.out.println();
                    System.out.println("user berhasil dibuat");
                    break;
                case 3:
                    System.out.print("Masukkan pasword lama : ");
                    String passLama = br.readLine();
                    System.out.print("Masukkan password baru : ");
                    String passBaru = br.readLine();
                    System.out.println();
                    if (passLama.equalsIgnoreCase(user1.getPassword())) {
                        user1.setPassword(passBaru);
                        System.out.println("password berhasil diubah");
                    } else {
                        System.out.println("anda salah memasukkan password lama");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("--- Lihat Data User 1 ---");
                    System.out.println("User 1");
                    System.out.println("Username user 1 : " + user1.getUsername());
                    System.out.println("Password user 1 : " + user1.getPassword());
                    System.out.println("--- Lihat Data User 2 ---");
                    System.out.println("User 2");
                    System.out.println("Username user 2 : " + user2.getUsername());
                    System.out.println("Password user 2 : " + user2.getPassword());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }


    }
}
