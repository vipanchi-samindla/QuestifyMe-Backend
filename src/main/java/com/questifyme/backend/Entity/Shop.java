package com.questifyme.backend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document("shops")

public class Shop {
    @Id
    private int id;
    private String name;
    private int xp;
    private int rewards;
    private List<String> purchased_by;

    private String Image;

    public Shop(int id, String name, int xp, int rewards, List<String> purchased_by,String image) {
        this.id = id;
        this.name = name;
        this.xp = xp;
        this.rewards = rewards;
        this.purchased_by = purchased_by;
        this.Image = image;
    }

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    public List<String> getPurchased_by() {
        return purchased_by;
    }

    public void setPurchased_by(List<String> purchased_by) {
        this.purchased_by = purchased_by;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
