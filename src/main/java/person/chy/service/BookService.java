package person.chy.service;

import person.chy.domain.Book;

import java.util.List;

public interface BookService {
   List<Book>  getAll();
   Book getById(Integer id);
   Boolean add(Book book);
   Boolean update();
   Boolean delete();
}
