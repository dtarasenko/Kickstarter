package com.kickstarter.dao.arrays;

import com.kickstarter.dao.ProjectDao;
import com.kickstarter.model.Project;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public class ProjectDaoArrays implements ProjectDao {

    private Project[] projects;

    private static ProjectDaoArrays projectDaoArrays;

    private ProjectDaoArrays() {
        projects = new Project[9];

        projects[0] = new Project(1, "Stalker", "Amazing game in Chornobyl area", 1000, 10, 2, 1);
        projects[1] = new Project(2, "Diablo 5", "Old school RPG game about devils", 2000, 20, 2, 1);
        projects[2] = new Project(3, "Fallout 5", "Old school RPG game about post nuclear period", 2000, 20, 2, 1);

        projects[3] = new Project(4, "Stalker", "Amazing game in Chornobyl area", 1000, 10, 3, 1);
        projects[4] = new Project(5, "Diablo 5", "Old school RPG game about devils", 2000, 20, 3, 1);
        projects[5] = new Project(6, "Fallout 5", "Old school RPG game about post nuclear period", 2000, 20, 3, 1);

        projects[6] = new Project(7, "Stalker", "Amazing game in Chornobyl area", 1000, 10, 9, 1);
        projects[7] = new Project(8, "Diablo 5", "Old school RPG game about devils", 2000, 20, 9, 1);
        projects[8] = new Project(9, "Fallout 5", "Old school RPG game about post nuclear period", 2000, 20, 9, 1);


    }

    @Override
    public void create(Project project) {

    }

    @Override
    public void update(Project project) {

    }

    @Override
    public void delete(Project project) {

    }

    @Override
    public Project get(int id) {
        return projects[id - 1];
    }

    @Override
    public Project[] getList() {
        return projects;
    }

    public static ProjectDaoArrays getProjectDaoArrays() {
        if (projectDaoArrays == null) {
            projectDaoArrays = new ProjectDaoArrays();
        }
        return projectDaoArrays;
    }
}
