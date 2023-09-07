package com.example.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}