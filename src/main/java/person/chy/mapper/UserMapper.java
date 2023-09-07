package person.chy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import person.chy.domain.User;

@Mapper
public interface UserMapper extends BaseMapper {
    @Select("select * from ssm_user where username = #{userName}")
    User getByUserName(String userName);
    @Insert("insert into ssm_user values(null,#{username},#{password})")
    void addUser(User user);
}
