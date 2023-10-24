package Pert_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Step membuat I/O (input Output)
1. import java.io
2. error handling
3. objek dr library I/O (br)
 */
//scanner -> data primitif (char, int, double)
//BufferedReader ->

public class tes {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        contoh c = new contoh();

        try { //jalankan yg benar
            System.out.println("--- INPUT ---");
            c.setName(br.readLine());
            //Integer.parseInt(br.readLine()) klo integer

            System.out.println(c.getName());
            //langsung c.getName() kalo di getter sdh ada println


        } catch (Exception e) { //berjalan kalo try salah
            System.err.println(e.getMessage());
        }
    }
}