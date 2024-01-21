package com.questifyme.backend.Repo;

import com.questifyme.backend.Entity.Challenges;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface ChallengesRepo extends MongoRepository<Challenges, Long> {
    @Query("{'username':?0}")
    List<Challenges> getChallengsByUserName(String name);

    List<Challenges> findByCreatedByAndStatusAndDeadlineBetween(String username, String status, Date startDate, Date endDate);
}
