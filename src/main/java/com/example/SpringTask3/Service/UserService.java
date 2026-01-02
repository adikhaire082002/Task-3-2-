package com.example.SpringTask3.Service;

import com.example.SpringTask3.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void add(User user);
    public User get(int id);
    public void delete(User user);
    public void update(User user);
    public List<User> findAll();
}
