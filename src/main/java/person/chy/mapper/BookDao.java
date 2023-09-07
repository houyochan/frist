package person.chy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import person.chy.domain.Book;

import java.util.List;

@Mapper
public interface BookDao extends BaseMapper {
    @Select("select * from book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    List<Book> getAll();

    @Insert("insert into book values(null,#{title},#{author},#{publicationDate},#{price})")
    Boolean add(Book book);

    @Update("update book set price = #{price} where title = #{title}")
    Boolean update(String title,Integer price);

    @Delete("delete from book where title = #{title}")
    Boolean delete(String title);
}
