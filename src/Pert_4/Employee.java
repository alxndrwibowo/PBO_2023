package Pert_4;

public class Employee extends Person {
    //atribut
    private String id_emp;

    public Employee(String nama, String alamat, String id_emp) {
        super(nama, alamat);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
