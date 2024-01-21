package com.questifyme.backend.Service;

import com.questifyme.backend.Entity.Challenges;
import com.questifyme.backend.Repo.ChallengesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChallengsService {

    @Autowired
    private ChallengesRepo challengesRepo;


    public String addChallenge(Challenges req) {
        challengesRepo.save(req);
        return "Challenge Created!!";
    }

    public String editChallenge(Challenges req) {
        challengesRepo.save(req);
        return "Challenge Edited!!";
    }

    public List<Challenges> GetAllChallengesByName(String userName) {
        return challengesRepo.getChallengsByUserName(userName);
    }

    public List<Challenges> GetTopFiveLeaderboard(String userName) {
        return challengesRepo.getChallengsByUserName(userName);
    }

    public List<Challenges> taskProgress(String userName) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        Date startDate = calendar.getTime();
        List<Challenges> challenges = new ArrayList<>();
        challenges.addAll(challengesRepo.findByCreatedByAndStatusAndDeadlineBetween(userName, "Completed", startDate,  new Date()));
        challenges.addAll(challengesRepo.findByCreatedByAndStatusAndDeadlineBetween(userName, "Failed", startDate,  new Date()));
        return challenges;
    }
}

