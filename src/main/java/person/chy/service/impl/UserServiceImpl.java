package person.chy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.chy.domain.User;
import person.chy.domain.vo.ModelMessage;
import person.chy.mapper.UserMapper;
import person.chy.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    private static ModelMessage mm=new ModelMessage();
    @Override
    public ModelMessage getByUserName(User user) {
        User u = userMapper.getByUserName(user.getUsername());
        mm.setObject(u);
        if (u==null){
            mm.setCode(0);
            mm.setMsg("该用户不存在");
            return mm;
        }
        if (!u.getPassword().equals(user.getPassword())){
            mm.setCode(0);
            mm.setMsg("用户输入密码不正确");
            return mm;
        }
        mm.setMsg("登陆成功！！");
        return mm;
    }

    @Override
    public ModelMessage addUser(User user) {
        User u = userMapper.getByUserName(user.getUsername());
        if (u==null){
           userMapper.addUser(user);
           mm.setMsg("注册成功");
           mm.setObject(user);
            return mm;
        }
        mm.setCode(0);
        mm.setMsg("该用户已存在");
        return mm;
    }
}
