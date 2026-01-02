package com.example.SpringTask3.Service;

import com.example.SpringTask3.Entity.User;
import com.example.SpringTask3.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public void add(User user) {
            try{
                userRepo.save(user);

            } catch (RuntimeException e) {
                throw new RuntimeException("Something went wrong");
            }

    }

    @Override
    public User get(int id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> findAll() {
        List<User> all = userRepo.findAll();
        return all;
    }
}
