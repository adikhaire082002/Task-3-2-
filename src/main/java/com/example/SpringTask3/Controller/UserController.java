package com.example.SpringTask3.Controller;

import com.example.SpringTask3.Entity.User;
import com.example.SpringTask3.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Combination of @Controller and @ResponseBody
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody User user){
        userService.add(user);
        return  new ResponseEntity<>("User added successfully",HttpStatus.OK);
    }

    @GetMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestParam int id){
        User user = userService.get(id);
        return  new ResponseEntity<>(user, HttpStatus.FOUND);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<?> getAllUsers(){
        List<User> users = userService.findAll();
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }

}
