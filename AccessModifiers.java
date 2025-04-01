public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "anushka";
        System.out.println(myAcc.username);

        // myAcc.password = "hjg";  // ERROR  password has private access in BankAccount
        myAcc.setPassword("kajupatkar08");
        
    }
}

class BankAccount {
    public String username;
    private String password;

    // make public function for private attributes
    void setPassword(String pwd) {
        this.password = pwd;
    }
}
