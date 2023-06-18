package src;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> accounts = new ArrayList<>();
    private Customer signedInAccount;

    public Customer getCustomer(String name) {
        for (Customer customer : accounts) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public void signIn(String name, String password) {
        for (Customer customer : accounts) {
            if (customer.getName().equals(name) && customer.getPassword().equals(password)) {
                signedInAccount = customer;
                System.out.println("You are signed in");
            }
        }
    }

    public void createAccount(String name, String password) {
        Customer customer = new Customer();

        customer.newCustomer(name, password);

        accounts.add(customer);
    }

    public void signOut() {
        signedInAccount = null;
    }

    public Account getAccount() {
        if (signedInAccount != null) {
            return signedInAccount.getAccount();
        } else {
            return null;
        }
    }
}
