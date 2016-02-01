package com.kickstarter.service;

import com.kickstarter.dao.CategoryDao;
import com.kickstarter.dao.arrays.CategoryDaoArrays;
import com.kickstarter.model.Category;

/**
 * Created by DTarasenko on 1/30/2016.
 */
public class CategoryService {

    private CategoryDao categoryDao;

    public CategoryService() {
        this.categoryDao = CategoryDaoArrays.getCategoryDaoArrays();
    }

    public Category[] getList() {
        return categoryDao.getList();
    }

}
