package person.chy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.chy.mapper.BookDao;
import person.chy.domain.Book;
import person.chy.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAll() {

        return bookDao.getAll();
    }

    @Override
    public Book getById(Integer id) {
//        SimpleDateFormat sdf =new SimpleDateFormat("yy-mm-dd hh:mm:ss");
//        Book book = bookDao.getById(1);
//        book.setPublicationDate(sdf.format(bookDao.getById(1)));
        return bookDao.getById(id);
    }

    @Override
    public Boolean add(Book book) {
//        Book book =new Book();
//        book.setTitle("基督山伯爵");
//        book.setAuthor("大仲马");
//        book.setPublicationDate("2020-06-06 06:06:06");
//        book.setPrice(93);
        return bookDao.add(book);
    }

    @Override
    public Boolean update() {
        return bookDao.update("基督山伯爵",128);
    }

    @Override
    public Boolean delete() {
        return bookDao.delete("1");
    }
}
