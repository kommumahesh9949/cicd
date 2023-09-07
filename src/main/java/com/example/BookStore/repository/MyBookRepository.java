package com.example.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}