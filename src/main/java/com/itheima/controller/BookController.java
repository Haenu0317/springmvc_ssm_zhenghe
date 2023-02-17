package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/14 17:19
 */
@RestController
@RequestMapping("/books")
public class BookController {


    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book=============>" + book);
        return "{'module':'book save success'}";
    }
    @GetMapping
    public List<Book> getAll(){
        Book book1=new Book();
        book1.setType("计算机");
        book1.setName("SpringMvc入门教程");
        book1.setDescription("SpringMvc入门教程描述");
        Book book2=new Book();
        book2.setType("计算机1");
        book2.setName("Spring入门教程");
        book2.setDescription("Spring入门教程描述");
        List<Book> books = Arrays.asList(book1, book2);
        return books;
    }

}
