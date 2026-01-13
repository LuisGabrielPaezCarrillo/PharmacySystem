package modelo;

public class modeloRegistroUser {
    
    private String userID;
    private String password;
    private String Cpassword;
    private String rol;

    public modeloRegistroUser() {
    }

    public modeloRegistroUser(String userID, String password, String Cpassword, String rol) {
        this.userID = userID;
        this.password = password;
        this.Cpassword = Cpassword;
        this.rol = rol;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return Cpassword;
    }

    public void setCpassword(String Cpassword) {
        this.Cpassword = Cpassword;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "modeloRegistroUser{" + "userID=" + userID + ", password=" + password + ", Cpassword=" + Cpassword + ", rol=" + rol + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
}
