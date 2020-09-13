package com.sb.tiny.labs.web;

import com.sb.tiny.labs.enums.UserSexEnum;
import com.sb.tiny.labs.mapper.UserMapper;
import com.sb.tiny.labs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/addOne")
    public String saveOne(@RequestParam("userName") String userName,
                          @RequestParam("passWord") String passWord,
                          @RequestParam("userSex") String userSex,
                          @RequestParam("nickName") String nickName){
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);

        if(userSex.equals("MAN")){
            user.setUserSex( UserSexEnum.MAN);
        }else{
            user.setUserSex( UserSexEnum.WOMAN);
        }
        user.setNickName(nickName);
        userMapper.insert(user);
        return "保存成功";
    }
    @RequestMapping("/add")
    public void save(User user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public String update(User user) {
        userMapper.update(user);
        return "更新成功!";
    }

    @RequestMapping(value="/delete/{id}")
    public String  delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
        return "删除成功!";
    }

    // 2020:20:16添加
    @RequestMapping(value="/delete1/{id}")
    public String  delete1(@PathVariable("id") Long id) {
        userMapper.delete(id);
        return "删除成功!";
    }

    // 2020:20:25添加
    @RequestMapping(value="/delete2/{id}")
    public String  delete2(@PathVariable("id") Long id) {
        userMapper.delete(id);
        return "删除成功!";
    }

}
