package com.kickstarter;

import com.kickstarter.model.Category;
import com.kickstarter.model.Project;
import com.kickstarter.service.CategoryService;
import com.kickstarter.service.ProjectService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by DTarasenko on 1/28/2016.
 */
 public class Kickstarter {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int level = 0;
    private static int menuNumber = 0;

    public static void main(String[] args) {
        Kickstarter app = new Kickstarter();
        app.run();
    }

    private void run() {
        QuoteGeneration quoteGeneration = new QuoteGeneration();
        System.out.println(quoteGeneration.nextQuote());

        while (true) {
            if ((level == 0 || level == 1 ) && menuNumber == 0) {
                showAllCategories();
            } else if (level == 0 && menuNumber != 0) {
                showAllProjectFromCategory(menuNumber);
                level++;
            } else if (level == 1 && menuNumber != 0) {
                showProject(menuNumber);
                level++;
            }

            try{
                String s = reader.readLine();
                menuNumber = Integer.parseInt(s);
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (menuNumber == 0) {
                level = 0;
            }
        }
    }

    private void showAllCategories() {
        CategoryService сategoryService = new CategoryService();
        System.out.println("Category list:");
        for (Category category : сategoryService.getList()) {
            System.out.println(category.getId() + " - " + category.getName());
        }
        System.out.println(0 + " - Exit");
    }

    private void showAllProjectFromCategory(int categoryId) {
        ProjectService projectService = new ProjectService();
        for (Project project : projectService.getListByCategoryId(categoryId)) {
            System.out.println(project.getId() + " - " + project.getName());
        }
        System.out.println(0 + " - Exit");
    }

    private void showProject(int projectId) {
        ProjectService projectService = new ProjectService();
        Project project = projectService.get(projectId);
        System.out.println("Project: #" + project.getId());
        System.out.println("Name: " + project.getName());
        System.out.println("Description: " + project.getDescription());
        System.out.println("Investment: " + project.getGoalAmount());
        System.out.println("Time: " + project.getDays());
        System.out.println(0 + " - Exit");
    }
}
