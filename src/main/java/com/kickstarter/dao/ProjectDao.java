package com.kickstarter.dao;

import com.kickstarter.model.Project;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public interface ProjectDao {
    void create(Project project);
    void update(Project project);
    void delete(Project project);
    Project get(int id);
    Project[] getList();
}
