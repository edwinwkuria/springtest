package com.ngenx.test.user.controller;
import com.ngenx.test.user.model.User;
import com.ngenx.test.user.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserRepositoryInterface uri;
    @GetMapping("/get_users/{status}")
    public List<User> getAllUsers(@PathVariable("status")String status)
    {
        return uri.findByStatus(status);
    }
    @GetMapping("/get_users/{start}/{end}")
    public List<User> getUsersBetween(@PathVariable("start")String start, @PathVariable("end")String end)
    {
        long longStart = Long.parseLong(start);
        long longEnd = Long.parseLong(end);
        return uri.findByIdBetween(longStart, longEnd);
    }
}
