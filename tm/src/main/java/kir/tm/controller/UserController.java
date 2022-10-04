package kir.tm.controller;

import kir.tm.entity.UserEntity;
import kir.tm.exception.EntityAlreadyExistException;
import kir.tm.exception.EntityNonFoundException;
import kir.tm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity getOneUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userService.getOne(id));
        } catch (EntityNonFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка пользователь не найден");
        }
    }
    @GetMapping("/all")
    public List<UserEntity> getUsers() {
        try {
            return userService.getAll();
//                    ResponseEntity.ok("Сервер работает");
        } catch (Exception e) {
            return (List<UserEntity>) ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);

            return ResponseEntity.ok("{ \"result\": \"true\", \"msg\": \"Пользователь успешно добавлен\" }");
        } catch (EntityAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка добавления пользователя");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.delete(id));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка удаления пользователя");
        }
    }
}
