package com.kickstarter.model;

/**
 * Created by DTarasenko on 1/28/2016.
 */
public class Project {

    private int id;
    private String name;
    private String description;
    private int goalAmount;
    private int pledgedAmount;
    private int days;
    private int categoryId;
    private int userId;

    public Project(int id, String name, String description, int goalAmount, int days, int categoryId, int userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.goalAmount = goalAmount;
        this.pledgedAmount = 0;
        this.days = days;
        this.categoryId = categoryId;
        this.userId = userId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(int goalAmount) {
        this.goalAmount = goalAmount;
    }

    public int getPledgedAmount() {
        return pledgedAmount;
    }

    public void setPledgedAmount(int pledgedAmount) {
        this.pledgedAmount = pledgedAmount;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
