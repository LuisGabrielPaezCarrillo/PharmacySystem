package modelo;

public class modeloLogin {
    private String userID;
    private String password;

    public modeloLogin() {
    }

    public modeloLogin(String userID, String password) {
        this.userID = userID;
        this.password = password;
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

    @Override
    public String toString() {
        return "modeloLogin{" + "userID=" + userID + ", password=" + password + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
}
