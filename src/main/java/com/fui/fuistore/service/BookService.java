package com.fui.fuistore.service;

import com.fui.fuistore.dto.CreateOrUpdateBookDTO;
import com.fui.fuistore.model.BookDO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    boolean createBook(CreateOrUpdateBookDTO validator);

    List<BookDO> getBookByKeyword(String title);

    BookDO getById(Integer id);

    List<BookDO> findAll();

    boolean updateBook(BookDO book, CreateOrUpdateBookDTO validator);

    boolean deleteById(Integer id);
}
