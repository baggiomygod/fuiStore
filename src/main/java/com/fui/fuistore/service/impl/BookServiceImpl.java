package com.fui.fuistore.service.impl;

import com.fui.fuistore.dto.CreateOrUpdateBookDTO;
import com.fui.fuistore.mapper.BookMapper;
import com.fui.fuistore.model.BookDO;
import com.fui.fuistore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.io.Serializable;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired // 用来装配 Bean，实现依赖注入，可以写在字段、构造方法或 setter 方法上
    private BookMapper bookMapper;

    @Override
    public boolean createBook(CreateOrUpdateBookDTO validator) {
        BookDO book = new BookDO();
        book.setAuthor(validator.getAuthor());
        book.setTitle(validator.getTitle());
        book.setImage(validator.getImage());
        book.setSummary(validator.getSummary());
        return bookMapper.insert(book) > 0;
    }

    @Override
    public List<BookDO> getBookByKeyword(String q) {
        List<BookDO> books = bookMapper.selectByTitleLikeKeyword(q);
        return books;
    }

    @Override
    public BookDO getById(Integer id) {
        BookDO book = (BookDO) bookMapper.selectById(id);
        return book;
    }

    @Override
    public List<BookDO> findAll(){
        List<BookDO> books = bookMapper.selectList(null);
        return books;
    }

    public boolean deleteById(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }
}
