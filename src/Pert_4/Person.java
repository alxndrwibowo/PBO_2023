package Pert_4;

public class Person {
    //atribut
    private String nama, alamat;

    //constructor

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    //getter
    //alt + insert (klik kanan generate)
    //ngeblock: shift + arrow bawah

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}