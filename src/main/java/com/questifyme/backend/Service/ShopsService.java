package com.questifyme.backend.Service;

import com.questifyme.backend.Entity.Shop;
import com.questifyme.backend.Repo.ShopsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShopsService {
    @Autowired
    private ShopsRepo shopsRepo;

    public List<Shop> getAllShopItem() {
        return shopsRepo.findAll();
    }


    public String addShopItem(Shop req) {
        shopsRepo.save(req);
        return "Shop Item Created!!";
    }

    public String addUserToShopItem(String name, Long shopId) {
        List<String> user = new ArrayList<>();
        Optional<Shop> shop = shopsRepo.findById(shopId);
        Shop shop_users = shop.get();
        List<String> all_users = shop_users.getPurchased_by();
        all_users.add(name);
        shop_users.setPurchased_by(all_users);
        shopsRepo.save(shop_users);
        return "User added!!";
    }
}
