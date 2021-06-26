package com.vdab.Shopr.services;

import com.vdab.Shopr.domain.Book;
import com.vdab.Shopr.domain.BookFiction;
import com.vdab.Shopr.domain.BookNonFiction;
import com.vdab.Shopr.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSvc {
    
    @Autowired
    private BookRepo bookRepo = new BookRepo();
    
    public List<BookFiction> showFictionBooks(){
        return bookRepo.showFictionBooks();
    }
    
//    public List<BookNonFiction> showNonFictionBooks(){ return bookRepo.showNonFictionBooks();
//    }
    
}
