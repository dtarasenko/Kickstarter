package com.kickstarter.service;


import com.kickstarter.dao.ProjectDao;
import com.kickstarter.dao.arrays.ProjectDaoArrays;
import com.kickstarter.model.Project;

public class ProjectService {

    private ProjectDao projectDao;

    public ProjectService() {
        this.projectDao = ProjectDaoArrays.getProjectDaoArrays();
    }

    public Project[] getListByCategoryId(int categoryId) {
        Project[] projectsByCategory = new Project[3];
        int j = 0;
        for (Project project : projectDao.getList()) {
            if (project.getCategoryId() == categoryId) {
                projectsByCategory[j] = project;
                j++;
            }
        }
        return projectsByCategory;
    }

    public Project get(int id) {
        return projectDao.get(id);
    }
}
