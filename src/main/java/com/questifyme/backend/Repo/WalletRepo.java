package com.questifyme.backend.Repo;

import com.questifyme.backend.Entity.User;
import com.questifyme.backend.Entity.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface WalletRepo extends MongoRepository<Wallet, Integer> {

    @Query("{'username':?0}")
    Wallet getBalanceByUserName(String name);
}
