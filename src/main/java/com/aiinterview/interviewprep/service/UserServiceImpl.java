package com.aiinterview.interviewprep.service;

import com.aiinterview.interviewprep.models.User;
import com.aiinterview.interviewprep.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public User createUser(User user){
        return userRepo.save(user);
    }

    @Override
    public List<User>getAllUsers(){
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Long id, User updatedUser){
        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()){
            User existing = optionalUser.get();
            existing.setName(updatedUser.getName());
            existing.setEmail(updatedUser.getEmail());
            existing.setPassword(updatedUser.getPassword());
            return userRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
