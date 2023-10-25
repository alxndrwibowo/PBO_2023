package Pert_4;

//class turunan/ warisan dari class Person = subclass/ anak class
public class Customer extends Person {
    //konsep inheritance adalah (extends dan super)

    private String id;
    //constructor
    public Customer(String nama, String alamat, String id) {
        super(nama, alamat);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //overriding method
    //ctrl+O

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}