package com.cheng.A9_12;

import java.util.Optional;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 15:18 2018/9/12
 * @Reference:
 */
public class Student {
    private Optional<Bag> bag;

    public Student(Optional<Bag> bag) {
        this.bag = bag;
    }

    public Optional<Bag> getBag() {
        return bag;
    }

    public void setBag(Optional<Bag> bag) {
        this.bag = bag;
    }

    public static void main(String[] args) {

    }

    public String getBookName(Optional<Student> stu) {

        return stu.flatMap(Student::getBag)
                .flatMap(Bag::getBook)
                .flatMap(Book::getName)
                .orElse("unknow");
    }
}

class Bag{
    private Optional<Book> book;

    public Bag(Optional<Book> book) {
        this.book = book;
    }

    public Optional<Book> getBook() {
        return book;
    }

    public void setBook(Optional<Book> book) {
        this.book = book;
    }
}

class Book{
    private Optional<String> name;

    public Book(Optional<String> name) {
        this.name = name;
    }

    public Optional<String> getName() {

        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }
}