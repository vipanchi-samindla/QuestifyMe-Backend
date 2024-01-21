package com.questifyme.backend.Service;

import com.questifyme.backend.Entity.User;
import com.questifyme.backend.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public String addUser(User user){
        try {
            userRepo.save(user);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "SUCCESS";
    }

    public User getUser(String username){
            User user = userRepo.getByUserName(username);
        return user;
    }

    public String reduceHealth(String username){
        try {
            User user = userRepo.getByUserName(username);
            user.setHealth(user.getHealth() - 10);
            userRepo.save(user);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "SUCCESS";
    }

    public String updateCharacter(String character, String username){
        try {
            User user = userRepo.getByUserName(username);
            user.setCharacter(character);
            userRepo.save(user);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "SUCCESS";
    }
}
