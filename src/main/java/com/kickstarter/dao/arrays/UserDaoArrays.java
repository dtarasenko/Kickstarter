package com.kickstarter.dao.arrays;

import com.kickstarter.dao.UserDao;
import com.kickstarter.model.User;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public class UserDaoArrays implements UserDao {

    @Override
    public void create(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User[] getList() {
        return new User[0];
    }
}
