package Pert_1;

public class contoh { //identitas -> dibuat dengan public class (g pake main)

    //atribut = variabel dari class
//    private/protected -> berdiri sendiri
    private String name;
    public double ipk;

//    Operasi/fungsi
//    - setter (prosedur), pake void
    public void setName(String n){
        //jika nama atribut pd class = nama atribut pada parameter setter/getter
        //maka pake "this" --> this.name=name (kalo String name parameternya)
        name = n;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

//    - getter (fungsi -> tanpa parameter, harus ada return string), pake tipe data
    public String getName(){
        return this.name;
    }

    public double getIpk(){
        return this.ipk;
    }

//    - custom method --> fungsi" lain

    //Instance of class -> sebuah class yang hrs lebih spesifik
}