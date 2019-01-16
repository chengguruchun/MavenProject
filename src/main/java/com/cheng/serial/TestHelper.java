package com.cheng.serial;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:44 2018/8/24
 * @Reference:
 */
import java.util.ArrayList;
import java.util.List;



public class TestHelper {
    public static BookList buildBookList(int count){
        BookList bookList = new BookList();
        List<Book> books = new ArrayList<Book>();
        for	(int i=0; i<count; i++){
            books.add(buildBook(i));
        }
        bookList.setBooks(books);
        return bookList;
    }

    public static Book buildBook(int id){
        Book book = new Book();
        book.setAddress("Peking");
        book.setBuyer("hello");
        book.setId(id);
        book.setName("Netty");
        return book;
    }
}