package com.kickstarter.dao;

import com.kickstarter.model.User;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public interface UserDao {
    void create(User user);
    void update(User user);
    void delete(User user);
    User get(int id);
    User[] getList();
}
