package com.questifyme.backend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("quests")
public class Quests {

    @Id
    private int id;
    private String startDate;
    private String endDate;
    private String BossName;
    private int rewards;
    private int xp;
    private int Progress;
    private String status;
    private List<String> completed_users;

    private String name;


    public Quests(int id, String startDate, String endDate, String bossName, int rewards, int xp, int progress, String status, List<String> completed_users, String name) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        BossName = bossName;
        this.rewards = rewards;
        this.xp = xp;
        Progress = progress;
        this.status = status;
        this.completed_users = completed_users;
        this.name = name;
    }

    public Quests() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBossName() {
        return BossName;
    }

    public void setBossName(String bossName) {
        BossName = bossName;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getProgress() {
        return Progress;
    }

    public void setProgress(int progress) {
        Progress = progress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getCompleted_users() {
        return completed_users;
    }

    public void setCompleted_users(List<String> completed_users) {
        this.completed_users = completed_users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
