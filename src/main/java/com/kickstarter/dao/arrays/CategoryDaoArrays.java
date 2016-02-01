package com.kickstarter.dao.arrays;

import com.kickstarter.dao.CategoryDao;
import com.kickstarter.model.Category;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public class CategoryDaoArrays implements CategoryDao{

    private Category[] categories;

    private static CategoryDaoArrays categoryDaoArrays;

    private CategoryDaoArrays() {
        categories = new Category[9];
        categories[0] = new Category(1, "Art");
        categories[1] = new Category(2, "Comics");
        categories[2] = new Category(3, "Crafts");
        categories[3] = new Category(4, "Dance");
        categories[4] = new Category(5, "Design");
        categories[5] = new Category(6, "Fashion");
        categories[6] = new Category(7, "Film & Video");
        categories[7] = new Category(8, "Food");
        categories[8] = new Category(9, "Games");
    }

    @Override
    public void create(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public Category get(int id) {
        return categories[id - 1];
    }

    @Override
    public Category[] getList() {
        return categories;
    }

    public static CategoryDaoArrays getCategoryDaoArrays() {
        if (categoryDaoArrays == null) {
            categoryDaoArrays = new CategoryDaoArrays();
        }
        return categoryDaoArrays;
    }
}
