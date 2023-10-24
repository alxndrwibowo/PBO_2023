package Tugas_3;

public class Tiket {
    private String username, password, hotel, pesawat, tujuan;
    private int jumlahKmr, hargaKmr, jumlahP, hargaTiket, total, biaya;
    public Tiket(String usernm, String pass){
        username=usernm;
        password=pass;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public Tiket (String hotel, int jumlahKmr, int hargaKmr, String pesawat, int jumlahP, int hargaTiket, String tujuan) {
        this.hotel=hotel;
        this.jumlahKmr=jumlahKmr;
        this.hargaKmr=hargaKmr;
        this.pesawat=pesawat;
        this.jumlahP=jumlahP;
        this.hargaTiket=hargaTiket;
        this.tujuan=tujuan;
    }
    public String getTujuan() {
        return this.tujuan;
    }
    public String getHotel() {
        return this.hotel;
    }
    public int getJumlahKmr() {
        return this.jumlahKmr;
    }
    public int getHargaKmr() {
        return this.hargaKmr;
    }
    public int getHargaTiket() {
        return this.hargaTiket;
    }
    public int getJumlahP() {
        return this.jumlahP;
    }
    public String getPesawat() {
        return this.pesawat;
    }
    public int getBiaya() {
        biaya = (getHargaKmr()-(getHargaKmr()*45/100))*getJumlahKmr();
        return biaya;
    }
    public int getTotal() {
        total = (getHargaTiket()*getJumlahP()) + (getJumlahP()*29000);
        return total;
    }
}