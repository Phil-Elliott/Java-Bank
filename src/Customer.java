package src;

public class Customer {
    private String name;
    private String password;
    private Account account;

    public void newCustomer(String name, String password) {
        this.name = name;
        this.password = password;
        this.account = new Account();

        System.out.println("Congrats on creating a new account. Now you can sign in!"); 

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Account getAccount() {
        return account;
    }
    
}
