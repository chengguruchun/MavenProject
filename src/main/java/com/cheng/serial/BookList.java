package com.cheng.serial;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 10:39 2018/8/24
 * @Reference:
 */

@XmlRootElement
public class BookList {

    @Protobuf(order = 1)
    private List<Book> books;

    public List<Book> getBooks() {

        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookList [books=" + books + "]";
    }

}