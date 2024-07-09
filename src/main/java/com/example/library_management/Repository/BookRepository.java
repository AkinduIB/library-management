package com.example.library_management.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.library_management.Model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,ObjectId>{
    

}
