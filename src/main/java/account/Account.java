package account;

import entity.User;
import enums.AccountStatus;

public abstract class Account {
    private String userName;
    private String password;
    private User user; // Refers to an instance of the User class
    private AccountStatus status; // Refers to the AccountStatus enum

    public abstract boolean resetPassword();
}
