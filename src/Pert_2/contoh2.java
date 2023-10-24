package Pert_2;
public class contoh2 {
    //membuat program untuk menghitung nilai akhir dari MK PBO per mahasiswa
    //NA = (uts*20%) + (uas*25%) + (tugas*55%)
    /* contoh output
        NIM : 0111
        Nama : Jodi
        Prodi : SI
        MK : PBO
        NA : 88
     */

    //atribut
    private String nim, nama, prodi, MK;
    private double uts, uas, tugas, NA;

    //operasi (ada getter dan setter(bisa diganti constructor))

    // - setter
    public void setNim (String nim) {
        this.nim = nim;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setUts(double uts){
        this.uts = uts;
    }
    public void setUas(double uas){
        this.uas = uas;
    }
    public void setTugas(double t){
        tugas = t;
    }
    public void setMK(String matkul){
        MK = matkul;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getNim() {
        return this.nim;
    }
    public String getNama() {
        return this.nama;
    }
    public String getProdi() {
        return this.prodi;
    }
    public String getMK() {
        return this.MK;
    }
    public double getUts() {
        return this.uts;
    }
    public double getUas() {
        return this.uas;
    }
    public double getTugas() {
        return this.tugas;
    }

    //custom method
    public double getNA() {
        NA = (getUts()*0.2) + (getUas()*0.25) + (getTugas()*0.55);
        //kalo integer, NA = (getUts()*20/100) + (getUas()*25/100) + (getTugas()*55/100);
        return this.NA;
    }

    //utk cetak NIM + NA
    public void cetakData() {
        System.out.println("NIM : " + getNim() + "\n" + "Nilai Akhir : " + getNA());
    }
}