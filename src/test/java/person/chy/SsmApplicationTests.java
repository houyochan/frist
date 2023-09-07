package person.chy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import person.chy.domain.Book;
import person.chy.domain.User;
import person.chy.domain.vo.ModelMessage;
import person.chy.service.BookService;
import person.chy.service.UserService;

import java.util.List;

@SpringBootTest
class SsmApplicationTests {
    @Autowired
    private BookService bookService;
    @Autowired
    UserService userService;
    @Test
    void testGetAll() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
    @Test
    void testGetById() {

//        Book book = bookService.getById(1);
//        System.out.println(book);
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("123");
        ModelMessage name = userService.getByUserName(user1);
        System.out.println(name);

    }
    @Test
    void testAdd() {
        Book book =new Book();
        book.setTitle("1");
        bookService.add(book);
    }
     @Test
    void testUpdate() {
        bookService.update();
    }
     @Test
    void testDelete() {
        bookService.delete();
    }

}
