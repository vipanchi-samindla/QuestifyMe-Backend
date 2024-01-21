package com.questifyme.backend.Repo;

import com.questifyme.backend.Entity.Challenges;
import com.questifyme.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepo extends MongoRepository<User, Integer> {

    @Query("{'username':?0}")
    User getByUserName(String name);
}
