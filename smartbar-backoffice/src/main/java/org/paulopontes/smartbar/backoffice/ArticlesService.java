package org.paulopontes.smartbar.backoffice;

import jakarta.enterprise.context.ApplicationScoped;
import org.paulopontes.smartbar.backoffice.api.model.Article;

@ApplicationScoped
public class ArticlesService {
    public Article get() {
        return new Article().name("cola");
    }
}
