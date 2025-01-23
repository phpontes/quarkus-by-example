package org.paulopontes.smartbar.backoffice;

import jakarta.enterprise.context.ApplicationScoped;
import org.paulopontes.smartbar.backoffice.api.model.Category;

@ApplicationScoped
public class CategoriesService {
    public Category get() {
        return new Category().name("drinks");
    }
}