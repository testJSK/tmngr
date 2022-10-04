package kir.tm.service;

import kir.tm.entity.UserEntity;
import kir.tm.exception.EntityAlreadyExistException;
import kir.tm.exception.EntityNonFoundException;
import kir.tm.model.User;
import kir.tm.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getOne(Long id) throws EntityNonFoundException {
        UserEntity user = userRepo.findById(id).get();

        if(user == null) {
            throw new EntityNonFoundException("Пользователь не был найден");
        }
        return User.toModel(user);
    }
    public UserEntity registration(UserEntity user) throws EntityAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null) {
            throw  new EntityAlreadyExistException("Пользователь с таким именем уже существует");
        }
        return userRepo.save(user);
    }

    public ArrayList< UserEntity> getAll() {
        return (ArrayList<UserEntity>) userRepo.findAll();
    }

    public Long delete(Long id) {
        userRepo.deleteById(id);
        return id;
    }
}
