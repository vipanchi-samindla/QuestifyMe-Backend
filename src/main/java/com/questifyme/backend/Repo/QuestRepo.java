package com.questifyme.backend.Repo;

import com.questifyme.backend.Entity.Quests;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuestRepo extends MongoRepository<Quests, Long> {

    @Query("{ 'status' : 'Active' }")
    List<Quests> getActiveQuests();

    @Query("{'_id': ?0}")
    Quests getCompletionStatus(int quest_id);
}
