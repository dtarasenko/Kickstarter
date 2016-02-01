package com.kickstarter.dao;

import com.kickstarter.model.Category;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public interface CategoryDao {
    void create(Category category);
    void update(Category category);
    void delete(Category category);
    Category get(int id);
    Category[] getList();
}
