package person.chy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import person.chy.mapper.BookDao;
import person.chy.domain.Book;
import person.chy.service.BookService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
        return books;
    }
    @GetMapping("/{id}")
    public Book getByid(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return book;
    }

    @PostMapping
    public Boolean add(@RequestBody Book book){
        return bookService.add(book);
    }

    @PutMapping
    public Boolean update(){
        return bookService.update();
    }
    @DeleteMapping
    public Boolean delete(){
        return bookService.delete();
    }

}
