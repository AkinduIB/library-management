package com.example.library_management.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_management.Model.Book;
import com.example.library_management.Repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> allBook() {
        return bookRepository.findAll();
    }

    public Optional<Book> singleBook(ObjectId Id){
        return bookRepository.findById(Id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
}
