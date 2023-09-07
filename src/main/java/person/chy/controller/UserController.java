package person.chy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import person.chy.domain.User;
import person.chy.domain.vo.ModelMessage;
import person.chy.service.UserService;
import person.chy.service.impl.UserServiceImpl;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService=new UserServiceImpl();
    @PostMapping("/login")
    ModelMessage getByUserName(@RequestBody User user){
        System.out.println(user);
        return userService.getByUserName(user);
    }

  @PostMapping("/register")
    ModelMessage addUser(@RequestBody User user){
        return userService.addUser(user);
    }


}
