package com.questifyme.backend.Repo;

import com.questifyme.backend.Entity.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopsRepo extends MongoRepository<Shop, Long> {
}
