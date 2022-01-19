package com.fui.fuistore.service;

import com.fui.fuistore.dto.CreateOrUpdateBookDTO;
import com.fui.fuistore.model.BookDO;

import java.util.List;


public interface BookService {
    boolean createBook(CreateOrUpdateBookDTO validator);
    List<BookDO> getBookByKeyword(String q);
    BookDO getById(Integer id);
    List<BookDO> findAll();
}
