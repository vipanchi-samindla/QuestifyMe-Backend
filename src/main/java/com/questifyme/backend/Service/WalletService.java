package com.questifyme.backend.Service;

import com.questifyme.backend.Entity.Wallet;
import com.questifyme.backend.Repo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private WalletRepo walletRepo;

    public Wallet getBalance(String username){
        return walletRepo.getBalanceByUserName(username);
    }

    public String addBalance(Object user){
        Wallet wallet = new Wallet();
        wallet.setId(1);
        wallet.setBalance(100.00F);
        wallet.setUsername("mrgeraffe");
        walletRepo.save(wallet);
        return "SUCCESS";
    }
}
