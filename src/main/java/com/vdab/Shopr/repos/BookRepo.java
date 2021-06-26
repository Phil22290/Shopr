package com.vdab.Shopr.repos;

import com.vdab.Shopr.domain.Article;
import com.vdab.Shopr.domain.Book;
import com.vdab.Shopr.domain.BookFiction;
import com.vdab.Shopr.domain.BookNonFiction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BookRepo {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<BookFiction> showFictionBooks(){
        return entityManager.createQuery("select b from BookFiction b", BookFiction.class).getResultList();
    }
//            return entityManager.createNamedQuery("showFictionBooks", BookFiction.class).getResultList();
//
//    public List<BookNonFiction> showNonFictionBooks(){
//        return entityManager.createNamedQuery("showNonFictionBooks", BookNonFiction.class).getResultList();
//    }
    
//    @Transactional
//    public void addArticleToDb(Article article) {
//        entityManager.persist(article);
//
//    }
    
}
