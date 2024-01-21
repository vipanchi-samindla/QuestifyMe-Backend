package com.questifyme.backend.controllers;


import com.questifyme.backend.Repo.ChallengesRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    @Autowired
    private ChallengesRepo challengesRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/get_top_five")
    public ResponseEntity<?> getTopFive(){
        MatchOperation matchCompleted = Aggregation.match(Criteria.where("status").is("completed"));
        GroupOperation groupByUsers = Aggregation.group("users").count().as("completedCount");
        Aggregation aggregation = Aggregation.newAggregation(matchCompleted, groupByUsers, Aggregation.sort(Sort.Direction.DESC, "completed_count"));
        List<String> result = mongoTemplate.aggregate(aggregation, "/challenges", String.class).getMappedResults();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
