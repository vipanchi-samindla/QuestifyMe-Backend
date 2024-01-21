package com.questifyme.backend.Service;

import com.questifyme.backend.Entity.Quests;
import com.questifyme.backend.Repo.QuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestsService {
    @Autowired
    private QuestRepo questRepo;


    public String addquest(Quests req) {
        questRepo.save(req);
        return "Success!!";
    }

    public List<Quests> getallquests() {
        return questRepo.findAll();
    }

    public List<Quests> getActiveQuests() {
        List<Quests> res = questRepo.getActiveQuests();
        return res;
    }

    public boolean getCompletionStatus(int quest_id, String username) {
        boolean result;
        Quests quests = new Quests();
        String[] res;
        quests = questRepo.getCompletionStatus(quest_id);
        System.out.println(quests.getCompleted_users());
        return false;
    }

    public List<Quests> getLastFiveQuests() {
        List<Quests> list;
        list = questRepo.findAll(Sort.by(Sort.Direction.DESC, "_id"));
        if(list.size() > 5){
            return list.subList(0,5);
        }
        return list.subList(0,list.size());
    }

    public String addUser(String user, long quest_id) {
        List<String> useradded = new ArrayList<>();
        Optional<Quests> que = questRepo.findById(quest_id);
        Quests completed_users= que.get();
        List<String> users = completed_users.getCompleted_users();
        users.add(user);
        completed_users.setCompleted_users(users);
        questRepo.save(completed_users);
        return "Done!!";
    }
}
