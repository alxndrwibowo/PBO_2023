package latihan;

public class login {
    private String username;
    private String password;

    public login() {
        this.username="admin";
        this.password="123456";
    }
    public login(String usernm, String pass){
        this.username=usernm;
        this.password=pass;
    }

    public void setUsername(String usernm) {
        this.username=usernm;
    }
    public void setPassword(String pass) {
        this.password=pass;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
}
