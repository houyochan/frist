package person.chy.service;


import person.chy.domain.User;
import person.chy.domain.vo.ModelMessage;

public interface UserService {
    ModelMessage getByUserName(User user);
    ModelMessage addUser(User user);

}
