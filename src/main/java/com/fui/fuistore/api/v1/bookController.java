package com.fui.fuistore.api.v1;

import com.fui.fuistore.exception.http.NotFoundException;
import com.fui.fuistore.model.BookDO;
import com.fui.fuistore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

@RestController
@RequestMapping("/book")
@Validated
public class bookController {
    @Autowired
    private BookService bookService;

    @GetMapping("")
    public List<BookDO> getBooks(){
        List<BookDO> books = bookService.findAll();
        return books;
    }

    @GetMapping("/{id}")
    public BookDO getBook(@PathVariable(value = "id") @Positive(message = "{id.positive}") Integer id) {
        BookDO book = bookService.getById(id);
        if (book == null) {
            throw new NotFoundException(10022);
        }
        return book;
    }

    @GetMapping("/search")
    public List<BookDO> searchBook(@RequestParam(value = "title", required = false, defaultValue = "") String title){
        List<BookDO> books = bookService.getBookByKeyword("%" + title + "%");
        return books;
    }

//    @PutMapping("/{id}")
//    public boolean updateBook;

}
