package com.questifyme.backend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("wallet")
public class Wallet {

    @Id
    private int id;

    private String username;

    private Float balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Wallet() {
    }

    public Wallet(int id, String username, Float balance) {
        this.id = id;
        this.username = username;
        this.balance = balance;
    }
}
