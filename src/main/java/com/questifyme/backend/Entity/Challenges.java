package com.questifyme.backend.Entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document("challenges")
public class Challenges {
    private long id;
    private String name;
    private String status;
    private String description;
    private Date deadline;
    @CreatedDate
    private Date created_date;
    private List<String> users;
    private String createdBy;

    private String edited_by;
    private int rewards;
    private int xp;

    public Challenges() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }


    public String getEdited_by() {
        return edited_by;
    }

    public void setEdited_by(String edited_by) {
        this.edited_by = edited_by;
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

    public Challenges(long id, String name, String status, String description, Date deadline, Date created_date, List<String> users, String createdBy, String edited_by, int rewards, int xp) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.description = description;
        this.deadline = deadline;
        this.created_date = created_date;
        this.users = users;
        this.createdBy = createdBy;
        this.edited_by = edited_by;
        this.rewards = rewards;
        this.xp = xp;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
